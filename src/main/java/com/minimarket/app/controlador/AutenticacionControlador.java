/*
 * package com.minimarket.app.controlador;
 * 
 * import com.minimarket.app.entidad.Usuario; import
 * com.minimarket.app.servicio.UsuarioServicio; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.*;
 * 
 * import jakarta.servlet.http.HttpSession;
 * 
 *//**
	 * Controla el proceso de autenticación de usuarios.
	 */
/*
 * @Controller
 * 
 * @RequestMapping("/autenticacion") public class AutenticacionControlador {
 * 
 * @Autowired private UsuarioServicio usuarioServicio;
 * 
 *//**
	 * Muestra la vista de inicio de sesión.
	 */
/*
 * @GetMapping("/login") public String mostrarLogin() { return "login"; }
 * 
 *//**
	 * Procesa el inicio de sesión del usuario.
	 */
/*
 * @PostMapping("/login") public String procesarLogin(
 * 
 * @RequestParam String usuario,
 * 
 * @RequestParam String contrasena, HttpSession sesion, Model modelo) {
 * 
 * Usuario usuarioEncontrado = usuarioServicio.buscarPorUsuario(usuario);
 * 
 * if (usuarioEncontrado == null || !usuarioEncontrado.isHabilitado()) {
 * modelo.addAttribute("error", "Usuario no válido o deshabilitado"); return
 * "login"; }
 * 
 * if (!usuarioServicio.verificarContrasena(contrasena,
 * usuarioEncontrado.getContrasena())) { modelo.addAttribute("error",
 * "Contraseña incorrecta"); return "login"; }
 * 
 * // Guarda el usuario en sesión sesion.setAttribute("usuarioLogueado",
 * usuarioEncontrado);
 * 
 * return "redirect:/producto"; }
 * 
 *//**
	 * Cierra la sesión del usuario.
	 *//*
		 * @GetMapping("/logout") public String cerrarSesion(HttpSession sesion) {
		 * sesion.invalidate(); return "redirect:/autenticacion/login"; } }
		 */