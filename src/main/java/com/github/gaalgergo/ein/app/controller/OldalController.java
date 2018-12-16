package com.github.gaalgergo.ein.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OldalController {

    @GetMapping(path = "/")
    public String kezdo() {
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
