package com.example.stbe.demostbe.controllers;

import com.example.stbe.demostbe.model.Customer;
import com.example.stbe.demostbe.repositories.CustomerRepository;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
public class RestCustomerController {

    @Autowired()
    private CustomerRepository repository;

    @RequestMapping("/add")
    public String addCustomer()
    {
        Customer s = new Customer("stbe", "stbe211");
        repository.save(s);
        return "Saved " + s.getFirstName() ;
    }

    @RequestMapping("/saveMap")
    public String addCustomers()
    {
        Customer s = new Customer("stbe", "stbe211");
        Customer s1 = new Customer("stbe1", "stbe211");
        Customer s2 = new Customer("stbe2", "stbe211");
        Customer s3 = new Customer("stbe3", "stbe211");
        Customer[] cs = new Customer[]{s,s1,s2,s3};
        List<Customer> iterable = Arrays.asList(cs);
        repository.saveAll(iterable);
        return "Saved " +  iterable.toString();
    }

    @RequestMapping("/all")
    public String  getAll(){
        return  repository.findAll().toString();
    }

//    @RequestMapping("/byName")
//    public String  getAll(@RequestParam( value="name")String name){
//        return  repository.findByLastName(name).toString();
//    }
}
