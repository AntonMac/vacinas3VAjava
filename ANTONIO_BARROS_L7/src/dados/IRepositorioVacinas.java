/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dados;

import java.time.LocalDate;
import java.util.Iterator;
import negocio.Vacina;

/**
 *
 * @author sidneynogueira
 */
public interface IRepositorioVacinas {
    
    public void insere(Vacina vacina);
    
    public Vacina recupera(String nome);
    
    public int quantidade();
    
    public Iterator<Vacina> getVacinas();
   
    
}
