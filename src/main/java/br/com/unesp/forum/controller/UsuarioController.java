package br.com.unesp.forum.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.unesp.forum.controller.dto.UsuarioDto;
import br.com.unesp.forum.modelo.Usuario;
import br.com.unesp.forum.repository.UsuarioRepository;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	
	@GetMapping("") /*mapeamento-qnd esse método vai ser chamado qual o método http e como estou consultando dados, a requisição é do tipo get*/
	public ResponseEntity<UsuarioDto> detalhar() {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Optional<Usuario> usuario = usuarioRepository.findByEmail(auth.getName());

		if(usuario.isPresent()) {
			return ResponseEntity.ok(new UsuarioDto(usuario.get()));
		}
		
		return ResponseEntity.notFound().build();		
	}
	
}
