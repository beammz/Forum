package br.com.unesp.forum.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.unesp.forum.controller.dto.DetalhesDoTopicoDto;
import br.com.unesp.forum.controller.dto.RespostaDto;
import br.com.unesp.forum.controller.dto.TopicoDto;
import br.com.unesp.forum.controller.form.AtualizacaoTopicoForm;
import br.com.unesp.forum.controller.form.RespostaForm;
import br.com.unesp.forum.controller.form.TopicoForm;
import br.com.unesp.forum.modelo.Resposta;
import br.com.unesp.forum.modelo.Topico;
import br.com.unesp.forum.repository.CursoRepository;
import br.com.unesp.forum.repository.TopicoRepository;
import br.com.unesp.forum.repository.UsuarioRepository;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

	@Autowired
	private TopicoRepository topicoRepository;
	
	@Autowired
	private CursoRepository cursoRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	@Cacheable(value="listaDeTopicos")
	public Page<TopicoDto> lista(@RequestParam(required = false) String nomeCurso, 
			@PageableDefault(sort="id", direction = Direction.ASC, page = 0, size = 10) Pageable paginacao) { /*Método para carregar a lista de todos os tópicos e devolver para quem fez essa chamada*/
		
		if(nomeCurso == null) {
			Page<Topico> topicos = topicoRepository.findAll(paginacao);
			return TopicoDto.converter(topicos); 
		}else {
			Page<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso, paginacao);
			return TopicoDto.converter(topicos); 
		}
	}
	
	/* Método para Cadastrar um tópico:
	 * 
	 * 
	 * 
	*/
	@PostMapping
	@Transactional
	@CacheEvict(value="listaDeTopicos",allEntries=true)
	public ResponseEntity<TopicoDto> cadastrar(@RequestBody @Valid TopicoForm form, UriComponentsBuilder uriBuilder) {
		Topico topico = form.converter(cursoRepository,usuarioRepository);
		topicoRepository.save(topico);
		
		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		return ResponseEntity.created(uri).body(new TopicoDto(topico));
	}
	
	/* Método para Detalhar um tópico:
	 * 
	 * 
	 * 
	*/
	
	@GetMapping("/{id}") /*mapeamento-qnd esse método vai ser chamado qual o método http e como estou consultando dados, a requisição é do tipo get*/
	public ResponseEntity<DetalhesDoTopicoDto> detalhar(@PathVariable Long id) {
		Optional<Topico> topico = topicoRepository.findById(id);
		if(topico.isPresent()) {
			return ResponseEntity.ok(new DetalhesDoTopicoDto(topico.get()));
		}
		
		return ResponseEntity.notFound().build();		
	}
	
	@PutMapping("/{id}")
	@Transactional
	@CacheEvict(value="listaDeTopicos",allEntries=true)
	public ResponseEntity<TopicoDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoTopicoForm form) {
		Optional<Topico> optional = topicoRepository.findById(id);
		if(optional.isPresent()) {
			Topico topico = form.atualizar(id, topicoRepository);
			return ResponseEntity.ok(new TopicoDto(topico));
		}
		
		return ResponseEntity.notFound().build();		
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	@CacheEvict(value="listaDeTopicos",allEntries=true)
	public ResponseEntity<?> remover(@PathVariable Long id) {
		Optional<Topico> optional = topicoRepository.findById(id);
		if(optional.isPresent()) {
			topicoRepository.deleteById(id);
			return ResponseEntity.ok().build();			
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/{id}/resposta")
	@Transactional
	public ResponseEntity<RespostaDto> responder(@PathVariable("id") Long idTopico, @RequestBody @Valid RespostaForm form, UriComponentsBuilder uriBuilder) {
	    Topico topico = topicoRepository.getById(idTopico);
	    Resposta resposta = form.converter(usuarioRepository);
	    topico.adicionarResposta(resposta);

	    URI uri = uriBuilder.path("/topicos/{id}/resposta/{idResposta}").buildAndExpand(topico.getId(), resposta.getId()).toUri();
	    return ResponseEntity.created(uri).body(new RespostaDto(resposta));
	}
}
