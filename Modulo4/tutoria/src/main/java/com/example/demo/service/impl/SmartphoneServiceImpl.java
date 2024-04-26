package com.example.demo.service.impl;

import com.example.demo.dao.SmartphoneDao;
import com.example.demo.entity.Smartphone;
import com.example.demo.request.RequestElectronic;
import com.example.demo.service.SmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SmartphoneServiceImpl implements SmartphoneService {
    @Autowired
    SmartphoneDao smartphoneDao;
    @Override
    public Smartphone crearSmartphone(RequestElectronic requestElectronic) {
        Optional<Smartphone> smartphoneOptional = smartphoneDao.findByModelo(requestElectronic.getModelo());
        if(smartphoneOptional.isPresent())
        {
            return null;
        }
        else {
            Smartphone smartphone = new Smartphone();
            smartphone.setBrand(requestElectronic.getBrand());
            smartphone.setAnio(requestElectronic.getAnio());
            smartphone.setCamera(requestElectronic.getCamera());
            smartphone.setRam(requestElectronic.getRam());
            smartphone.setModelo(requestElectronic.getModelo());
            smartphone.setPrice(requestElectronic.getPrice());
            return smartphoneDao.save(smartphone);
        }
    }

    @Override
    public Smartphone updateSmartphone(Long id, RequestElectronic requestElectronic) {
        Smartphone smartphone = findById(id);
        if(smartphone!=null)
        {
            smartphone.setBrand(requestElectronic.getBrand());
            smartphone.setAnio(requestElectronic.getAnio());
            smartphone.setCamera(requestElectronic.getCamera());
            smartphone.setRam(requestElectronic.getRam());
            smartphone.setModelo(requestElectronic.getModelo());
            smartphone.setPrice(requestElectronic.getPrice());
            return smartphoneDao.save(smartphone);
        }
        return null;
    }

    @Override
    public Smartphone updatePrice(Long id, RequestElectronic requestElectronic) {
        Smartphone smartphone = smartphoneDao.findById(id).orElseGet(null);
        if(smartphone!=null)
        {
            smartphone.setPrice(requestElectronic.getPrice());
            return smartphoneDao.save(smartphone);
        }
        return null;
    }
    @Override
    public Smartphone findById(Long id) {
        return smartphoneDao.findById(id).orElse(null);
    }

    @Override
    public List<Smartphone> getAll() {
        List<Smartphone> smartphoneList = new ArrayList<>();
        smartphoneList = smartphoneDao.findAll();
        return smartphoneList;
    }

    @Override
    public boolean deleteSmartphone(Long id) {
        return false;
    }
}
