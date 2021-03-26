package com.fluffy.doctorservice;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @RequestMapping("/doctors")
    public String getDoctor(){
        return "List of Docs";
    }

}
