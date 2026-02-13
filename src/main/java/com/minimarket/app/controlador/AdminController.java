package com.minimarket.app.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.minimarket.app.servicio.ProductoServicio;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private ProductoServicio productoServicio;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("content", "admin/dashboard");
        return "layout/admin-layout";
    }

    @GetMapping("/productos")
    public String productos(Model model) {
    
        model.addAttribute("content", "admin/productos");
        return "layout/admin-layout";
    }
}