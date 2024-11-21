/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.model;

import com.unsch.clusterindustrial.dto.BDetalleCompraProducto;
import com.unsch.clusterindustrial.util.BArrayList;

import java.util.List;

/**
 *
 * @author ARANGO
 */
public interface IDAOProductoInventario {

    public List<BDetalleCompraProducto> listaProductoInventario(BArrayList arrayList);
}
