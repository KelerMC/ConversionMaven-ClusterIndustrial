/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.unsch.clusterindustrial.dto.BDetalleUsuario;
import com.unsch.clusterindustrial.dto.BPersonaSocio;
import com.unsch.clusterindustrial.domain.BRolUsuario;
import com.unsch.clusterindustrial.domain.BUsuario;
import com.unsch.clusterindustrial.service.RolUsuarioService;
import com.unsch.clusterindustrial.service.SocioService;
import com.unsch.clusterindustrial.service.UsuarioService;
import com.unsch.clusterindustrial.util.BResultadoProceso;
import com.unsch.clusterindustrial.util.EstrategiaExclusion;
import com.unsch.clusterindustrial.util.StringF;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Morpheus
 */
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService serviceUsuario;
    @Autowired
    private RolUsuarioService serviceRolUsuario;
    @Autowired
    private SocioService serviceSocio;

    @RequestMapping(value = "/listaUsuario.htm")
    public ModelAndView menuView(HttpServletRequest request) {
        List<BRolUsuario> lista = this.serviceRolUsuario.listaRolUsuario();
        List<BPersonaSocio> listaPersona = this.serviceSocio.listaPersonaSocio();
        System.out.println("jsjsjsj tamanio : " + lista.size());
        ModelAndView modelAndView = new ModelAndView("listaUsuario");
        modelAndView.addObject("listUsuario", lista);
        modelAndView.addObject("listPersona", listaPersona);
        return modelAndView;
    }

    @RequestMapping(value = "/agregarUsuario.htm", method = RequestMethod.GET)
    public @ResponseBody
    String insertUsuario(HttpServletRequest request, HttpServletResponse response) throws ParseException {

        BUsuario bInventario = new BUsuario();
        StringF stringF = new StringF();

        bInventario.setSocioid(Integer.parseInt(stringF.nvlfunction(request.getParameter("txtsocioid"), "0")));
        bInventario.setRolusuarioid(Integer.parseInt(stringF.nvlfunction(request.getParameter("txtrolusuarioid"), "0")));
        bInventario.setNombreusuario(stringF.nvlfunction(request.getParameter("txtnombreusuario").toUpperCase(), ""));
        bInventario.setClaveusuario(stringF.nvlfunction(request.getParameter("txtclaveusuario").toUpperCase(), ""));

        BResultadoProceso bResultadoProceso;
        List<BResultadoProceso> lista = new ArrayList<BResultadoProceso>();
        bResultadoProceso = this.serviceUsuario.InsertUsuario(bInventario);

        lista.add(bResultadoProceso);

        Gson gson = new GsonBuilder().setExclusionStrategies(new EstrategiaExclusion(List.class)).create();
        String proceso = gson.toJson(lista);
        response.addHeader("Content-Type", "text/html; charset=iso-8859-1");
        return proceso;
    }

    @RequestMapping(value = "/recuperarUsuario.htm", method = RequestMethod.GET)
    public ModelAndView listarUsuario(Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            List<BDetalleUsuario> list = this.serviceUsuario.listaUsuario();
            System.out.println("tamanio de los datos: " + list.size());
            JSONArray jsonArray = new JSONArray();
            for (BDetalleUsuario harbour : list) {
                JSONArray array = new JSONArray();

                array.put(harbour.getUsuarioid());
                array.put(harbour.getNombrecompleto());
                array.put(harbour.getEstadousuario());

                jsonArray.put(array);
            }
            response.getWriter().write(jsonArray.toString());
            return null;
        } catch (Exception e) {
            System.out.println("error is " + e);
        }
        return null;
    }

    public UsuarioService getServiceUsuario() {
        return serviceUsuario;
    }

    public void setServiceUsuario(UsuarioService serviceUsuario) {
        this.serviceUsuario = serviceUsuario;
    }

    public RolUsuarioService getServiceRolUsuario() {
        return serviceRolUsuario;
    }

    public void setServiceRolUsuario(RolUsuarioService serviceRolUsuario) {
        this.serviceRolUsuario = serviceRolUsuario;
    }

    public SocioService getServiceSocio() {
        return serviceSocio;
    }

    public void setServiceSocio(SocioService serviceSocio) {
        this.serviceSocio = serviceSocio;
    }
}
