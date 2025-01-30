package com.example.demo.controller;


import com.example.demo.service.HngService;
import com.example.demo.model.HngModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HngController {

    private final HngService hngService;

    public HngController(HngService hngService) {
        this.hngService = hngService;
    }

    @GetMapping
    public ResponseEntity<HngModel> getApiInfo() {
        return new ResponseEntity<>(hngService.getApiInfo(), HttpStatus.OK);
    }


}
