package com.example.restapicalls.controller;

import com.example.restapicalls.model.User;
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
    public String sayHello(@RequestParam(value = "fName") String fName, @RequestParam(value = "lName") String lName) {
        return "Hello  " + fName + "  " + lName + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }
}