package com.example.demo.entity;

import java.time.LocalDate;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_pedido")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PedidoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pedidoId;
	
	private LocalDate fechaCompra;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private UsuarioEntity usuarioEntity;
	
}
