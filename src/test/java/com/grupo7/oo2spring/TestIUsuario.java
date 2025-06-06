package com.grupo7.oo2spring;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.grupo7.oo2spring.models.Cliente;
import com.grupo7.oo2spring.models.Usuario;
import com.grupo7.oo2spring.repositories.IUsuarioRepository;
import com.mysql.cj.xdevapi.Client;

@SpringBootTest
public class TestIUsuario {

	@Autowired
    private IUsuarioRepository usuarioRepository;
	
	@Test
    void testGuardarYBuscarUsuario() {
        // Crear usuario
		try { 
        Usuario usuario = new Cliente("Roberto", "Jimenez", "34672169", "roberto.jimenez@example.com", "rober", "test", "123");
     // Guardar en DB
        usuario = usuarioRepository.save(usuario);

        // Buscar por ID
        Optional<Usuario> encontrado = usuarioRepository.findById(usuario.getIdUsuario());
        assertThat(encontrado).isPresent();

        // Verificar datos
        assertThat(encontrado.get().getNombre()).isEqualTo("Roberto");
        assertThat(encontrado.get().getApellido()).isEqualTo("Jimenez");

        // Buscar todos los usuarios
        List<Usuario> lista = usuarioRepository.findAll();
        assertThat(lista).isNotEmpty();
        assertThat(lista).contains(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }
}
