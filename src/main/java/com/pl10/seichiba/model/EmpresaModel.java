package com.pl10.seichiba.model;

import com.pl10.seichiba.model.enums.SectorEmpresa;

public class EmpresaModel {

    private String id;
    private String nit;
    private String razonSocial;
    private SectorEmpresa sectorEmpresa;
    private CityModel cityModel;
    private String direccion;
    private String telefono;
    private String celular;
    private String correo;
    private String web;
    private Boolean domicilio;

    public EmpresaModel() {
    }

    public EmpresaModel(String id, String nit, String razonSocial, SectorEmpresa sectorEmpresa, CityModel cityModel, String direccion, String telefono, String celular, String correo, String web, Boolean domicilio) {
        this.id = id;
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.sectorEmpresa = sectorEmpresa;
        this.cityModel = cityModel;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.web = web;
        this.domicilio = domicilio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public SectorEmpresa getSectorEmpresa() {
        return sectorEmpresa;
    }

    public void setSectorEmpresa(SectorEmpresa sectorEmpresa) {
        this.sectorEmpresa = sectorEmpresa;
    }

    public CityModel getCityModel() {
        return cityModel;
    }

    public void setCityModel(CityModel cityModel) {
        this.cityModel = cityModel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Boolean getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Boolean domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "EmpresaModel{" +
                "id='" + id + '\'' +
                ", nit='" + nit + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", sectorEmpresa=" + sectorEmpresa +
                ", cityModel=" + cityModel +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", celular='" + celular + '\'' +
                ", correo='" + correo + '\'' +
                ", web='" + web + '\'' +
                ", domicilio=" + domicilio +
                '}';
    }
}
