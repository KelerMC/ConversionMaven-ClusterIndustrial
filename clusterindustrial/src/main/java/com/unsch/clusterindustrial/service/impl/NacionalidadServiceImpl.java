/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.model.IDAONacionalidad;
import com.unsch.clusterindustrial.domain.BNacionalidad;
import com.unsch.clusterindustrial.service.NacionalidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class NacionalidadServiceImpl implements NacionalidadService{

    @Autowired
    private IDAONacionalidad dAONacionalidad;

    public List<BNacionalidad> listaNacionalidad() {
        return this.dAONacionalidad.listaNacionalidad();
    }

  
}
