package com.unsch.clusterindustrial.service;

import com.unsch.clusterindustrial.dto.BDetalleUsuario;
import com.unsch.clusterindustrial.domain.BUsuario;
import com.unsch.clusterindustrial.util.BResultadoProceso;

import java.util.List;

/**
 *
 * @author Morpheus
 */

public interface UsuarioService {



    public BResultadoProceso InsertUsuario(BUsuario bUsuario) ;

    public BResultadoProceso autenticaUsuario(BUsuario bUsuario) ;

    public List<BDetalleUsuario> listaUsuario();
}
