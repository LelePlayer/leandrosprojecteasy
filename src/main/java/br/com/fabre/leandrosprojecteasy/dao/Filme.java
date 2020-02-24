package br.com.fabre.leandrosprojecteasy.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Classe responsável espelho da tabela do banco
 */
@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String tipo;
    private Float Valor;

    public Filme() {
    }

    public Filme(Integer id, String nome, String tipo, Float valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        Valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getValor() {
        return Valor;
    }

    public void setValor(Float valor) {
        Valor = valor;
    }
}
