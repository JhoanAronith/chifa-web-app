package com.Proyecto.Chifa.Modelo;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    private String nombre;
    private String apellido;
    @Column(unique = true)
    private String dni;
    private String telefono;
    private String direccionPredeterminada;
    @Column(unique = true, nullable = false)
    private String email;
    private String contrasena;
    private String rol;

    public Usuario() {
    }
   
}
