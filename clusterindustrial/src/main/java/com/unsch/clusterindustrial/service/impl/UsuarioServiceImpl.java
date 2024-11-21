package com.unsch.clusterindustrial.service.impl;

import com.unsch.clusterindustrial.dto.BDetalleUsuario;
import com.unsch.clusterindustrial.model.IDAOUsuario;
import com.unsch.clusterindustrial.domain.BUsuario;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import com.unsch.clusterindustrial.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Morpheus
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private IDAOUsuario dAOUsuario;

    public BResultadoProceso InsertUsuario(BUsuario bUsuario) {
        return this.dAOUsuario.InsertUsuario(bUsuario);
    }

    public BResultadoProceso autenticaUsuario(BUsuario bUsuario) {
        return this.dAOUsuario.autenticaUsuario(bUsuario);
    }

    public List<BDetalleUsuario> listaUsuario() {
        return this.dAOUsuario.listaUsuario();
    }

   
}
