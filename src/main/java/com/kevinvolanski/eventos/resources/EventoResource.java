package com.kevinvolanski.eventos.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kevinvolanski.eventos.models.Evento;
import com.kevinvolanski.eventos.repository.EventoRepository;

@RestController
@RequestMapping("/evento")
public class EventoResource {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Evento> list() {
		Iterable<Evento> listaEventos = eventoRepository.findAll();
		return listaEventos;
	}
	
	@PostMapping()
	public Evento insert(@RequestBody @Valid Evento evento) {
		return eventoRepository.save(evento);
	}
	
	@DeleteMapping()
	public Evento delete(@RequestBody Evento evento) {
	eventoRepository.delete(evento);
	return evento;
	}
}
