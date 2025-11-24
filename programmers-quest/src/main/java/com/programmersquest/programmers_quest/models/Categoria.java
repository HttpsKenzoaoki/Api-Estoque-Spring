package com.programmersquest.programmers_quest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Produto> produtos;

    public Categoria() {}

    public Categoria(String nome, List<Produto> produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public List<Produto> getProdutos() { return produtos;}
    public void setProdutos(List<Produto> produtos) {this.produtos = produtos;}
}
