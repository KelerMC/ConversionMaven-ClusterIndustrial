/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service;

import com.unsch.clusterindustrial.dto.BPersonaCliente;
import com.unsch.clusterindustrial.util.BResultadoProceso;

/**
 *
 * @author ARANGO
 */

public interface PersonaClienteService {



    public BResultadoProceso RegistrarPersonaCliente(BPersonaCliente bPersonaCliente);
}
