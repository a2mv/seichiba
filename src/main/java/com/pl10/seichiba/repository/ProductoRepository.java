package com.pl10.seichiba.repository;

import com.pl10.seichiba.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("productoRepository")
public interface ProductoRepository extends JpaRepository<Producto, Serializable> {

    public Producto findById(String id);
}
