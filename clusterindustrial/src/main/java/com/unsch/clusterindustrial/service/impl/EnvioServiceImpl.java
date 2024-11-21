/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.model.IDAOEnvio;
import com.unsch.clusterindustrial.domain.BEnvio;
import com.unsch.clusterindustrial.service.EnvioService;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class EnvioServiceImpl  implements  EnvioService{

    @Autowired
    private IDAOEnvio dAOEnvio;

    public List<BEnvio> listaEnvio() {
        return this.dAOEnvio.listaEnvio();
    }

    public BResultadoProceso InsertEnvio(BEnvio bEnvio) {
        return this.dAOEnvio.InsertEnvio(bEnvio);
    }

  
}
