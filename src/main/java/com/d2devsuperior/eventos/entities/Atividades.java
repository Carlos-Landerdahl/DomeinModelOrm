package com.d2devsuperior.eventos.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(mappedBy = "atividade")
    private List<Participante> participante = new ArrayList<>();

    @OneToMany(mappedBy = "atividade", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bloco> blocos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Atividades() {
    }

    public Atividades(Long id, String nome, String descricao, Double preco, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<Participante> getParticipante() {
        return participante;
    }

    public List<Bloco> getBlocos() {
        return blocos;
    }
}
