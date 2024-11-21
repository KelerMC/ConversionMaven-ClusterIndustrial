/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.model;

import com.unsch.clusterindustrial.domain.BAlmacen;
import com.unsch.clusterindustrial.domain.BUnidadMedida;
import com.unsch.clusterindustrial.domain.BVariedad;
import com.unsch.clusterindustrial.dto.BDetalleVariedad;
import com.unsch.clusterindustrial.dto.BVariedadAlmacen;
import com.unsch.clusterindustrial.util.BResultadoProceso;

import java.util.List;

/**
 *
 * @author ARANGO
 */
public interface IDAOVariedad {

    public List<BVariedad> listaVariedad();

    public List<BVariedadAlmacen> listaVariedadDetalle();

    public List<BAlmacen> listaAlmacen();

    public List<BUnidadMedida> listaUnidad();

    public BResultadoProceso InsertVariedad(BVariedad bVariedad);

    public BResultadoProceso UpdateVariedad(BVariedad bVariedad);

    public BResultadoProceso DeleteVariedad(BVariedad bVariedad);

    public List<BDetalleVariedad> GraficaVariedadDemanda();
}
