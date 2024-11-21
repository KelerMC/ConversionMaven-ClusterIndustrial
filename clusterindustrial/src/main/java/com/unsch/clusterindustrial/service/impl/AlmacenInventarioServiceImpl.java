/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.dto.BAlmacenInventario;
import com.unsch.clusterindustrial.model.IDAOAlmacenInventario;
import com.unsch.clusterindustrial.service.AlmacenInventarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Morpheus
 */
@Service
public class AlmacenInventarioServiceImpl implements AlmacenInventarioService{

    @Autowired
    private IDAOAlmacenInventario dAOAlmacenInventario;

    public List<BAlmacenInventario> GraficaAlmacenInventario() {
        return this.dAOAlmacenInventario.GraficaAlmacenInventario();
    }

  
}
