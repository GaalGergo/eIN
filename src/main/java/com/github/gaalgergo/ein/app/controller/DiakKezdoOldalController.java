package com.github.gaalgergo.ein.app.controller;

import com.github.gaalgergo.ein.app.entity.JegybeirasEntity;
import com.github.gaalgergo.ein.app.repository.JegybeirasRepository;
import com.github.gaalgergo.ein.app.spring.SpringEinFelhasznalo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(path = "/tanulo")
public class DiakKezdoOldalController {

    @Autowired
    private JegybeirasRepository jegybeirasRepository;

    @GetMapping(path = "")
    public ModelAndView diakKezdo() {
        ModelAndView modelAndView = new ModelAndView("diak-kezdooldal");
        SpringEinFelhasznalo felhasznalo = getFelhasznalo();

        List<JegybeirasEntity> jegybeirasok = jegybeirasRepository.findByTanulo(felhasznalo.getFelhasznaloEntity());
        Double atlag = jegybeirasok.stream().mapToInt(j -> j.getErdemjegy()).sum() / new Double(jegybeirasok.size());
        modelAndView.addObject("jegybeirasok", jegybeirasok);
        modelAndView.addObject("átlag", atlag);

        return modelAndView;
    }

    private SpringEinFelhasznalo getFelhasznalo() {
        return (SpringEinFelhasznalo) SecurityContextHolder
            .getContext()
            .getAuthentication()
            .getPrincipal();
    }
}
