/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.model.IDAOClusteres;
import com.unsch.clusterindustrial.domain.BClusteres;
import com.unsch.clusterindustrial.domain.BUbigeo;
import com.unsch.clusterindustrial.service.ClusteresService;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class ClusteresServiceImpl implements  ClusteresService{

    @Autowired
    private IDAOClusteres dAOClusteres;

    public List<BClusteres> listaClusteres() {
        return this.dAOClusteres.listaClusteres();
    }

    public List<BUbigeo> listaUbigeo() {
        return this.dAOClusteres.listaUbigeo();
    }

    public BResultadoProceso RegistrarCluster(BClusteres bClusteres) {
        return this.dAOClusteres.RegistrarCluster(bClusteres);
    }
    public BResultadoProceso UpdateCluster(BClusteres bClusteres) {
        return this.dAOClusteres.UpdateCluster(bClusteres);
    }
    public BResultadoProceso DeleteCluster(BClusteres bClusteres) {
        return this.dAOClusteres.DeleteCluster(bClusteres);
    }

}
