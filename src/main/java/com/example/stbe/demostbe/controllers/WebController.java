package com.example.stbe.demostbe.controllers;

import com.example.stbe.demostbe.repositories.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class WebController
{
    private CustomerRepository customerRepository;

    WebController(CustomerRepository repository)
    {
        this.customerRepository= repository;
    }
    @GetMapping("/hello")
    public String sayHi(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        model.addAttribute("name", name);
        return "hello";
    }
//
//    @GetMapping("/")
//    public String ind()
//    {
//        return "index";
//    }

}
