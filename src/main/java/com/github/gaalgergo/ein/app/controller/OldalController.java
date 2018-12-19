package com.github.gaalgergo.ein.app.controller;

import com.github.gaalgergo.ein.app.entity.TanOraEntity;
import com.github.gaalgergo.ein.app.repository.JegybeirasRepository;
import com.github.gaalgergo.ein.app.repository.TanoraRepository;
import com.github.gaalgergo.ein.app.spring.SpringEinFelhasznalo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class OldalController {

    @Autowired
    private JegybeirasRepository jegybeirasRepository;

    @Autowired
    private TanoraRepository tanoraRepository;

    @GetMapping(path = "/")
    public String kezdo() {
        return "kezdooldal";
    }

    @GetMapping(path = "/oktato")
    public ModelAndView oktatoKezdo() {
        ModelAndView modelAndView = new ModelAndView("oktato-kezdooldal");
        SpringEinFelhasznalo felhasznalo = (SpringEinFelhasznalo) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();

        Integer jegybeirasok = jegybeirasRepository.findByOktato(felhasznalo.getFelhasznaloEntity()).size();
        TanOraEntity kovetkezoTanora = tanoraRepository.findFirstByOktatoAndIdopontAfterOrderByIdopont(
                felhasznalo.getFelhasznaloEntity(),
                LocalDateTime.now());

        modelAndView.addObject("jegybeirasok", jegybeirasok);
        modelAndView.addObject("tanora", kovetkezoTanora);

        return modelAndView;
    }

    @GetMapping(path = "/tanulo")
    public String diakKezdo() {
        return "diak-kezdooldal";
    }
}
