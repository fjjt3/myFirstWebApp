package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHallo(){
        return "Hallo! Was lernst du Heute?";
    }
}
