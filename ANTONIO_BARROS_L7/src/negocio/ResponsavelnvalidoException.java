/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author anton
 */
public class ResponsavelnvalidoException extends Exception{

    public ResponsavelnvalidoException() {
        super("Paciente Menor sem Responsavel Maior de Idade!");
    }

    public ResponsavelnvalidoException(String message) {
        super(message);
    }
    
    
}
