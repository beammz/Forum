// package br.com.unesp.forum.controller.dto;

// import org.springframework.data.domain.Page;

// import br.com.unesp.forum.modelo.Usuario;

// public class UsuarioDto {
	
// 	private Long id;
// 	private String nome;
// 	private String email;
	
// 	public UsuarioDto(Usuario usuario) {
// 		this.id = usuario.getId();
// 		this.nome = usuario.getNome();
// 		this.email = usuario.getEmail();
// 	}
	
// 	public Long getId() {
// 		return id;
// 	}
// 	public String getNome() {
// 		return nome;
// 	}
// 	public String getEmail() {
// 		return email;
// 	}
	

// 	public static Page<UsuarioDto> converter(Page<Usuario> usuarios) {
// 		// TODO Auto-generated method stub
// 		return usuarios.map(UsuarioDto::new);
// 	}
	
	
// }
