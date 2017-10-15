package com.chandana.helloworld;

import com.chandana.helloworld.bean.Greeting;
import com.chandana.helloworld.bean.Human;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }

    @RequestMapping("/hello/{name}")
    public Greeting message(@PathVariable String name) {

        Human hum = new Human("Kostra", "Debil");
        Greeting  msg = new Greeting(name, "Hello " + name, 23, hum);

        return msg;
    }

    @RequestMapping("/cau")
    public Greeting message1() {
        Human hum = new Human("Kostra", "Debil");
        Greeting  msg = new Greeting("Petr", "Hello ", 23, hum);

        return msg;
    }

}