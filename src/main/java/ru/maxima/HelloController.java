package ru.maxima;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class HelloController {
        @GetMapping("/hello")
        public String sayHello() {
            return "hello-world";
        }
        @GetMapping("/hello-user")
        public String sayHelloUser() {
            return "user";
        }
    }
