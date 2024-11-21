/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.dto.BDetalleInventario;
import com.unsch.clusterindustrial.model.IDAOInventario;
import com.unsch.clusterindustrial.domain.BInventario;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import com.unsch.clusterindustrial.service.InventarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class InventarioServiceImpl implements InventarioService{

    @Autowired
    private IDAOInventario dAOInventario;

    public BResultadoProceso InsertInventario(BInventario bInventario) {
        return this.dAOInventario.InsertInventario(bInventario);
    }

    public List<BDetalleInventario> listaInventario() {
        return this.dAOInventario.listaInventario();
    }

 
}
