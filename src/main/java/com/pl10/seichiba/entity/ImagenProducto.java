package com.pl10.seichiba.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

public class ImagenProducto implements java.io.Serializable{

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(unique = true, nullable = false, updatable = false)
    private String id;
    @Column(name = "filename", nullable = false)
    private String filename;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto", nullable = false)
    private Producto producto;
    @Column(name = "detalle", nullable = false)
    private String detalle;
    @Column(name = "activo", nullable = false)
    private Boolean activo;

    public ImagenProducto() {
    }

    public ImagenProducto(String filename, Producto producto, String detalle, Boolean activo) {
        this.filename = filename;
        this.producto = producto;
        this.detalle = detalle;
        this.activo = activo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return "ImagenProducto{" +
                "id='" + id + '\'' +
                ", filename='" + filename + '\'' +
                ", producto=" + producto +
                ", detalle='" + detalle + '\'' +
                ", activo=" + activo +
                '}';
    }
}
