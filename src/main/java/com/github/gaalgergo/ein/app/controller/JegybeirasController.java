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
    public ModelAndView jegybeiras() {
        SpringEinFelhasznalo felhasznalo = (SpringEinFelhasznalo) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();

        JegybeirasEntity jegybeirasEntity = new JegybeirasEntity();
        jegybeirasEntity.setOktato(felhasznalo.getFelhasznaloEntity());

        JegybeirasForm jegybeirasForm = new JegybeirasForm();
        jegybeirasForm.setJegybeirasEntity(jegybeirasEntity);

        ModelAndView modelAndView = new ModelAndView("jegybeiras/jegybeiras");
        modelAndView.addObject("tantargyak", tantargyRepository.findAll());
        modelAndView.addObject("tanulok", felhasznaloRepository.findByTipus(FelhasznaloTipus.TANULO));
        modelAndView.addObject("jegy", jegybeirasForm);

        return modelAndView;
    }

    @PostMapping(path = "")
    public String jegybeirasPost(final JegybeirasForm jegybeirasForm) {
        JegybeirasEntity entity = jegybeirasForm.getJegybeirasEntity();

        entity.setIdopont(LocalDateTime.now());
        entity.setTanulo(felhasznaloRepository.getOne(jegybeirasForm.getTanuloId()));
        entity.setOktato(felhasznaloRepository.getOne(jegybeirasForm.getTantargyId()));
        jegybeirasRepository.save(entity);

        return "oktato-kezdooldal";
    }
}
