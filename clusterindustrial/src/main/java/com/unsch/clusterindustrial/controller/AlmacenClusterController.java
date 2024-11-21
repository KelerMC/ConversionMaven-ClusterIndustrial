/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.controller;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.unsch.clusterindustrial.dto.BAlmacenCluster;
import com.unsch.clusterindustrial.dto.BDetalleCompraProducto;
import com.unsch.clusterindustrial.service.AlmacenService;
import com.unsch.clusterindustrial.service.ProductoInventarioService;
import com.unsch.clusterindustrial.util.BArrayList;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SISTEMAS
 */
@RestController
public class AlmacenClusterController {

    @Autowired
    private AlmacenService serviceAlmacen;
    
    @Autowired
    private ProductoInventarioService serviceProductoInventario;

    @RequestMapping("/listaAlmacenCluster.htm")
    public ModelAndView pageHandler(HttpServletRequest request) {
        return new ModelAndView("listaAlmacenCluster");
    }

    @RequestMapping(value = "/recuperarAlmacenCluster.htm", method = RequestMethod.GET)
    public ModelAndView listarAlmacenCluster(Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            List<BAlmacenCluster> list = this.serviceAlmacen.listaAlmacen();
            System.out.println("tamanio de los datos: " + list.size());
            JsonArray jsonArray = new JsonArray();
            for (BAlmacenCluster harbour : list) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("almacenid", harbour.getAlmacenid());
                jsonObject.addProperty("denominacionC", harbour.getDenominacionC());
                jsonObject.addProperty("denominacionA", harbour.getDenominacionA());
                jsonObject.addProperty("estadoalmacen", harbour.getEstadoalmacen());
                jsonArray.add(jsonObject);
            }
            response.getWriter().write(jsonArray.toString());
            return null;
        } catch (Exception e) {
            System.out.println("error is " + e);
        }
        return null;
    }

    @RequestMapping(value = "/mostrarProductoInventario.htm", method = RequestMethod.GET)
    public ModelAndView MostrarDetalleProductoInventario(Map<String, Object> map, HttpServletRequest request, HttpServletResponse response,
            @RequestParam(value = "ids", required = false) int ids) {
        try {

            BArrayList bArrayList = new BArrayList();
            System.out.println("ids..... "+ids);
            bArrayList.setId1(ids);
            List<BDetalleCompraProducto> list = this.serviceProductoInventario.listaProductoInventario(bArrayList);
            System.out.println("jhajajajajaj detalle----------" + list.size());
            JSONArray jsonArray = new JSONArray();
            for (BDetalleCompraProducto harbour : list) {
                JSONArray array = new JSONArray();
                System.out.println("aquiiiiiiiiiiiii");
                array.put(harbour.getInventarioid());
                array.put(harbour.getCodigoproducto());
                array.put(harbour.getDenominacionV());
                array.put(harbour.getDescripcionP());
                array.put(harbour.getDenominacionUM());
                array.put(harbour.getCantidad());
                array.put(harbour.getPreciounitario());

                jsonArray.put(array);
            }
            response.getWriter().write(jsonArray.toString());
            return null;
        } catch (Exception exception) {
            System.out.println("error is detalle" + exception);
        }
        return null;
    }

    public AlmacenService getServiceAlmacen() {
        return serviceAlmacen;
    }

    public void setServiceAlmacen(AlmacenService serviceAlmacen) {
        this.serviceAlmacen = serviceAlmacen;
    }

    public ProductoInventarioService getServiceProductoInventario() {
        return serviceProductoInventario;
    }

    public void setServiceProductoInventario(ProductoInventarioService serviceProductoInventario) {
        this.serviceProductoInventario = serviceProductoInventario;
    }

}
