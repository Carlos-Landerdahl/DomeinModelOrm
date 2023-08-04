package com.d2devsuperior.eventos.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_atividades")
public class Atividades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(columnDefinition = "TEXT")
    private String descricao;
    private Double preco;
}
