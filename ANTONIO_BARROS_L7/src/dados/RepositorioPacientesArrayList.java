/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.util.ArrayList;
import java.util.Iterator;
import negocio.Paciente;

/**
 *
 * @author anton
 */
public class RepositorioPacientesArrayList implements IRepositorioPacientes{
    
    private ArrayList<Paciente> pacientes;

    public RepositorioPacientesArrayList() {
        this.pacientes = new ArrayList<Paciente>();
    }
    
    @Override
    public Paciente buscaPaciente(String cpf){
        
        for(Paciente paciente: this.pacientes){
            if(paciente.getCpf().contentEquals(cpf)){
                return paciente;
            }
        }
        return null;
        
    }
    
    @Override
    public void inserePaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }
    
    @Override
    public Iterator<Paciente> todos(){
       return this.pacientes.iterator();
    }
    
    @Override
    public boolean existe(Paciente paciente){
        for(Paciente paci : this.pacientes){
            
            if(paci.getCpf().contentEquals(paciente.getCpf())){
                
                return true;
            
            }
        }
        
        return false;
    }
    
}
