package com.minimarket.app.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minimarket.app.entidad.Producto;
import com.minimarket.app.repositorio.ProductoRepositorio;

@Service
public class ProductoServicioImpl implements ProductoServicio {
	

    @Autowired
    private ProductoRepositorio productoRepositorio;

    // Retorna todos los productos
    @Override
    public List<Producto> listarTodos() {
        return productoRepositorio.findAll();
    }

    // Busca un producto por su ID
    @Override
    public Producto buscarPorId(Long id) {
        return productoRepositorio.findById(id).orElse(null);
    }

    // Guarda o actualiza un producto
    @Override
    public Producto guardar(Producto producto) {
        return productoRepositorio.save(producto);
    }

    // Elimina un producto por su ID
    @Override
    public void eliminar(Long id) {
        productoRepositorio.deleteById(id);
    }
}
