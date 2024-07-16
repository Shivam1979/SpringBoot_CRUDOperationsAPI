package com.example.SpringBoot_CRUDOperationsAPI.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/health")
    public String healthCheck(){
        return "Port is working ...";
    }

    @GetMapping("/health-check")
    public String healthCheck2(){
        return "health-check is running properly";
    }
}
