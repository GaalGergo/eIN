package com.github.gaalgergo.ein.app.controller;

import com.github.gaalgergo.ein.app.entity.FelhasznaloEntity;
import com.github.gaalgergo.ein.app.entity.FelhasznaloTipus;
import com.github.gaalgergo.ein.app.repository.FelhasznaloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class OldalController {

    @Autowired
    private FelhasznaloRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    @GetMapping(path = "/")
    public String kezdo() {
        return "kezdooldal";
    }

    @GetMapping(path = "/reg")
    public ModelAndView reg() {
        ModelAndView modelAndView = new ModelAndView("regisztracio");
        List<String> tipusok = Arrays.stream(FelhasznaloTipus.values())
                .map(t -> t.name())
                .collect(Collectors.toList());

        FelhasznaloEntity felhasznaloEntity = new FelhasznaloEntity();
        modelAndView.addObject("felhasznalo", felhasznaloEntity);
        modelAndView.addObject("tipusok", tipusok);
        return modelAndView;
    }

    @PostMapping(path = "/reg")
    public String regpost(final FelhasznaloEntity felhasznalo) {
        felhasznalo.setJelszo(this.encoder.encode(felhasznalo.getJelszo()));
        this.repository.save(felhasznalo);
        return "kezdooldal";
    }

    @GetMapping(path = "/oktato")
    public String oktatoKezdo() {
        return "oktato-kezdooldal";
    }

    @GetMapping(path = "/tanulo")
    public String diakKezdo() {
        return "diak-kezdooldal";
    }
}
