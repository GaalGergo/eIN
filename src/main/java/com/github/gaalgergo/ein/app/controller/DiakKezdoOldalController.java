package com.github.gaalgergo.ein.app.controller;

import com.github.gaalgergo.ein.app.entity.JegybeirasEntity;
import com.github.gaalgergo.ein.app.entity.TantargyEntity;
import com.github.gaalgergo.ein.app.repository.JegybeirasRepository;
import com.github.gaalgergo.ein.app.spring.SpringEinFelhasznalo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        Map<String, List<JegybeirasEntity>> jegybeirasokTantargyankent = jegybeirasok
            .stream()
            .collect(Collectors.groupingBy(j -> j.getTantargy().getNev()));

        Map<String, Double> átlagok = new HashMap<>();
        for (Map.Entry<String, List<JegybeirasEntity>> entry: jegybeirasokTantargyankent.entrySet()) {
            double jegyosszeg = entry.getValue().stream().mapToDouble(j -> j.getErdemjegy()).sum();
            double atlag = jegyosszeg / entry.getValue().size();
            átlagok.put(entry.getKey(), atlag);
        }

        modelAndView.addObject("jegybeirasok", jegybeirasok);
        modelAndView.addObject("átlagok", átlagok);

        return modelAndView;
    }

    private SpringEinFelhasznalo getFelhasznalo() {
        return (SpringEinFelhasznalo) SecurityContextHolder
            .getContext()
            .getAuthentication()
            .getPrincipal();
    }
}
