package lk.ijse.dep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class MyController {

    @GetMapping
    public String getMethod(){
        return "Hello, Welcome to Spring WEB MVC...!";
    }

}
