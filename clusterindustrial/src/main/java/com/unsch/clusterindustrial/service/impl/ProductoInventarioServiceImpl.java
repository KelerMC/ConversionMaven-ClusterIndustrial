/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.dto.BDetalleCompraProducto;
import com.unsch.clusterindustrial.model.IDAOProductoInventario;
import com.unsch.clusterindustrial.util.BArrayList;
import com.unsch.clusterindustrial.service.ProductoInventarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class ProductoInventarioServiceImpl implements ProductoInventarioService{

    @Autowired
    private IDAOProductoInventario dAOProductoInventario;

    public List<BDetalleCompraProducto> listaProductoInventario(BArrayList arrayList) {
        return this.dAOProductoInventario.listaProductoInventario(arrayList);
    }


}
