package com.example.demo3;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexAppliaction {

    @RequestMapping("/say")
    public String say(){
        return "hello world";
    }
}
