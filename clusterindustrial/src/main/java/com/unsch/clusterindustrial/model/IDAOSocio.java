/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.model;

import com.unsch.clusterindustrial.domain.BClusteres;
import com.unsch.clusterindustrial.domain.BPersona;
import com.unsch.clusterindustrial.domain.BSocio;
import com.unsch.clusterindustrial.dto.BClusterSocioPersona;
import com.unsch.clusterindustrial.dto.BPersonaSocio;
import com.unsch.clusterindustrial.util.BArrayList;
import com.unsch.clusterindustrial.util.BResultadoProceso;

import java.util.List;

/**
 *
 * @author ARANGO
 */
public interface IDAOSocio {

    public List<BClusterSocioPersona> listaSocio();

    public List<BClusteres> listaClusteres(BArrayList bOperacion);

    public List<BPersona> listaPersonas(BArrayList bOperacion);

    public BResultadoProceso InsertSocio(BSocio bSocio);

    public BResultadoProceso UpdateSocio(BSocio bSocio);

    public List<BPersonaSocio> listaPersonaSocio();
}
