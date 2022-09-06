/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDate;
import util.Util;

/**
 *
 * @author anton
 */
public abstract class Paciente {
    private String nome;
    private LocalDate nascimento;
    private String cpf;

    public Paciente(String nome, LocalDate nascimento, String cpf) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public int getIdade(){
        LocalDate hoje = LocalDate.now();
        return Util.diferencaAnos(this.nascimento, hoje);      
    }

    

    @Override
    public boolean equals(Object obj) {
        
        if (obj != null && obj instanceof Paciente) {
            final Paciente other = (Paciente) obj;
            return this.cpf.equals(other.cpf);
        }
        
     
        return false;
    }
    
   
    
    
    
    
}
