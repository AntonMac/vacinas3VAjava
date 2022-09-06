/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author anton
 */
public class VacinaVencidaException extends Exception{

    public VacinaVencidaException() {
        super("Vacina com validade Vencida!");
    }

    public VacinaVencidaException(String message) {
        super(message);
    }
    
    
    
}
