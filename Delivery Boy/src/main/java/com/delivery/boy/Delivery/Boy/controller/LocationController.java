package com.delivery.boy.Delivery.Boy.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.boy.Delivery.Boy.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;
    
    @GetMapping("/update/{location}")
    public ResponseEntity<?> updateLocation(@PathVariable String location){
        System.out.println("longitude: helooo");
        this.kafkaService.updateLocation(location);
        return new ResponseEntity<>(Map.of("message","location updated"),HttpStatus.OK);
    }

}
