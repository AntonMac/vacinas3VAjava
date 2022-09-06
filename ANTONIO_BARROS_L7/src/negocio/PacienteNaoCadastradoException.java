/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author anton
 */
public class PacienteNaoCadastradoException extends Exception{

    public PacienteNaoCadastradoException() {
        super("Paciente Não Cadastrado!");
    }

    public PacienteNaoCadastradoException(String message) {
        super(message);
    }
    
    
    
    
}
