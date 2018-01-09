package com.pl10.seichiba.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "sede_empresa")
public class SedeEmpresa implements java.io.Serializable{

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(unique = true, nullable = false, updatable = false)
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa", nullable = false)
    private Empresa empresa;
    @Column(name = "nombre_sede", nullable = false)
    private String nombreSede;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ciudad", nullable = false)
    private City city;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "celular")
    private String celular;
    @Column(name = "persona_contacto")
    private String personaContacto;
    @Column(name = "tel_contacto")
    private String telContacto;

    public SedeEmpresa() {
    }

    public SedeEmpresa(Empresa empresa, String nombreSede, City city, String direccion, String telefono, String celular, String personaContacto, String telContacto) {
        this.empresa = empresa;
        this.nombreSede = nombreSede;
        this.city = city;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.personaContacto = personaContacto;
        this.telContacto = telContacto;
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

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
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

    public String getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }

    public String getTelContacto() {
        return telContacto;
    }

    public void setTelContacto(String telContacto) {
        this.telContacto = telContacto;
    }

    @Override
    public String toString() {
        return "SedeEmpresa{" +
                "id='" + id + '\'' +
                ", empresa=" + empresa +
                ", nombreSede='" + nombreSede + '\'' +
                ", city=" + city +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", celular='" + celular + '\'' +
                ", personaContacto='" + personaContacto + '\'' +
                ", telContacto='" + telContacto + '\'' +
                '}';
    }
}
