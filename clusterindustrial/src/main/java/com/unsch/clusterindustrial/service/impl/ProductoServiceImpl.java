/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.dto.BProductoDetalle;
import com.unsch.clusterindustrial.model.IDAOProducto;
import com.unsch.clusterindustrial.domain.BProducto;
import com.unsch.clusterindustrial.service.ProductoService;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class ProductoServiceImpl implements  ProductoService{

    @Autowired
    private IDAOProducto dAOProducto;

    public BResultadoProceso registrarProducto(BProducto bProducto) {
        return this.dAOProducto.registrarProducto(bProducto);
    }

    public List<BProductoDetalle> listaProducto() {
        return this.dAOProducto.listaProducto();
    }

 
}
