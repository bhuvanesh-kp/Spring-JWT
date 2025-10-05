package org.bhuvanesh.jwtdemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingPage {
    @GetMapping("/hello")
    public String GetHello(){
        return "Hello World";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String GetUser(){
        return "Hello user";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String GetAdmin(){
        return "Hello admin";
    }
}
