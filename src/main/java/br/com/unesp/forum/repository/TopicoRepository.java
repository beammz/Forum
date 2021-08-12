package br.com.unesp.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unesp.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {/*herança*/

	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao); 

}
