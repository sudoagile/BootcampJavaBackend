package com.example.demo.service.impl;

import com.example.demo.dao.SmartphoneDao;
import com.example.demo.entity.Smartphone;
import com.example.demo.request.RequestElectronic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneServiceImplTest {

    @Mock
    SmartphoneDao smartphoneDao;
    @InjectMocks
    SmartphoneServiceImpl smartphoneService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        smartphoneService = new SmartphoneServiceImpl(smartphoneDao);
    }

    @Test
    void crearSmartphone() {
        RequestElectronic requestElectronic = new RequestElectronic(2020,
                "Redmi 15",
                1999,
                "ZBSN",
                "8",
                "10Mp");
        Smartphone smartphoneReturn = new Smartphone();
        smartphoneReturn.setId(1L);
        smartphoneReturn.setAnio(2020);
        smartphoneReturn.setBrand("Redmi 15");
        smartphoneReturn.setPrice(1999);
        smartphoneReturn.setModelo("ZBSN");
        smartphoneReturn.setRam("8");
        smartphoneReturn.setCamera("10");

        Mockito.when(smartphoneDao.findByModelo(Mockito.anyString())).thenReturn(Optional.empty());
        Mockito.when(smartphoneDao.save(Mockito.any(Smartphone.class))).thenReturn(smartphoneReturn);

        Smartphone smartphoneSaved = smartphoneService.crearSmartphone(requestElectronic);
        assertEquals(smartphoneSaved.getAnio(),requestElectronic.getAnio());
        assertEquals(smartphoneSaved.getModelo(),requestElectronic.getModelo());
        assertNotNull(smartphoneSaved.getId());

    }

    @Test
    void crearSmartphoneFailed() {
    }

    @Test
    void updatePrice() {
    }

    @Test
    void findById() {
    }

    @Test
    void getAll() {
    }

    @Test
    void deleteSmartphone() {
    }
}