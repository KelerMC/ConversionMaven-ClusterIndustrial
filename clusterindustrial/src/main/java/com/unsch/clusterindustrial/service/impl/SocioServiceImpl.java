/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.dto.BClusterSocioPersona;
import com.unsch.clusterindustrial.dto.BPersonaSocio;
import com.unsch.clusterindustrial.model.IDAOSocio;
import com.unsch.clusterindustrial.domain.BClusteres;
import com.unsch.clusterindustrial.domain.BPersona;
import com.unsch.clusterindustrial.domain.BSocio;
import com.unsch.clusterindustrial.util.BArrayList;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import com.unsch.clusterindustrial.service.SocioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class SocioServiceImpl implements SocioService{

    @Autowired
    private IDAOSocio dAOSocio;

    public List<BPersonaSocio> listaPersonaSocio() {
        return this.dAOSocio.listaPersonaSocio();
    }

    public List<BClusterSocioPersona> listaSocio() {
        return dAOSocio.listaSocio();
    }

    public List<BClusteres> listaClusteres(BArrayList bOperacion) {
        return dAOSocio.listaClusteres(bOperacion);
    }

    public List<BPersona> listaPersonas(BArrayList bOperacion) {
        return dAOSocio.listaPersonas(bOperacion);
    }

    public BResultadoProceso InsertSocio(BSocio bSocio) {
        return dAOSocio.InsertSocio(bSocio);
    }

    public BResultadoProceso UpdateSocio(BSocio bSocio) {
        return dAOSocio.UpdateSocio(bSocio);
    }

 
}
