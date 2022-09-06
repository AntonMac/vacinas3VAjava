/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.util.ArrayList;
import java.util.Iterator;
import negocio.Vacina;

/**
 *
 * @author sidneynogueira
 */
public class RepositorioVacinasArrayList implements IRepositorioVacinas {
    
    private ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
    
    @Override
    public void insere(Vacina vacina){
        vacinas.add(vacina);
    }
    
    @Override
    public Vacina recupera(String nome) {
        Vacina vacina = null;
        for (int i = 0; i < vacinas.size(); i++) {
            Vacina v = vacinas.get(i);
            if(v.getNome().equals(nome)){
                return v;                
            }
        }
        return vacina;
    }

    @Override
    public int quantidade() {
        return this.vacinas.size();
    }

    @Override
    public Iterator<Vacina> getVacinas() {
        return this.vacinas.iterator();
    }


    
}
