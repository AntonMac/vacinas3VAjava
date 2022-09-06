/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dados.IRepositorioAplicacaoVacinas;
import dados.IRepositorioPacientes;
import dados.IRepositorioVacinas;
import dados.RepositorioAplicacaoVacinaArrayList;
import dados.RepositorioPacientesArrayList;
import dados.RepositorioVacinasArrayList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sidneynogueira
 */
public class SistemaVacinas {

    private IRepositorioVacinas vacinas;
    private IRepositorioPacientes pacientes;
    private IRepositorioAplicacaoVacinas aplicacoes;

    static SistemaVacinas singleton;

    public static SistemaVacinas getInstance() {
        if (singleton == null) {
            singleton = new SistemaVacinas();
        }
        return singleton;
    }

    private SistemaVacinas() {
        this.vacinas = new RepositorioVacinasArrayList();
        this.pacientes = new RepositorioPacientesArrayList();
        this.aplicacoes = new RepositorioAplicacaoVacinaArrayList();
    }

    public void cadastraVacina(Vacina vacina) throws VacinaJaExisteException {
        if (this.vacinas.recupera(vacina.getNome()) == null) {
            this.vacinas.insere(vacina);
        } else {
            throw new VacinaJaExisteException("Vacina '" + vacina.getNome() + "' já esta cadastrada!");
        }
    }

    public Iterator<Vacina> todasVacinas() {
        return this.vacinas.getVacinas();
    }

    public Vacina[] getVacinasVencem(int ano, int mes) {
        ArrayList<Vacina> vencem = new ArrayList<>();
        for (Iterator<Vacina> iterator = vacinas.getVacinas(); iterator.hasNext();) {
            Vacina v = iterator.next();
            LocalDate validade = v.getValidade();
            if (validade.getYear() == ano && validade.getMonthValue() == mes) {
                vencem.add(v);
            }
        }
        Vacina vencemArray[] = new Vacina[vencem.size()];
        for (int i = 0; i < vencemArray.length; i++) {
            vencemArray[i] = vencem.get(i);
        }

        return vencemArray;
    }
    
    public void cadastrarPaciente(Paciente paciente) throws PacienteJaExisteException, 
                                                            ResponsavelnvalidoException{
        
        if(this.pacientes.existe(paciente)){
            
            throw new PacienteJaExisteException();
            
        }else if(paciente.getIdade()>=18){
            
            this.pacientes.inserePaciente(paciente);
            
        }else if(paciente instanceof Menor){
            
            Menor pacienteM = (Menor)paciente;
            //System.out.println(pacienteM.getResponsavel().getIdade());
            if(pacienteM.getResponsavel()==null||pacienteM.getResponsavel().getIdade()<18){
                
                throw new ResponsavelnvalidoException();
            }else{
            //System.out.println("+1\n");
            this.pacientes.inserePaciente(paciente);
            }     
        }
    }
    
    public void cadastrarAplicacao(AplicacaoVacina aplicacao) 
            throws PacienteNaoCadastradoException, 
                   VacinaNaoCadastradaException, 
                   VacinaVencidaException{
        
        LocalDate hoje = LocalDate.now();
        
        if(!this.pacientes.existe(aplicacao.getPaciente())){
            
            throw new PacienteNaoCadastradoException();
        
        }else if(this.vacinas.recupera(aplicacao.getVacina().getNome())==null){
            
            throw new VacinaNaoCadastradaException();
            
        }else if(aplicacao.getVacina().getValidade().isBefore(hoje)){
            
            //System.out.println(aplicacao.getVacina().getValidade().isBefore(hoje));
            
            throw new VacinaVencidaException();
            
        }else{
            
            this.aplicacoes.insereAplicacao(aplicacao);
            
        }
    }
    
    public Iterator<Paciente> todosPacientes(){
        
        return this.pacientes.todos();
    
    }
    
    public Iterator<AplicacaoVacina> todasAplicacoes(){
        
        return this.aplicacoes.todas();
        
    }
    /**
     * Procura por um cpf na Array de Pacientes e devolve se for adulto.
     * @param Cpf
     * Cpf do Adulto a ser verificado no cadastrod e pacientes
     * @return 
     */
    public Adulto getAdulto(String Cpf){
        Paciente temp = this.pacientes.buscaPaciente(Cpf);
        if(temp==null || (temp instanceof Menor)){
            return null;
        }else{
            Adulto saida = (Adulto)temp;
            return saida;
        }
                
    }
    

}
