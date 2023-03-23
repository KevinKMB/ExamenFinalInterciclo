package com.example.demo2.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Document(collection="Plato")
@Data
public class Plato {

	private Long id;
	private String nombrePlato;
	private String descripcion;
	private double precio;
	
	
}
