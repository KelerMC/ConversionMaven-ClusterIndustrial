/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.model.IDAOOperacion;
import com.unsch.clusterindustrial.domain.BOperacion;
import com.unsch.clusterindustrial.service.OperacionService;
import com.unsch.clusterindustrial.util.BArrayList;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class OperacionServiceImpl implements OperacionService{

    @Autowired
    private IDAOOperacion dAOOperacion;

    public List<BOperacion> listaOperacion() {
        return this.dAOOperacion.listaOperacion();
    }

    public BResultadoProceso agregarOperacion(BOperacion bOperacion) {
        return this.dAOOperacion.agregarOperacion(bOperacion);
    }
    
    public List<BOperacion>  listaOpracion(BArrayList bOperacion){
        return this.dAOOperacion.listaOpracion(bOperacion);
    }

  
}
