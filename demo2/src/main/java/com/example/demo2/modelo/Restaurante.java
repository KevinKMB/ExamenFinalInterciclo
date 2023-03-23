package com.example.demo2.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="Restaurante")
@Data
public class Restaurante {

	private String nombre;
	private String telefono;
	private String correo;
	private String direccion;
	
	private Long id;
	
}
