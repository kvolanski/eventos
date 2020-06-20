package com.kevinvolanski.eventos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Data
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@NotNull
	private String nome;
	@NotNull
	private String local;
	@NotNull
	private String data;
	@NotNull
	private String horario;
	
	
}
