/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;
import java.util.Iterator;
import negocio.Paciente;

/**
 *
 * @author anton
 */
public interface IRepositorioPacientes {
    
    public Paciente buscaPaciente(String cpf);
    
    public void inserePaciente(Paciente paciente);
    
    public Iterator<Paciente> todos();
    
    public boolean existe(Paciente paciente);
    
}
