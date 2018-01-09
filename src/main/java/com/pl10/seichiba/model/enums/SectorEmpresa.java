package com.pl10.seichiba.model.enums;

public enum SectorEmpresa {
    AGROPECUARIO("Sector agropecuario"),
    SERVICIOS("Sector de servicios"),
    INDUSTRIAL("Sector industrial"),
    TRANSPORTE("Sector de transporte"),
    COMERCIO("Sector de comercio"),
    FINANCIERO("Sector financiero"),
    CONSTRUCCION("Sector de la construcción"),
    MINENERGETICO("Sector minero y energético"),
    SOLIDARIO("Sector solidario"),
    COMUNICACION("Sector de comunicaciones"),
    OTRO("Otro sector");

    private String nombreSector;

    private SectorEmpresa(String nombreSector){
        this.nombreSector=nombreSector;
    }

    public String getNombreSector() {
        return nombreSector;
    }
}
