package com.kevinvolanski.eventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevinvolanski.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, String>{

}
