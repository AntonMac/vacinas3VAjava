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
public class Menor extends Paciente{
    private Adulto responsavel;
    

    public Menor(String nome, LocalDate nascimento, String cpf, Adulto responsavel) {
        super(nome, nascimento, cpf);
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Nome: "+ this.getNome() +
               " ,Nascimento: " + this.getNascimento() + 
               " , Cpf: " + this.getCpf() +
               " ,Responsavel: " + this.responsavel.getNome();
    }

    public Adulto getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(Adulto responsavel) {
        this.responsavel = responsavel;
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if (obj != null && obj instanceof Menor) {
            final Menor other = (Menor) obj;
            return getCpf().equals(other.getCpf());
        }
        
     
        return false;
    }
    
}