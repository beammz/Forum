package br.com.unesp.forum.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unesp.forum.modelo.Resposta;

public interface RespostaRepository extends JpaRepository<Resposta, Long>{

	Optional<Resposta> findByMensagem(String mensagem);
	
}
