package com.Proyecto.Chifa.Modelo;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
public class RegistroDto {
    
    @NotEmpty(message = "Ingrese su nombre")
    private String nombre;
    
    @NotEmpty(message = "Ingrese su apellido")
    private String apellido;
    
    @NotEmpty(message = "Ingrese su DNI")
    @Size(max= 8)
    private String dni;
    
    @NotEmpty(message = "Ingrese su telefono")
    @Size(max=9)
    private String telefono;
    
    @NotEmpty(message = "Ingrese su dirección")
    private String direccionPredeterminada;
    
    @Email
    @NotEmpty(message = "Ingrese su dirección de correo electrónico")
    private String email;
    
    @Size(min=8, message = "La contraseña debe tener al menos 8 caracteres")
    private String contrasena;
    
    private String confirmarContrasena;
    
    private String rol;
    
}
