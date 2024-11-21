/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.dto.BDetalleOrdenCompra;
import com.unsch.clusterindustrial.dto.BSubDetalleOrdenCompra;
import com.unsch.clusterindustrial.model.IDAOOrdenCompra;
import com.unsch.clusterindustrial.domain.BOrdenCompra;
import com.unsch.clusterindustrial.util.BArrayList;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import com.unsch.clusterindustrial.service.OrdenCompraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class OrdenCompraServiceImpl implements  OrdenCompraService{

    @Autowired
    private IDAOOrdenCompra dAOOrdenCompra;

    public List<BSubDetalleOrdenCompra> subListaOrdenCompra(BArrayList arrayList) {
        return this.dAOOrdenCompra.subListaOrdenCompra(arrayList);
    }

    public BResultadoProceso InsertOrdenCompra(BOrdenCompra bOrdenCompra) {
        return this.dAOOrdenCompra.InsertOrdenCompra(bOrdenCompra);
    }

    public List<BDetalleOrdenCompra> listaOrdenCompra() {
        return this.dAOOrdenCompra.listaOrdenCompra();
    }

   
}
