package com.minimarket.app.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.minimarket.app.servicio.CategoriaServicio;
import com.minimarket.app.servicio.MarcaServicio;
import com.minimarket.app.servicio.ProductoServicio;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private ProductoServicio productoServicio;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("content", "admin/dashboard");
        return "layout/admin-layout";
    }

	@Autowired
	private CategoriaServicio categoriaServicio; 

	@Autowired
	private MarcaServicio marcaServicio;
	
    @GetMapping("/productos")
    public String productos(Model model) {
    	model.addAttribute("productos", productoServicio.listarTodos());
    	//enviamos las listas para los select del modal
    	model.addAttribute("categorias", categoriaServicio.listarTodas());
    	model.addAttribute("marcas", marcaServicio.listarTodos());
  
        model.addAttribute("content", "admin/productos");
        return "layout/admin-layout";
    }
}