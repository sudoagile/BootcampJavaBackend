package com.codigo.persistencia.service


import lombok.AllArgsConstructor
import org.springframework.stereotype.Service

import org.springframework.transaction.annotation.Transactional

@Service
@AllArgsConstructor
class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    @Transactional
    public Categoria registrarCategoria(Categoria categoria)
    {
        return categoriaRepository.save(categoria);

    }

}