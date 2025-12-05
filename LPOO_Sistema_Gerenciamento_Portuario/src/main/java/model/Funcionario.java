/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author jvito
 */
@Entity
public class Funcionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "funcionario_id")
    private Long id;
    
    @Column(name = "funcionario_nome")
    private String nome;
    
    @Column(name = "funcionario_cargo")
    private String cargo;            // operador

    @Column(name = "funcionario_salario")
    private double salario;
    
    @Column(name = "funcionario_turno")
    private int turno;               // 1, 2 ou 3    

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public String exibirDados(){
        String aux = "Funcionário cadastrado:\n";
        aux += "Nome: "+nome+"\n";
        aux += "Cargo: "+cargo+"\n";
        aux += "Salário em R$: "+salario+"\n";
        aux += "Turno: "+turno+"\n";

        return aux;
    }
    
    @Override
    public String toString() {
        return "funcionario=" + nome;
    }
}
