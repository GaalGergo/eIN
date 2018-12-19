package com.github.gaalgergo.ein.app.controller;

import com.github.gaalgergo.ein.app.entity.TanOraEntity;
import com.github.gaalgergo.ein.app.repository.TanoraRepository;
import com.github.gaalgergo.ein.app.repository.TantargyRepository;
import com.github.gaalgergo.ein.app.spring.SpringEinFelhasznalo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/oktato/tanorak")
public class TanoraController {

    @Autowired
    private TanoraRepository tanoraRepository;

    @Autowired
    private TantargyRepository tantargyRepository;

    @GetMapping(path = "")
    public ModelAndView tanoraLista() {
        SpringEinFelhasznalo felhasznalo = (SpringEinFelhasznalo) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();

        ModelAndView modelAndView = new ModelAndView("tanorak/tanora-lista");
        modelAndView.addObject("tanorak", tanoraRepository.findByOktato(felhasznalo.getFelhasznaloEntity()));

        return modelAndView;
    }

    @GetMapping(path = "/szerkeszt")
    public ModelAndView jegybeiras(final Long azon) {
        SpringEinFelhasznalo felhasznalo = (SpringEinFelhasznalo) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();


        TanOraEntity tanOraEntity = new TanOraEntity();
        if (azon != null) {
            tanOraEntity = tanoraRepository.getOne(azon);
        } else {
            tanOraEntity.setOktato(felhasznalo.getFelhasznaloEntity());
        }

        ModelAndView modelAndView = new ModelAndView("tanorak/tanora-szerkeszt");
        modelAndView.addObject("tantargyak", tantargyRepository.findAll());
        modelAndView.addObject("tanora", tanOraEntity);

        return modelAndView;
    }

    @PostMapping(path = "/szerkeszt")
    public String tanoraPost(final TanOraEntity tanOraEntity) {
        SpringEinFelhasznalo felhasznalo = (SpringEinFelhasznalo) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();

        tanOraEntity.setTantargy(tantargyRepository.getOne(tanOraEntity.getTantargy().getAzon()));
        tanOraEntity.setOktato(felhasznalo.getFelhasznaloEntity());
        tanoraRepository.save(tanOraEntity);

        return "redirect:/oktato/tanorak";
    }

    @PostMapping(path = "/torol")
    public String torol(final Long azon) {
        tanoraRepository.deleteById(azon);
        return "redirect:/oktato/tanorak";
    }
}
