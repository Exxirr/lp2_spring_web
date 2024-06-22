package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_usuario")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity {

	@Id
	private String correo;
	
	private String nombre;
	
	private String celular;
	
	private String password;
	
	private String urlImagen;
	

}
