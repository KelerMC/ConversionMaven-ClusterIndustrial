/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.model;

import com.unsch.clusterindustrial.domain.BAlmacen;
import com.unsch.clusterindustrial.domain.BClusteres;
import com.unsch.clusterindustrial.dto.BAlmacenCluster;
import com.unsch.clusterindustrial.util.BArrayList;
import com.unsch.clusterindustrial.util.BResultadoProceso;

import java.util.List;

/**
 *
 * @author ARANGO
 */
public interface IDAOAlmacen {

    public List<BAlmacenCluster> listaAlmacen();

    public List<BClusteres> listaCluster();

    public BResultadoProceso InsertAlmacen(BAlmacen bAlmacen);

    public BResultadoProceso UpdateAlmacen(BAlmacen bAlmacen);

    public BResultadoProceso DeleteAlmacen(BAlmacen bAlmacen);

    public List<BAlmacen> listaAlmacen(BArrayList arrayList);
}
