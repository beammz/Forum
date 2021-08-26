package br.com.unesp.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import br.com.unesp.forum.modelo.Resposta;
import br.com.unesp.forum.modelo.Usuario;
import br.com.unesp.forum.repository.UsuarioRepository;

public class RespostaForm {

	@NotNull @NotEmpty @Length(min = 10)
	private String mensagem;
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Resposta converter(UsuarioRepository usuarioRepository) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Usuario autor = usuarioRepository.findByEmail(auth.getName()).get();
		return new Resposta(mensagem, autor);
	}


}
