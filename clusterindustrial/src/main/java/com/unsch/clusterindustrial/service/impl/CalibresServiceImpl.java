/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.model.IDAOCalibres;
import com.unsch.clusterindustrial.domain.BCalibres;
import com.unsch.clusterindustrial.domain.BVariedad;
import com.unsch.clusterindustrial.service.CalibresService;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ARANGO
 */
@Service
public class CalibresServiceImpl implements  CalibresService{

    @Autowired
    private IDAOCalibres dAOCalibres;

    public List<BCalibres> listaCalibres() {
        return this.dAOCalibres.listaCalibres();
    }

    public List<BVariedad> listaVariedad() {
        return this.dAOCalibres.listaVariedad();
    }   

    public BResultadoProceso InsertCalibres(BCalibres bCalibres) {
        return this.dAOCalibres.InsertCalibres(bCalibres);
    }

    public BResultadoProceso UpdateCalibres(BCalibres bCalibres) {
        return this.dAOCalibres.UpdateCalibres(bCalibres);
    }

    public BResultadoProceso DeleteCalibres(BCalibres bCalibres) {
        return this.dAOCalibres.DeleteCalibres(bCalibres);
    }   
    
  
}
