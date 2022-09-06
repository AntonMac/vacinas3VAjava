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
public class AplicacaoVacina {
    
    private Vacina vacina;
    private LocalDate data;
    private Paciente paciente;

    public AplicacaoVacina(Vacina vacina, LocalDate data, Paciente paciente) {
        this.vacina = vacina;
        this.data = data;
        this.paciente = paciente;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Vacina: " + this.vacina +"\n" +
                "Data da Aplicação: " + this.data +
                " || Paciente: " + this.paciente;
    }

    public Vacina getVacina() {
        return this.vacina;
    }
    
    
    
    
}
