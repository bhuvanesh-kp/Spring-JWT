package org.bhuvanesh.jwtdemo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingPage {
    @GetMapping("api/public")
    public String GetHello(){
        return "Hello World";
    }
}
