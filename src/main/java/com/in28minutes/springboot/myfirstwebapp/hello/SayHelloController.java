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

    @RequestMapping("/hello-html")
    @ResponseBody
    public String sayHalloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> Mein erst Html Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Mein erst Html Page mit Body wechsel");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }

}
