/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service;

import com.unsch.clusterindustrial.dto.BDetalleOrdenCompra;
import com.unsch.clusterindustrial.dto.BSubDetalleOrdenCompra;
import com.unsch.clusterindustrial.domain.BOrdenCompra;
import com.unsch.clusterindustrial.util.BArrayList;
import com.unsch.clusterindustrial.util.BResultadoProceso;

import java.util.List;

/**
 *
 * @author ARANGO
 */

public interface OrdenCompraService {


    public List<BSubDetalleOrdenCompra> subListaOrdenCompra(BArrayList arrayList);

    public BResultadoProceso InsertOrdenCompra(BOrdenCompra bOrdenCompra);
    public List<BDetalleOrdenCompra> listaOrdenCompra() ;

  
}
