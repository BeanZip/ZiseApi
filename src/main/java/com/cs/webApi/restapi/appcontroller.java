package com.cs.webApi.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class appcontroller {
    static Scanner scol = new Scanner(System.in);
    private static final String template = "Welcome Mr. %s;";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/app")
    public AppResource app(@RequestParam(value = "name", defaultValue = "John doe") String name) {
        name = "John";
        return new AppResource(String.format(template, name));
    }
}
