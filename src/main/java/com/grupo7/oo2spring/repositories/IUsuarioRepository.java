package com.grupo7.oo2spring.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo7.oo2spring.models.Usuario;

@Repository("usuarioRepository")
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	
	 // Buscar usuario por nombre y apellido
    Optional<Usuario> findByNombreAndApellido(String nombre, String apellido);
	
 // Validar existencia de nombreUsuario (devuelve true si existe)
    boolean existsByNombreUsuario(String nombreUsuario);
    
    // Validar existencia de email
    boolean existsByEmail(String email);
    

    // Validar existencia de dni
    boolean existsByDni(String dni);
    
 // Buscar usuario por nombreUsuario
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
    // Buscar usuario por dni
    Optional<Usuario> findByDni(String dni);
	

}
