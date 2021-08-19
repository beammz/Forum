package br.com.unesp.forum.controller.dto;

import org.springframework.data.domain.Page;

import br.com.unesp.forum.modelo.Curso;

public class CursoDto {
	
	private Long id;
	private String nome;
	private String categoria;
	
	public CursoDto(Curso curso) {
		this.id = curso.getId();
		this.nome = curso.getNome();
		this.categoria = curso.getCategoria();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCategoria() {
		return categoria;
	}
	

	public static Page<CursoDto> converter(Page<Curso> cursos) {
		// TODO Auto-generated method stub
		return cursos.map(CursoDto::new);
	}
	
	
}
