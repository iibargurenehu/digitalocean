package eus.ehu.iibarguren.digitalocean.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class TestController {

    @GetMapping("/test")
    String saludo() {
        return "Hola holita vecinito";
    }
}