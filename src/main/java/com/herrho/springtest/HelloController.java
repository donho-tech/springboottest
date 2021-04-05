package com.herrho.springtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("account")
    public com.herrho.junitdemo.Account account() {
        return new com.herrho.junitdemo.Account("girokonto", BigDecimal.ONE);
    }
}
