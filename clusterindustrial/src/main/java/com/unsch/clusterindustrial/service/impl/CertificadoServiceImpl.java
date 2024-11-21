/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.dto.BDetalleCertificado;
import com.unsch.clusterindustrial.model.IDAOCertificado;
import com.unsch.clusterindustrial.domain.BCertificado;
import com.unsch.clusterindustrial.util.BArrayList;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import com.unsch.clusterindustrial.service.CertificadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class CertificadoServiceImpl implements CertificadoService {

    @Autowired
    private IDAOCertificado dAOCertificado;

    public List<BDetalleCertificado> listaCertificadoPagado() {
        return this.dAOCertificado.listaCertificadoPagado();
    }

    public List<BDetalleCertificado> listaCertificadoCliente(BArrayList bArrayList) {
        return this.dAOCertificado.listaCertificadoCliente(bArrayList);
    }

    public BResultadoProceso activarCertificado(BCertificado bCertificado) {
        return this.dAOCertificado.activarCertificado(bCertificado);
    }

    public List<BDetalleCertificado> listaCertificado() {
        return this.dAOCertificado.listaCertificado();
    }

    public BResultadoProceso InsertCertificado(BCertificado bCertificado) {
        return this.dAOCertificado.InsertCertificado(bCertificado);
    }

  
}
