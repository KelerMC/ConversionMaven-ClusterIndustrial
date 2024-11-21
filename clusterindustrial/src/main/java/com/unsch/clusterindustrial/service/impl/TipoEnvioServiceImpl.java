/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.model.IDAOTipoEnvio;
import com.unsch.clusterindustrial.domain.BTipoEnvio;
import com.unsch.clusterindustrial.service.TipoEnvioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class TipoEnvioServiceImpl implements TipoEnvioService{

    @Autowired
    private IDAOTipoEnvio dAOTipoEnvio;

    public List<BTipoEnvio> listaTipoEnvio() {
        return this.dAOTipoEnvio.listaTipoEnvio();
    }

   
}
