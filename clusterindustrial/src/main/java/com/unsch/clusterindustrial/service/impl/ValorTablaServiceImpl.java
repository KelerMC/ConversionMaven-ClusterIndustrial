/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.model.IDAOValorTabla;
import com.unsch.clusterindustrial.domain.BValorTabla;
import com.unsch.clusterindustrial.service.ValorTablaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class ValorTablaServiceImpl implements  ValorTablaService{

    @Autowired
    private IDAOValorTabla dAOValorTabla;

    public List<BValorTabla> listaDocumentoIdentidad() {
        return this.dAOValorTabla.listaDocumentoIdentidad();
    }

    public List<BValorTabla> listaTipoPersona() {
        return this.dAOValorTabla.listaTipoPersona();
    }

    public List<BValorTabla> listaTipoTelefono() {
        return this.dAOValorTabla.listaTipoTelefono();
    }

    
}
