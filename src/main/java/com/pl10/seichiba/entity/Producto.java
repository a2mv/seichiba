package com.pl10.seichiba.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto implements java.io.Serializable{

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(unique = true, nullable = false, updatable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa", nullable = false)
    private Empresa empresa;
    @Column(name = "referencia", nullable = false)
    private String referencia;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "precio", nullable = false, precision = 10, scale = 2)
    private Double precio;
    @Column(name = "descuento", nullable = false, precision = 5, scale = 2)
    private Double descuento;
    @Column(name = "activo", nullable = false)
    private Boolean activo;
    @Column(name = "domicilio", nullable = false)
    private Boolean domicilio;
    @Column(name = "image_filename", nullable = false)
    private String imageFilename;

    public Producto() {
    }

    public Producto(Empresa empresa, String referencia, String descripcion, Double precio, Double descuento, Boolean activo, Boolean domicilio, String imageFilename) {
        this.empresa = empresa;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
        return "Producto{" +
                "id='" + id + '\'' +
                ", empresa=" + empresa +
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
