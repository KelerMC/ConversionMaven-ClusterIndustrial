/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.model.IDAOTipoDocumento;
import com.unsch.clusterindustrial.domain.BTipoDocumento;
import com.unsch.clusterindustrial.service.TipoDocumentoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SISTEMAS
 */
@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService{

    @Autowired
    private IDAOTipoDocumento dAORhPersona;

    public List<BTipoDocumento> listaTipoDocumento() {
        return this.dAORhPersona.listaTipoDocumento();
    }

    
}
