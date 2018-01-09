package com.pl10.seichiba.converter;

import com.pl10.seichiba.entity.Producto;
import com.pl10.seichiba.model.ProductoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("productoConverter")
public class ProductoConverter {

    @Autowired
    @Qualifier("empresaConverter")
    private EmpresaConverter empresaConverter;

    public Producto productoModelToProducto(ProductoModel productoModel){
        Producto producto = new Producto();
        producto.setActivo(productoModel.getActivo());
        producto.setDescripcion(productoModel.getDescripcion());
        producto.setDescuento(productoModel.getDescuento());
        producto.setDomicilio(productoModel.getDomicilio());
        producto.setEmpresa(empresaConverter.empresaModelToEmpresa(productoModel.getEmpresaModel()));
        producto.setId(productoModel.getId());
        producto.setImageFilename(productoModel.getImageFilename());
        producto.setPrecio(producto.getPrecio());
        producto.setReferencia(productoModel.getReferencia());
        return producto;
    }

    public ProductoModel productoToProductoModel(Producto producto){
        ProductoModel productoModel = new ProductoModel();
        productoModel.setActivo(producto.getActivo());
        productoModel.setDescripcion(producto.getDescripcion());
        productoModel.setDescuento(producto.getDescuento());
        productoModel.setDomicilio(producto.getDomicilio());
        productoModel.setEmpresaModel(empresaConverter.empresaToEmpresaModel(producto.getEmpresa()));
        productoModel.setId(producto.getId());
        productoModel.setImageFilename(producto.getImageFilename());
        productoModel.setPrecio(producto.getPrecio());
        productoModel.setReferencia(producto.getReferencia());
        return productoModel;
    }
}
