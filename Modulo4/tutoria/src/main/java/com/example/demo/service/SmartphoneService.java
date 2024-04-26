package com.example.demo.service;

import com.example.demo.dao.SmartphoneDao;
import com.example.demo.entity.Smartphone;
import com.example.demo.request.RequestElectronic;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SmartphoneService {
    Smartphone crearSmartphone(RequestElectronic requestElectronic);
    Smartphone updateSmartphone(Long id, RequestElectronic requestElectronic);
    Smartphone updatePrice(Long id, RequestElectronic requestElectronic);
    Smartphone findById(Long id);
    List<Smartphone> getAll();
    boolean deleteSmartphone(Long id);
}
