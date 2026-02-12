package com.minimarket.app.entidad;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


//Representa a los usuarios del sistema
@Entity
@Table(name = "usuarios")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Usuario {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String usuario;

    private String contrasena;

    private boolean habilitado;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "usuario_roles",
        joinColumns = @JoinColumn(name = "usuario_id"),
        inverseJoinColumns = @JoinColumn(name = "rol_id")
    )
    
    private Set<Rol> roles;
}
