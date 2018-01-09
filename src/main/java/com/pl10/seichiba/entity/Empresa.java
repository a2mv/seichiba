package com.pl10.seichiba.entity;

import com.pl10.seichiba.model.enums.SectorEmpresa;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "empresas")
public class Empresa implements java.io.Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(unique = true, nullable = false, updatable = false)
    private String id;
    //nit, rut o cédula
    @Column(name = "nit", nullable = false, length = 20)
    private String nit;
    @Column(name = "razon_social", nullable = false, length = 60)
    private String razonSocial;
    @Column(name = "sector", nullable = false)
    private SectorEmpresa sectorEmpresa;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ciudad", nullable = false)
    private City city;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "celular")
    private String celular;
    @Column(name = "email")
    private String correo;
    @Column(name = "web")
    private String web;
    @Column(name = "servicio_domicilio", nullable = false)
    private Boolean domicilio;


    public Empresa() {
    }

    public Empresa(String nit, String razonSocial, SectorEmpresa sectorEmpresa, City city, String direccion, String telefono, String celular, String correo, String web, Boolean domicilio) {
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.sectorEmpresa = sectorEmpresa;
        this.city = city;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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
        return "Empresa{" +
                "id='" + id + '\'' +
                ", nit='" + nit + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", sectorEmpresa=" + sectorEmpresa +
                ", city=" + city +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", celular='" + celular + '\'' +
                ", correo='" + correo + '\'' +
                ", web='" + web + '\'' +
                ", domicilio=" + domicilio +
                '}';
    }
}
