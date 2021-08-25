// package br.com.unesp.forum.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.cache.annotation.Cacheable;
// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.Pageable;
// import org.springframework.data.domain.Sort.Direction;
// import org.springframework.data.web.PageableDefault;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import br.com.unesp.forum.controller.dto.UsuarioDto;
// import br.com.unesp.forum.modelo.Usuario;
// import br.com.unesp.forum.repository.UsuarioRepository;

// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.context.SecurityContextHolder;

// @RestController
// @RequestMapping("/usuario")
// public class UsuarioController {
	
// 	@Autowired
// 	private UsuarioRepository usuarioRepository;
	
// 	@GetMapping
// 	@Cacheable(value="user")
// 	// public Page<CursoDto> lista(@RequestParam(required = false) String nomeCurso, 
// 	// public Page<CursoDto> lista( 
// 	public UsuarioDto usuario( 
// 		// @PageableDefault(sort="id", direction = Direction.ASC, page = 0, size = 10) Pageable paginacao) { /*Método para carregar a lista de todos os tópicos e devolver para quem fez essa chamada*/
		
// 		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
// 		Usuario usuario = usuarioRepository.findByEmail(auth.getName()).get();
// 				// Usuario usuario = usuarioRepository.findAll(paginacao);
// 		return UsuarioDto.converter(usuario); 
		
// 	}
// 	@GetMapping("/")
// 	public ResponseEntity<DetalhesDoTopicoDto> detalhar(@PathVariable Long id) {
// 		Optional<Topico> topico = topicoRepository.findById(id);
// 		if(topico.isPresent()) {
// 			return ResponseEntity.ok(new DetalhesDoTopicoDto(topico.get()));
// 		}
		
// 		return ResponseEntity.notFound().build();		
// 	}
	

// }
