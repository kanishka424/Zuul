package com.fluffy.patientservice;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @RequestMapping("/patients")
    public String getPatients(){
        return "List of Patients";
    }
}
