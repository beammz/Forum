package br.com.unesp.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unesp.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {/*herança*/

	List<Topico> findByCursoNome(String nomeCurso); 

}
