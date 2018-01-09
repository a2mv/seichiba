package com.pl10.seichiba.service.impl;

import com.pl10.seichiba.converter.ProductoConverter;
import com.pl10.seichiba.entity.Producto;
import com.pl10.seichiba.model.ProductoModel;
import com.pl10.seichiba.repository.ProductoRepository;
import com.pl10.seichiba.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("productoService")
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    @Qualifier("productoRepository")
    private ProductoRepository productoRepository;

    @Autowired
    @Qualifier("productoConverter")
    private ProductoConverter productoConverter;

    @Override
    public Page<Producto> findAll(Pageable pageable) {
        return productoRepository.findAll(pageable);
    }

    @Override
    public Page<ProductoModel> findAllProductoModel(Pageable pageable) {
        Page<Producto> productos = findAll(pageable);
        List<ProductoModel> productoModels = new ArrayList<ProductoModel>();
        for(Producto producto: productos){
            productoModels.add(productoConverter.productoToProductoModel(producto));
        }
        Page<ProductoModel> pageProductoModels = new PageImpl<>(productoModels,pageable,productos.getTotalElements());
        return pageProductoModels;
    }
}
