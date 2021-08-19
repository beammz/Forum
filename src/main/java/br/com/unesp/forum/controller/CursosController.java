package br.com.unesp.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unesp.forum.controller.dto.CursoDto;
import br.com.unesp.forum.modelo.Curso;
import br.com.unesp.forum.repository.CursoRepository;

@RestController
@RequestMapping("/cursos")
public class CursosController {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	@Cacheable(value="listaDeCursos")
	// public Page<CursoDto> lista(@RequestParam(required = false) String nomeCurso, 
	public Page<CursoDto> lista( 
			@PageableDefault(sort="id", direction = Direction.ASC, page = 0, size = 10) Pageable paginacao) { /*Método para carregar a lista de todos os tópicos e devolver para quem fez essa chamada*/
				Page<Curso> cursos = cursoRepository.findAll(paginacao);
				return CursoDto.converter(cursos); 
		
	}
	

}
