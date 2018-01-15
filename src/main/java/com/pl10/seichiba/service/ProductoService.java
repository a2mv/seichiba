package com.pl10.seichiba.service;

import com.pl10.seichiba.entity.Producto;
import com.pl10.seichiba.model.ProductoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductoService {

    public abstract Page<Producto> findAll(Pageable pageable);

    public abstract Page<ProductoModel> findAllProductoModel(Pageable pageable);

    public abstract Producto findProducto(String id);

    public abstract ProductoModel findProductoModel(String id);

}
