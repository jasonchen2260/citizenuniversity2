package tw.b2b2c.citizenuniversity2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tw.b2b2c.citizenuniversity2.model.Application;
import tw.b2b2c.citizenuniversity2.service.ApplicationProcessor;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationProcessor applicationProcessor;

    @PostMapping("/submit")
    public String submitApplication(@RequestBody Application application) {
        applicationProcessor.processApplication(application);
        return "Application submitted successfully";
    }
}