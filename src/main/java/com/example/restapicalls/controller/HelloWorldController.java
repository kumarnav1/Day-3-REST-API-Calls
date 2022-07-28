package com.example.restapicalls.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello World!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello  " + name + "!";
    }

    @RequestMapping(value = {"/twoquery"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "fname") String fname, @RequestParam(value = "lname") String lname) {
        return "Hello  " + fname + "  " + lname + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name + "!";
    }
}