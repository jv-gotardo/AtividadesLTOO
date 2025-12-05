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
public class Berco implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "berco_id")
    private Long id;

    @Column(name = "berco_numero")
    private int numero;

    @Column(name = "berco_comprimento_maximo")
    private double comprimentoMaximo;

    @Column(name = "berco_ocupado")
    private boolean ocupado;

    @Column(name = "berco_tipo_operacao")
    private String tipoOperacao;

    @OneToMany(mappedBy = "berco")
    private List<OperacaoPortuaria> operacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getComprimentoMaximo() {
        return comprimentoMaximo;
    }

    public void setComprimentoMaximo(double comprimentoMaximo) {
        this.comprimentoMaximo = comprimentoMaximo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public List<OperacaoPortuaria> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(List<OperacaoPortuaria> operacoes) {
        this.operacoes = operacoes;
    }
    
    public String exibirDados(){
        String aux = "Berço cadastrado:\n";
        aux += "Número: "+numero+"\n";
        aux += "Ocupação: "+ocupado+"\n";
        aux += "Tipo da Operação: "+tipoOperacao+"\n";
        aux += "Comprimento Máximo em Metros: "+comprimentoMaximo+"\n";

        return aux;
    }

    @Override
    public String toString() {
        return "numero=" + numero;
    }
    
    
}
