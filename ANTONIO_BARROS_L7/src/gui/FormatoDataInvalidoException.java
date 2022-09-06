/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author anton
 */
public class FormatoDataInvalidoException extends Exception{

    public FormatoDataInvalidoException() {
        super("Data Invalida, Deve ex: 01/01/2001");
    }

    public FormatoDataInvalidoException(String message) {
        super(message);
    }
    
    
}
