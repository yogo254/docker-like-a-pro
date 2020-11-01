package com.yogo.dockerdemo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoControler
 */

@RequestMapping("/api/demo")
@RestController
public class DemoControler {

    @GetMapping

    public String getDefault() {
        return "Docker Demo  Running ...";
    }

}