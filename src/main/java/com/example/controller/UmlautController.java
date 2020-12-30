package com.example.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class UmlautController {
    @Get
    String getWord() {
        System.out.println("Glück");
        return "Glück";
    }
}
