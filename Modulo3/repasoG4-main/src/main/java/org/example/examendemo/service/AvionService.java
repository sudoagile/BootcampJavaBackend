package org.example.examendemo.service;

import org.example.examendemo.dto.AvionDto;
import org.example.examendemo.entity.Aerolinea;
import org.example.examendemo.entity.Avion;
import org.example.examendemo.repository.AerolineaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AvionService {
    @Autowired
    AerolineaRepository aerolineaRepository;
    public Avion create(AvionDto avionDto)
    {

        Optional<Aerolinea> optionalAerolinea = aerolineaRepository.findById(avionDto.getIdAerolinea());
        return null;
    }
    private boolean validateAvion(AvionDto avionDto)
    {
        if(avionDto.getModelo()!=null && avionDto.getCapacidad()>0)
        {
            return true;
        }
        else {

            return false;
        }
    }
}
