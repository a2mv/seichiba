package com.pl10.seichiba.model;

public class ProductoModel {

    private String id;
    private EmpresaModel empresaModel;
    private String referencia;
    private String descripcion;
    private Double precio;
    private Double descuento;
    private Boolean activo;
    private Boolean domicilio;
    private String imageFilename;

    public ProductoModel() {
    }

    public ProductoModel(String id, EmpresaModel empresaModel, String referencia, String descripcion, Double precio, Double descuento, Boolean activo, Boolean domicilio, String imageFilename) {
        this.id = id;
        this.empresaModel = empresaModel;
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
        this.activo = activo;
        this.domicilio = domicilio;
        this.imageFilename = imageFilename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EmpresaModel getEmpresaModel() {
        return empresaModel;
    }

    public void setEmpresaModel(EmpresaModel empresaModel) {
        this.empresaModel = empresaModel;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Boolean domicilio) {
        this.domicilio = domicilio;
    }

    public String getImageFilename() {
        return imageFilename;
    }

    public void setImageFilename(String imageFilename) {
        this.imageFilename = imageFilename;
    }

    @Override
    public String toString() {
        return "ProductoModel{" +
                "id='" + id + '\'' +
                ", empresaModel=" + empresaModel +
                ", referencia='" + referencia + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", activo=" + activo +
                ", domicilio=" + domicilio +
                ", imageFilename='" + imageFilename + '\'' +
                '}';
    }
}
