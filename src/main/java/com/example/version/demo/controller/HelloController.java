package com.example.version.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping()
    public String getHello() {
        log.info("Received request for hello endpoint dafault version");
        return "Hello from Version default!";
    }

    @GetMapping(version = "1.1")
    public String getHello1_1() {
        log.info("Received request for hello endpoint 1.1 version");
        return "Hello from Version 1.1!";
    }

    @GetMapping(version = "1.2+")
    public String ggetHello1_2() {
        log.info("Received request for hello endpoint 1.2 version");
        return "Hello from Version 1.2!";
    }

    @GetMapping(version = "1.5")
    public String getHello1_5() {
        log.info("Received request for hello endpoint 1.5 version");
        return "Hello from Version 1.5!";
    }
}
