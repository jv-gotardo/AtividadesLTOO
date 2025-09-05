package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jvito
 */
public class Cliente extends Pessoa{

    @Override
    public String toString() {
        return "Cliente:" + "Nome - " + super.getNome() + 
                ", CPF - " + super.getCpf() + 
                ", Data de Nascimento - " + super.getDataNascimento() + 
                ", Telefone - " + super.getTelefone() + '.';
    }
    
}
