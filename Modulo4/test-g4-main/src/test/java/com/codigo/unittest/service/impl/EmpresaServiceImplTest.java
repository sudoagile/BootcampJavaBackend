package com.codigo.unittest.service.impl;

import com.codigo.unittest.aggregates.constants.Constants;
import com.codigo.unittest.aggregates.request.EmpresaRequest;
import com.codigo.unittest.aggregates.response.BaseResponse;
import com.codigo.unittest.dao.EmpresaRepository;
import com.codigo.unittest.entity.Empresa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.sql.Timestamp;
import java.util.Collections;


import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmpresaServiceImplTest {

    @Mock
    private EmpresaRepository empresaRepository;
    @InjectMocks
    private EmpresaServiceImpl empresaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    //AAA -> ARRANGE -> ACT - ASSERT (ORGANIZAR, ACTUAR, AFIRMAR)
    @Test
    void testCrearEmpresaExistente(){
        //ARRANGE
        EmpresaRequest request = new EmpresaRequest();
        request.setNumeroDocumento("123456789");

        //simular|preparar el compartamiento del mock
        when(empresaRepository.existsByNumeroDocumento(anyString())).thenReturn(true);

        //ACT
        ResponseEntity<BaseResponse> response = empresaService.crear(request);

        //ASSERT
        assertEquals(Constants.CODE_EXIST, response.getBody().getCode());
        assertEquals(Constants.MSJ_EXIST, response.getBody().getMessage());
        assertTrue(response.getBody().getEntidad().isEmpty());
    }

    @Test
    void testCrearEmpresaNueva(){
        //ARRANGE
        EmpresaRequest empresaRequest = new EmpresaRequest();
        empresaRequest.setNumeroDocumento("123456789");
        Empresa empresa = new Empresa();

        //CONFIGURAR EL MOCK
        when(empresaRepository.existsByNumeroDocumento(anyString())).thenReturn(false);
        when(empresaRepository.save(any(Empresa.class))).thenReturn(empresa);

        //llama a mi metodo de la clase real (impl)
        ResponseEntity<BaseResponse> response = empresaService.crear(empresaRequest);

        //ASSERT
        assertEquals(Constants.CODE_OK, response.getBody().getCode());
        assertEquals(Constants.MSJ_OK, response.getBody().getMessage());
        assertTrue(response.getBody().getEntidad().isPresent());
        assertSame(empresa, response.getBody().getEntidad().get());
    }

    @Test
    void testObtenerEmpresaExiste(){
        //ARRANGE
        Long id = 1L;
        Empresa empresa = new Empresa();
        empresa.setDireccion("LIMA");
        when(empresaRepository.findById(id)).thenReturn(Optional.of(empresa));
        //ACT
        ResponseEntity<BaseResponse> response = empresaService.obtenerEmpresa(id);
        //ASSERT
        assertEquals(Constants.CODE_OK, response.getBody().getCode());
        assertEquals(Constants.MSJ_OK, response.getBody().getMessage());
        assertTrue(response.getBody().getEntidad().isPresent());
        assertSame(empresa, response.getBody().getEntidad().get());
    }
    @Test
    void testObtenerEmpresaNullPointer(){
        //ARRANGE
        Long id = 1L;
        Empresa empresa = new Empresa();
        when(empresaRepository.findById(id)).thenReturn(Optional.empty());

        //act & assert
        assertThrows(NoSuchElementException.class, () -> empresaService.obtenerEmpresa(id));
    }
    // Test para obtenerEmpresa No exitoso
    @Test
    void testObtenerEmpresaNoExitoso() {
        // ARRANGE
        Long id = 1L;
        when(empresaRepository.findById(id)).thenReturn(Optional.empty());

        // ACT & ASSERT
        assertThrows(NoSuchElementException.class, () -> empresaService.obtenerEmpresa(id));
    }















    // Test para obtenerTodos All
    @Test
    void testObtenerTodos() {
        // ARRANGE
        when(empresaRepository.findAll()).thenReturn(Collections.singletonList(new Empresa()));

        // ACT
        ResponseEntity<BaseResponse> response = empresaService.obtenerTodos();

        // ASSERT
        assertEquals(Constants.CODE_OK, response.getBody().getCode());
        assertEquals(Constants.MSJ_OK, response.getBody().getMessage());
        assertTrue(response.getBody().getEntidad().isPresent());
        assertNotNull(response.getBody().getEntidad().get());
    }






    

    // Test para actualizar All
    @Test
    void testActualizar() {
        // ARRANGE
        Long id = 1L;
        EmpresaRequest request = new EmpresaRequest();
        request.setNumeroDocumento("123456789");
        Empresa empresa = new Empresa();
        // Optional empresa
        Empresa empresaBd = new Empresa();
        empresaBd.setId(id);;
        empresaBd.setRazonSocial("1234456");
        empresaBd.setTipoDocumento("RUC");
        empresaBd.setNumeroDocumento("1234444");
        empresaBd.setCondicion("condicion1");
        empresaBd.setDireccion("direccion1");
        empresaBd.setDistrito("distrito1");
        empresaBd.setProvincia("provincia1");
        empresaBd.setDepartamento("departamento1");
        empresaBd.setEstado(1);
        empresaBd.setEsAgenteRetencion(false);
        empresaBd.setUsuaCrea("admin");
        empresaBd.setDateCreate(new Timestamp(99999));

        Optional<Empresa> empresaOptional = Optional.of(empresaBd);


        // Configurar el comportamiento del repositorio
        when(empresaRepository.findById(id)).thenReturn(empresaOptional);
        when(empresaRepository.save(any(Empresa.class))).thenReturn(empresa);

        // ACT
        ResponseEntity<BaseResponse> response = empresaService.actualizar(id, request);

        // ASSERT
        assertEquals(Constants.CODE_OK, response.getBody().getCode());
        assertEquals(Constants.MSJ_OK, response.getBody().getMessage());
        assertTrue(response.getBody().getEntidad().isPresent());
    }

    // Test para delete All
    @Test
    void testDelete() {
        // ARRANGE
        Long id = 1L;
        Empresa empresaBd = new Empresa();
        empresaBd.setId(id);;
        empresaBd.setRazonSocial("1234456");
        empresaBd.setTipoDocumento("RUC");
        empresaBd.setNumeroDocumento("1234444");
        empresaBd.setCondicion("condicion1");
        empresaBd.setDireccion("direccion1");
        empresaBd.setDistrito("distrito1");
        empresaBd.setProvincia("provincia1");
        empresaBd.setDepartamento("departamento1");
        empresaBd.setEstado(1);
        empresaBd.setEsAgenteRetencion(false);
        empresaBd.setUsuaCrea("admin");
        empresaBd.setDateCreate(new Timestamp(99999));

        Optional<Empresa> empresaOptional = Optional.of(empresaBd);

        Empresa empresaDelete = new Empresa();
        empresaDelete.setId(id);;
        empresaDelete.setRazonSocial("1234456");
        empresaDelete.setTipoDocumento("RUC");
        empresaDelete.setNumeroDocumento("1234444");
        empresaDelete.setCondicion("condicion1");
        empresaDelete.setDireccion("direccion1");
        empresaDelete.setDistrito("distrito1");
        empresaDelete.setProvincia("provincia1");
        empresaDelete.setDepartamento("departamento1");
        empresaDelete.setEstado(0);
        empresaDelete.setEsAgenteRetencion(false);
        empresaDelete.setUsuaCrea("admin");
        empresaDelete.setDateCreate(new Timestamp(99999));
        // Configurar el comportamiento del repositorio
        when(empresaRepository.findById(id)).thenReturn(empresaOptional);
        //doNothing().when(empresaRepository).deleteById(id);
        when(empresaRepository.save(any(Empresa.class))).thenReturn(empresaDelete);
        // ACT
        ResponseEntity<BaseResponse> response = empresaService.delete(id);

        // ASSERT
        assertEquals(Constants.CODE_OK, response.getBody().getCode());
        assertEquals(Constants.MSJ_OK, response.getBody().getMessage());
        //assertFalse(response.getBody().getEntidad().isPresent());
    }
}