/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.model.IDAOCliente;
import com.unsch.clusterindustrial.domain.BCliente;
import com.unsch.clusterindustrial.service.ClienteService;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class ClienteServiceImpl implements  ClienteService{

    @Autowired
    private IDAOCliente dAOCliente;

    public BResultadoProceso autenticaCliente(BCliente bCliente) {
        return this.dAOCliente.autenticaCliente(bCliente);
    }

    public BResultadoProceso registrarCliente(BCliente bEvaluacion) {
        return this.dAOCliente.registrarCliente(bEvaluacion);
    }

}
