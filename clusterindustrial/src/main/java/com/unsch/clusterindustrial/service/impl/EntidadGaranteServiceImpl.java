/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.dto.BDetalleEntidadGarante;
import com.unsch.clusterindustrial.model.IDAOEntidadGarante;
import com.unsch.clusterindustrial.domain.BEntidadGarante;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import com.unsch.clusterindustrial.service.EntidadGaranteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class EntidadGaranteServiceImpl implements  EntidadGaranteService{

    @Autowired
    private IDAOEntidadGarante dAOEntidadGarante;

    public List<BDetalleEntidadGarante> listaEntidadGarante() {
        return this.dAOEntidadGarante.listaEntidadGarante();
    }

    public BResultadoProceso InsertEntidadGarante(BEntidadGarante bEntidadGarante) {
        return this.dAOEntidadGarante.InsertEntidadGarante(bEntidadGarante);
    }

}
