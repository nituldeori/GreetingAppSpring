package com.myfirstapp.demo.controller;

import com.myfirstapp.demo.mode.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Hello")
public class FirstApplication {


    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "  Hello From Rest sayHello";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "fName") String fName, @RequestParam(value = "lName") String lName){
        return "Hello " + fName + " " + lName + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello1(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello " + firstName + " " + lastName + "!";
    }


}

