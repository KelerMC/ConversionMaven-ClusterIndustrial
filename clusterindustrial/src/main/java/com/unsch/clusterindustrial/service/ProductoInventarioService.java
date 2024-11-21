/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service;

import com.unsch.clusterindustrial.dto.BDetalleCompraProducto;
import com.unsch.clusterindustrial.util.BArrayList;

import java.util.List;

/**
 *
 * @author ARANGO
 */

public interface ProductoInventarioService {

   
    public List<BDetalleCompraProducto> listaProductoInventario(BArrayList arrayList) ;

  
}
