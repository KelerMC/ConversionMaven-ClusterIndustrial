/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.model;

import com.unsch.clusterindustrial.domain.BUsuario;
import com.unsch.clusterindustrial.dto.BDetalleUsuario;
import com.unsch.clusterindustrial.util.BResultadoProceso;

import java.util.List;

/**
 *
 * @author Morpheus
 */
public interface IDAOUsuario {

    public BResultadoProceso InsertUsuario(BUsuario bUsuario);

    public BResultadoProceso autenticaUsuario(BUsuario bUsuario);

    public List<BDetalleUsuario> listaUsuario();
}
