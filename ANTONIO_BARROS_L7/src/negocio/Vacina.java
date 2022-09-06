/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDate;

/**
 *
 * @author sidneynogueira
 */
public class Vacina {

    private String nome;
    private LocalDate validade;
    private double preco;
    
    public Vacina(String nome, LocalDate validade, double preco) {
        this.nome = nome;
        this.validade = validade;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Vacina) {
            final Vacina other = (Vacina) obj;
            return this.nome.equals(other.nome);
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Vacina{" + "nome=" + nome + ", validade=" + validade + ", preco=" + preco + "}";
    }


}
