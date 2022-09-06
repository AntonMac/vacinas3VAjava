/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDate;

/**
 *
 * @author anton
 */
public class Adulto extends Paciente{
    
    private String endereco;

    public Adulto(String nome, LocalDate nascimento, String cpf, String endereco) {
        super(nome, nascimento, cpf);
        this.endereco = endereco;
    }

    

    @Override
    public String toString() {
        return "Nome: " + this.getNome()+
               ", Nascimento: " + this.getNascimento()+
               " ,Cpf: " + this.getCpf() +
               " ,Endereço: " + this.endereco;
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if (obj != null && obj instanceof Adulto) {
            final Adulto other = (Adulto) obj;
            return getCpf().equals(other.getCpf());
        }
        
     
        return false;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
   
}