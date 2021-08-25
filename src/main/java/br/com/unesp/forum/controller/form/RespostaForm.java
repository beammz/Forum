package br.com.unesp.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import br.com.unesp.forum.modelo.Resposta;

public class RespostaForm {

	@NotNull @NotEmpty @Length(min = 10)
	private String mensagem;
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Resposta converter() {
		return new Resposta(mensagem);
	}


}
