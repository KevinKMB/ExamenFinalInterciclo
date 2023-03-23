package com.example.demo2.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="Carta")
@Data
public class Carta {

	private String nombre;
	private String categoria;
	private int cantidad;
	
	
	private Long id;
	
}
