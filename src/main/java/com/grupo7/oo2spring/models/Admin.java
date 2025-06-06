package com.grupo7.oo2spring.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Admin extends Usuario {

    public Admin(String nombre, String apellido, String dni, String email,String nombreUsuario, String password) throws Exception {
      super(nombre, apellido, dni, email, nombreUsuario, password);
    }
}