/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.dto.BResponsableSocioCluster;
import com.unsch.clusterindustrial.model.IDAOResponsable;
import com.unsch.clusterindustrial.domain.BResponsable;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import com.unsch.clusterindustrial.service.ResponsableService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class ResponsableServiceImpl implements ResponsableService{

    @Autowired
    private IDAOResponsable dAOResponsable;

    public BResultadoProceso InsertResponsable(BResponsable bResponsable) {
        return this.dAOResponsable.InsertResponsable(bResponsable);
    }

    public List<BResponsableSocioCluster> listaPersonaResponsable() {
        return this.dAOResponsable.listaPersonaResponsable();
    }

  
}
