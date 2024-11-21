/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.model;

import com.unsch.clusterindustrial.domain.BSugerencia;
import com.unsch.clusterindustrial.dto.BDetalleSugerencia;
import com.unsch.clusterindustrial.util.BResultadoProceso;

import java.util.List;

/**
 *
 * @author hp
 */
public interface IDAOSugerencia {

    public List<BDetalleSugerencia> listaSugerenciaDetalle();

    public BResultadoProceso InsertSugerencia(BSugerencia bSugerencia);
}
