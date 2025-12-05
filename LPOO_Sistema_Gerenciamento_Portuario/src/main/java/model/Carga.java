/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author jvito
 */
@Entity
public class Carga implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carga_id")
    private Long id;

    @Column(name = "carga_descricao")
    private String descricao;

    @Column(name = "carga_peso")
    private double peso;

    @Column(name = "carga_tipo")
    private String tipo;

    @Column(name = "carga_perigosa")
    private boolean perigosa;

    @OneToMany(mappedBy = "carga")
    private List<OperacaoPortuaria> operacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isPerigosa() {
        return perigosa;
    }

    public void setPerigosa(boolean perigosa) {
        this.perigosa = perigosa;
    }

    public List<OperacaoPortuaria> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(List<OperacaoPortuaria> operacoes) {
        this.operacoes = operacoes;
    }

    public String exibirDados(){
        String aux = "Carga cadastrada:\n";
        aux += "Descrição: "+descricao+"\n";
        aux += "Peso em Quilos: "+peso+"\n";
        aux += "Tipo da Carga: "+tipo+"\n";
        aux += "É perigosa: "+perigosa+"\n";

        return aux;
    }

}
