/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

/**
 *
 * @author jvito
 */
@Entity
public class OperacaoPortuaria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operacao_portuaria_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "operacao_portuaria_navio")
    private Navio navio;

    @ManyToOne
    @JoinColumn(name = "operacao_portuaria_carga")
    private Carga carga;

    @ManyToOne
    @JoinColumn(name = "operacao_portuaria_berco")
    private Berco berco;
    
    @ManyToOne
    @JoinColumn(name = "operacao_portuaria_funcionario")
    private Funcionario funcionario;

    @Enumerated(EnumType.STRING)
    @Column(name = "operacao_portuaria_tipo")
    private String tipo; //TipoOperacao

    @Column(name = "operacao_portuaria_data_hora")
    private LocalDateTime dataHora;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    public Berco getBerco() {
        return berco;
    }

    public void setBerco(Berco berco) {
        this.berco = berco;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    
    
}
