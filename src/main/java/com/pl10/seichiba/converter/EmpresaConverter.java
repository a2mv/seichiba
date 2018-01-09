package com.pl10.seichiba.converter;

import com.pl10.seichiba.entity.Empresa;
import com.pl10.seichiba.model.EmpresaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("empresaConverter")
public class EmpresaConverter {

    @Autowired
    @Qualifier("cityConverter")
    private CityConverter cityConverter;

    public Empresa empresaModelToEmpresa(EmpresaModel empresaModel){
        Empresa empresa = new Empresa();
        empresa.setCelular(empresaModel.getCelular());
        empresa.setCity(cityConverter.cityModelToCity(empresaModel.getCityModel()));
        empresa.setCorreo(empresaModel.getCorreo());
        empresa.setDireccion(empresaModel.getDireccion());
        empresa.setDomicilio(empresaModel.getDomicilio());
        empresa.setId(empresaModel.getId());
        empresa.setNit(empresaModel.getNit());
        empresa.setRazonSocial(empresaModel.getRazonSocial());
        empresa.setSectorEmpresa(empresaModel.getSectorEmpresa());
        empresa.setTelefono(empresaModel.getTelefono());
        empresa.setWeb(empresaModel.getWeb());
        return empresa;
    }

    public EmpresaModel empresaToEmpresaModel(Empresa empresa){
        EmpresaModel empresaModel = new EmpresaModel();
        empresaModel.setCelular(empresaModel.getCelular());
        empresaModel.setCityModel(cityConverter.cityToCityModel(empresa.getCity()));
        empresaModel.setCorreo(empresa.getCorreo());
        empresaModel.setDireccion(empresa.getDireccion());
        empresaModel.setDomicilio(empresa.getDomicilio());
        empresaModel.setId(empresa.getId());
        empresaModel.setNit(empresa.getNit());
        empresaModel.setRazonSocial(empresa.getRazonSocial());
        empresaModel.setSectorEmpresa(empresa.getSectorEmpresa());
        empresaModel.setTelefono(empresa.getTelefono());
        empresaModel.setWeb(empresa.getWeb());
        return empresaModel;
    }
}
