/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.model;

import com.unsch.clusterindustrial.domain.BResponsable;
import com.unsch.clusterindustrial.dto.BResponsableSocioCluster;
import com.unsch.clusterindustrial.util.BResultadoProceso;

import java.util.List;

/**
 *
 * @author ARANGO
 */
public interface IDAOResponsable {

    public BResultadoProceso InsertResponsable(BResponsable bResponsable);

    public List<BResponsableSocioCluster> listaPersonaResponsable();
}
