package br.com.unesp.forum.controller.dto;

import br.com.unesp.forum.modelo.Usuario;

public class UsuarioDto {

	private Long id;
	private String nome;
	private String email;
	private String role;
	
	public UsuarioDto(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.role = usuario.getAuthorities().iterator().next().getAuthority();
		
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	public String getRole() {
		return role;
	}


	
}
