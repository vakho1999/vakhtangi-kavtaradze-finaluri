package com.example.finaluri2.Controller;


import com.example.finaluri2.Service.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller {

    @Autowired
    service modelService;

    @PostMapping("/addModel")
    public AddModelOut addModel(@RequestBody AddModelIN addModelInput) {
        return service.AddModel(addModelInput);
    }

    @PostMapping("/deleteModel")
    public DeleteModelOut deleteModel(@RequestBody DeleteModelIN deleteModelInput) {
        return service.DeleteModel(deleteModelInput);
    }

    @PostMapping("/getModel")
    public GetModelOut getModels(@RequestBody GetModelIN getModelInput) {
        return service.getModels(getModelInput);
    }

}