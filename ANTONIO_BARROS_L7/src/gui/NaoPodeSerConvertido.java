/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author anton
 */
public class NaoPodeSerConvertido extends Exception{

    public NaoPodeSerConvertido() {
        super("Não pode ser Convertido, Deve ser Numerico");
    }

    public NaoPodeSerConvertido(String message) {
        super(message);
    }
    
    
}
