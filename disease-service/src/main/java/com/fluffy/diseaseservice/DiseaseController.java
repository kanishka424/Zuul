package com.fluffy.diseaseservice;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiseaseController {

    @RequestMapping("/diseases")
    public String getDiseases(){
        return "List of diseases";
    }
}
