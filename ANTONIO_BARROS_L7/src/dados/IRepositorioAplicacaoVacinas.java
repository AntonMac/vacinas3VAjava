/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.util.Iterator;
import negocio.AplicacaoVacina;

/**
 *
 * @author anton
 */
public interface IRepositorioAplicacaoVacinas {
    
    AplicacaoVacina[] buscaAplicacao(String cpf);
    
    void insereAplicacao(AplicacaoVacina aplicacao);
    
    public Iterator<AplicacaoVacina> todas();
    
}
