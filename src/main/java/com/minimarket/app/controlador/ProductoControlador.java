package com.minimarket.app.controlador;

import com.minimarket.app.entidad.Producto;
import com.minimarket.app.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productos")
public class ProductoControlador {
	
	   @Autowired
	    private ProductoServicio productoServicio;

	    // LISTAR
	    @GetMapping
	    public String listar(Model model) {
	        model.addAttribute("productos", productoServicio.listarTodos());
	        return "producto/listar";
	    }

	    // FORM NUEVO
	    @GetMapping("/nuevo")
	    public String nuevo(Model model) {
	        model.addAttribute("producto", new Producto());
	        return "producto/formulario";
	    }

	    // GUARDAR
	    @PostMapping("/guardar")
	    public String guardar(@ModelAttribute Producto producto) {
	        productoServicio.guardar(producto);
	        return "redirect:/productos";
	    }

	    // FORM EDITAR
	    @GetMapping("/editar/{id}")
	    public String editar(@PathVariable Long id, Model model) {
	        model.addAttribute("producto", productoServicio.buscarPorId(id));
	        return "producto/formulario";
	    }

	    // ELIMINAR (lógico o físico)
	    @GetMapping("/eliminar/{id}")
	    public String eliminar(@PathVariable Long id) {
	        productoServicio.eliminar(id);
	        return "redirect:/productos";
	    }
}
