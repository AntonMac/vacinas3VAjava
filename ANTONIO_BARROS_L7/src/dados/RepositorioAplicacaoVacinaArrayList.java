/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.util.ArrayList;
import java.util.Iterator;
import negocio.AplicacaoVacina;

/**
 *
 * @author anton
 */
public class RepositorioAplicacaoVacinaArrayList implements IRepositorioAplicacaoVacinas{
    
    private ArrayList<AplicacaoVacina> aplicacoes;

    public RepositorioAplicacaoVacinaArrayList() {
        this.aplicacoes = new ArrayList<>();
    }
    
    

    @Override
    public AplicacaoVacina[] buscaAplicacao(String cpf) {
        ArrayList<AplicacaoVacina> saida = new ArrayList<>();
        for(AplicacaoVacina aplicacao: this.aplicacoes){
            if(aplicacao.getPaciente().getCpf().contentEquals(cpf)){
                saida.add(aplicacao);
            }
        }
        return (AplicacaoVacina[]) saida.toArray();
        
    }

    @Override
    public void insereAplicacao(AplicacaoVacina aplicacao) {
        this.aplicacoes.add(aplicacao);        
    }

    @Override
    public Iterator<AplicacaoVacina> todas(){
        
        return this.aplicacoes.iterator();
        
    }
    
}
