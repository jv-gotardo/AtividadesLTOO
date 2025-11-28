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
public class Navio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "navio_id")
    private Long id;

    @Column(name = "navio_nome")
    private String nome;

    @Column(name = "navio_imo")
    private String imo;

    @Column(name = "navio_comprimento")
    private double comprimento;

    @Column(name = "navio_tonelagem")
    private double tonelagem;

    @Column(name = "navio_bandeira")
    private String bandeira;

    @OneToMany(mappedBy = "navio")
    private List<OperacaoPortuaria> operacoes;

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

    public String getImo() {
        return imo;
    }

    public void setImo(String imo) {
        this.imo = imo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getTonelagem() {
        return tonelagem;
    }

    public void setTonelagem(double tonelagem) {
        this.tonelagem = tonelagem;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public List<OperacaoPortuaria> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(List<OperacaoPortuaria> operacoes) {
        this.operacoes = operacoes;
    }
}
