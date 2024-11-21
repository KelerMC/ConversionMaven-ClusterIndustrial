/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service;

import com.unsch.clusterindustrial.domain.BCliente;
import com.unsch.clusterindustrial.util.BResultadoProceso;

/**
 *
 * @author ARANGO
 */

public interface ClienteService {


    public BResultadoProceso autenticaCliente(BCliente bCliente) ;

    public BResultadoProceso registrarCliente(BCliente bEvaluacion) ;

 
}
