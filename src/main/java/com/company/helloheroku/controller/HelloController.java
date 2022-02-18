package com.company.helloheroku.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    @ResponseStatus(value = HttpStatus.OK)
    public String hello() {
        return "Hello From Heroku";
    }

}
