package com.github.gaalgergo.ein.app.controller;

import com.github.gaalgergo.ein.app.entity.FelhasznaloEntity;
import com.github.gaalgergo.ein.app.entity.FelhasznaloTipus;
import com.github.gaalgergo.ein.app.repository.FelhasznaloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

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
    public String reg(final Model model) {
        FelhasznaloEntity felhasznaloEntity = new FelhasznaloEntity();
        model.addAttribute("felhasznalo", felhasznaloEntity);
        model.addAttribute("tipusok", new ArrayList<String>(){{ add("OKTATO"); add("TANULO"); }});
        return "regisztracio";
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
