package br.com.unesp.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unesp.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
