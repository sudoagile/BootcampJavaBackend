package com.example.demo.controller;

import com.example.demo.entity.Smartphone;
import com.example.demo.request.RequestElectronic;
import com.example.demo.service.SmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/smartphone")
public class SmartphoneController {
    @Autowired
    SmartphoneService smartphoneService;
    @GetMapping("/getSmartphone/{id}")
    Smartphone getSmartphone(@PathVariable Long id)
    {
        return smartphoneService.findById(id);
    }
    @PostMapping("/addSmartphone")
    Smartphone addSmartphone(@RequestBody RequestElectronic requestElectronic)
    {
        return smartphoneService.crearSmartphone(requestElectronic);
    }
    @PutMapping("/updateSmartphone/{id}")
    Smartphone updateSmartphone(@PathVariable Long id, @RequestBody RequestElectronic requestElectronic)
    {
        return smartphoneService.updateSmartphone(id, requestElectronic);
    }
    @PatchMapping("/udpatePrice/{id}")
    Smartphone updatePrice(@PathVariable Long id, @RequestBody RequestElectronic requestElectronic)
    {
        return smartphoneService.updatePrice(id, requestElectronic);
    }
    @GetMapping("/findAll")
    List<Smartphone> findAllSmartphones()
    {
        return smartphoneService.getAll();
    }

}
