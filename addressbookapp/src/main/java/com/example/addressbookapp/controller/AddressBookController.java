package com.example.addressbookapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class AddressBookController {
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
    @PostMapping("/add")
    public String add(){
        return "Added";
    }
    @PutMapping("/update")
    public String update(){
        return "Updated";
    }
    @GetMapping("/all")
    public String all(){
        return "All data";
    }
    @GetMapping("/check")
    public String check(){
        return "Element present";
    }
    @DeleteMapping("/delete")
    public String delete(){
        return "Element deleted";
    }
}