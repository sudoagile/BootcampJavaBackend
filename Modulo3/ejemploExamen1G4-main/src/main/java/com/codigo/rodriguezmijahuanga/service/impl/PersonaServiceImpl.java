package com.codigo.rodriguezmijahuanga.service.impl;

import com.codigo.rodriguezmijahuanga.dao.PersonaRepository;
import com.codigo.rodriguezmijahuanga.entity.PersonaEntity;
import com.codigo.rodriguezmijahuanga.service.PersonaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    //Guardar en BD
    @Override
    public PersonaEntity crear(PersonaEntity personaEntity) {
        return personaRepository.save(personaEntity) ;
    }

    //Buscar por Id
    @Override
    public Optional<PersonaEntity> buscarPorId(Long id) {
        return personaRepository.findById(id);
    }

    //buscar Todos
    @Override
    public List<PersonaEntity> buscarTodos() {
        return personaRepository.findAll();
    }

    //Actualizar
    @Override
    public PersonaEntity actualizar(Long id, PersonaEntity personaEntity) {
        Optional<PersonaEntity> personaRecuperada = personaRepository.findById(id);
        if(personaRecuperada.isPresent()){
            PersonaEntity persona = personaRecuperada.get();
            persona.setMombres(personaEntity.getMombres());
            persona.setApellidos(personaEntity.getApellidos());
            persona.setNumDoc(personaEntity.getNumDoc());
            persona.setTipoDoc(personaEntity.getTipoDoc());
            return personaRepository.save(persona);
        }
        return null;
    }

    //Eliminar de manera Logicas
    @Override
    public PersonaEntity borrar(Long id) {
        Optional<PersonaEntity> personaRecuperada = personaRepository.findById(id);
        if(personaRecuperada.isPresent()){
            personaRecuperada.get().setEstado(0);
            return personaRepository.save(personaRecuperada.get());
        }
        return null;
    }
}
