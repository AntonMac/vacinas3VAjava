/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author anton
 */
public class PacienteJaExisteException extends Exception{

    public PacienteJaExisteException() {
        super("Já Existe um Paciente com este CPF.");
    }

    public PacienteJaExisteException(String message) {
        super(message);
    }
    
}
