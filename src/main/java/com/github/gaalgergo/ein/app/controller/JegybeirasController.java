package com.github.gaalgergo.ein.app.controller;

import com.github.gaalgergo.ein.app.entity.FelhasznaloTipus;
import com.github.gaalgergo.ein.app.entity.JegybeirasEntity;
import com.github.gaalgergo.ein.app.repository.FelhasznaloRepository;
import com.github.gaalgergo.ein.app.repository.JegybeirasRepository;
import com.github.gaalgergo.ein.app.repository.TantargyRepository;
import com.github.gaalgergo.ein.app.spring.SpringEinFelhasznalo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
@RequestMapping(path = "/oktato/jegybeiras")
public class JegybeirasController {

    @Autowired
    private FelhasznaloRepository felhasznaloRepository;

    @Autowired
    private TantargyRepository tantargyRepository;

    @Autowired
    private JegybeirasRepository jegybeirasRepository;

    @GetMapping(path = "")
    public ModelAndView jegyLista() {
        ModelAndView modelAndView = new ModelAndView("jegybeiras/jegy-lista");
        modelAndView.addObject("jegyek", jegybeirasRepository.findAll());
        return modelAndView;
    }

    @GetMapping(path = "/szerkeszt")
    public ModelAndView jegybeiras(final Long azon) {
        SpringEinFelhasznalo felhasznalo = (SpringEinFelhasznalo) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();


        JegybeirasEntity jegybeirasEntity = new JegybeirasEntity();
        if (azon != null) {
            jegybeirasEntity = jegybeirasRepository.getOne(azon);
        } else {
            jegybeirasEntity.setOktato(felhasznalo.getFelhasznaloEntity());
            jegybeirasEntity.setErdemjegy(1);
        }

        JegybeirasForm jegybeirasForm = new JegybeirasForm();
        jegybeirasForm.setJegybeirasEntity(jegybeirasEntity);

        ModelAndView modelAndView = new ModelAndView("jegybeiras/jegybeiras-szerkeszt");
        modelAndView.addObject("tantargyak", tantargyRepository.findAll());
        modelAndView.addObject("tanulok", felhasznaloRepository.findByTipus(FelhasznaloTipus.TANULO));
        modelAndView.addObject("jegy", jegybeirasForm);

        return modelAndView;
    }

    @PostMapping(path = "/szerkeszt")
    public String jegybeirasPost(final JegybeirasForm jegybeirasForm) {
        JegybeirasEntity entity = jegybeirasForm.getJegybeirasEntity();

        SpringEinFelhasznalo felhasznalo = (SpringEinFelhasznalo) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();

        entity.setIdopont(LocalDateTime.now());
        entity.setTanulo(felhasznaloRepository.getOne(entity.getTanulo().getAzon()));
        entity.setTantargy(tantargyRepository.getOne(entity.getTantargy().getAzon()));
        entity.setOktato(felhasznalo.getFelhasznaloEntity());
        System.out.println(entity);
        jegybeirasRepository.save(entity);

        return "redirect:/oktato/jegybeiras";
    }

    @PostMapping(path = "/torol")
    public String torol(final Long azon) {
        jegybeirasRepository.deleteById(azon);
        return "redirect:/oktato/jegybeiras";
    }
}
