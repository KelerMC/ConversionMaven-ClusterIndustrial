/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service;

import com.unsch.clusterindustrial.domain.BOperacion;
import com.unsch.clusterindustrial.util.BArrayList;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import java.util.List;

/**
 *
 * @author ARANGO
 */

public interface OperacionService {


    public List<BOperacion> listaOperacion() ;
    public BResultadoProceso agregarOperacion(BOperacion bOperacion) ;
    
    public List<BOperacion>  listaOpracion(BArrayList bOperacion);
}
