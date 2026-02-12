package com.minimarket.app.servicio;

import java.util.List;
import com.minimarket.app.entidad.Producto;


public interface ProductoServicio {
	
	  // Listar todos los productos
    List<Producto> listarTodos();

    // Buscar producto por ID
    Producto buscarPorId(Long id);

    // Registrar o actualizar producto
    Producto guardar(Producto producto);

    // Eliminar producto por ID
    void eliminar(Long id);
}
