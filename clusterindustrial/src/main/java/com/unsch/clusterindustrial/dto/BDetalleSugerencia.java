/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsch.clusterindustrial.dto;

import java.sql.Date;

/**
 *
 * @author ARANGO
 */
public class BDetalleSugerencia {

    private int sugerenciaid;
    private int clienteid;
    private int clusteresid;
    private String textosugerencia;
    private Date fechasugerencia;
    private String clasificacionS;

    private int ubigeoid;
    private String ubigeo;
    private String denominacionClu;
    private String descripcionClu;
    private String estadoclusteres;

    private int personaid;
    private String codigopostal;
    private String region;
    private String nombrecliente;
    private String clavecliente;
    private String estadocliente;

    private int idubigeo;
    private int nacionalidadid;
    private String nombrepersona;
    private String apepaterno;
    private String apmaterno;
    private int documentoidentidadid;
    private String numerodocumento;
    private String direccion;
    private String referenciadireccion;
    private String emailpersonal;
    private String nombrecompleto;
    private int idtipotelefono;
    private String numerotelefono;
    private Date fechanacimiento;
    private int tipopersonaid;
    private Date fecharegistro;
    private Date fechaactualizacion;

    public int getSugerenciaid() {
        return sugerenciaid;
    }

    public void setSugerenciaid(int sugerenciaid) {
        this.sugerenciaid = sugerenciaid;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public int getClusteresid() {
        return clusteresid;
    }

    public void setClusteresid(int clusteresid) {
        this.clusteresid = clusteresid;
    }

    public String getTextosugerencia() {
        return textosugerencia;
    }

    public void setTextosugerencia(String textosugerencia) {
        this.textosugerencia = textosugerencia;
    }

    public Date getFechasugerencia() {
        return fechasugerencia;
    }

    public void setFechasugerencia(Date fechasugerencia) {
        this.fechasugerencia = fechasugerencia;
    }

    public String getClasificacionS() {
        return clasificacionS;
    }

    public void setClasificacionS(String clasificacionS) {
        this.clasificacionS = clasificacionS;
    }

    public int getUbigeoid() {
        return ubigeoid;
    }

    public void setUbigeoid(int ubigeoid) {
        this.ubigeoid = ubigeoid;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getDenominacionClu() {
        return denominacionClu;
    }

    public void setDenominacionClu(String denominacionClu) {
        this.denominacionClu = denominacionClu;
    }

    public String getDescripcionClu() {
        return descripcionClu;
    }

    public void setDescripcionClu(String descripcionClu) {
        this.descripcionClu = descripcionClu;
    }

    public String getEstadoclusteres() {
        return estadoclusteres;
    }

    public void setEstadoclusteres(String estadoclusteres) {
        this.estadoclusteres = estadoclusteres;
    }

    public int getPersonaid() {
        return personaid;
    }

    public void setPersonaid(int personaid) {
        this.personaid = personaid;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getClavecliente() {
        return clavecliente;
    }

    public void setClavecliente(String clavecliente) {
        this.clavecliente = clavecliente;
    }

    public String getEstadocliente() {
        return estadocliente;
    }

    public void setEstadocliente(String estadocliente) {
        this.estadocliente = estadocliente;
    }

    public int getIdubigeo() {
        return idubigeo;
    }

    public void setIdubigeo(int idubigeo) {
        this.idubigeo = idubigeo;
    }

    public int getNacionalidadid() {
        return nacionalidadid;
    }

    public void setNacionalidadid(int nacionalidadid) {
        this.nacionalidadid = nacionalidadid;
    }

    public String getNombrepersona() {
        return nombrepersona;
    }

    public void setNombrepersona(String nombrepersona) {
        this.nombrepersona = nombrepersona;
    }

    public String getApepaterno() {
        return apepaterno;
    }

    public void setApepaterno(String apepaterno) {
        this.apepaterno = apepaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public int getDocumentoidentidadid() {
        return documentoidentidadid;
    }

    public void setDocumentoidentidadid(int documentoidentidadid) {
        this.documentoidentidadid = documentoidentidadid;
    }

    public String getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReferenciadireccion() {
        return referenciadireccion;
    }

    public void setReferenciadireccion(String referenciadireccion) {
        this.referenciadireccion = referenciadireccion;
    }

    public String getEmailpersonal() {
        return emailpersonal;
    }

    public void setEmailpersonal(String emailpersonal) {
        this.emailpersonal = emailpersonal;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public int getIdtipotelefono() {
        return idtipotelefono;
    }

    public void setIdtipotelefono(int idtipotelefono) {
        this.idtipotelefono = idtipotelefono;
    }

    public String getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(String numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getTipopersonaid() {
        return tipopersonaid;
    }

    public void setTipopersonaid(int tipopersonaid) {
        this.tipopersonaid = tipopersonaid;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public Date getFechaactualizacion() {
        return fechaactualizacion;
    }

    public void setFechaactualizacion(Date fechaactualizacion) {
        this.fechaactualizacion = fechaactualizacion;
    }
}
