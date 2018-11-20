package com.github.gaalgergo.ein.app.kezdooldal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KezdoOldalController {

    @GetMapping(path = "/")
    public String get() {
        return "kezdooldal";
    }
}
