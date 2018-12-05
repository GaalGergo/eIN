package com.github.gaalgergo.ein.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OldalController {

    @GetMapping(path = "/")
    public String kezdo() {
        return "kezdooldal";
    }

    @GetMapping(path = "/diak")
    public String diakkezdo() {
        return "diak-kezdooldal";
    }
}
