/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;

/**
 *
 * @author sidneynogueira
 * 
 * Modificado por Antonio Macena em 15/05/2022 para LAB de Programação II
 * L6 - 2 VA
 */
public class TesteSistema {
    
    public static void listaVacinas(Iterator<Vacina> vacinas){
        while(vacinas.hasNext()) {
            Vacina v = vacinas.next();
            System.out.println(v);
        }
    }
    
    public static void listaVacinas(Vacina[] vacinas){
        for (Vacina vacina : vacinas) {
            System.out.println(vacina);
        }
    }
    
    public static void listaPacientes(Iterator<Paciente> pacientes){
        while(pacientes.hasNext()) {
            Paciente p = pacientes.next();
            System.out.println(p);
        }
    }
    
    public static void listaAplicacoes(Iterator<AplicacaoVacina> aplicacoes){
        while(aplicacoes.hasNext()) {
            AplicacaoVacina ap = aplicacoes.next();
            System.out.println(ap);
        }
    }

    
    public static void main(String[] args) throws VacinaJaExisteException, 
                                                  PacienteJaExisteException, 
                                                  ResponsavelnvalidoException, 
                                                  PacienteNaoCadastradoException, 
                                                  VacinaNaoCadastradaException, 
                                                  VacinaVencidaException {
        
        SistemaVacinas sistema = SistemaVacinas.getInstance();
        Vacina v1 = new Vacina("Coronavac",LocalDate.of(2022, Month.AUGUST, 10),50.6);
        Vacina v2 = new Vacina("Jansem",LocalDate.of(2022, Month.APRIL, 20),80);
        sistema.cadastraVacina(v1);
        sistema.cadastraVacina(v2);
        sistema.cadastraVacina(new Vacina("Teste",LocalDate.of(2022, Month.AUGUST, 11),30 ));
        listaVacinas(sistema.todasVacinas());
        //listaVacinas(sistema.getVacinasVencem(2022, 8)); 
        System.out.println("\n");
        //======Teste das Classes Após Modificações=======//
        
        
        //===== Instanciamento de pacientes============//
        Adulto p1 = new Adulto("Antonio",LocalDate.of(1980, Month.SEPTEMBER, 19), "38423842","Rua Tal" );
        Adulto p2 = new Adulto("Damiao",LocalDate.of(1990, Month.AUGUST, 20), "38457482","Rua Dali" );
        Menor p3 = new Menor("Rodrigo",LocalDate.of(2015, Month.SEPTEMBER, 12), "998759999", p1 );
        Menor p4 = new Menor("Marilia",LocalDate.of(2016, Month.MARCH, 11), "988379188999", p2 );
        //Paciente fake com mesmo CPF(p1B)
        Adulto p1B = new Adulto("Fake",LocalDate.of(2020, Month.SEPTEMBER, 19), "38423842","Rua Outra" );
        //Menor sem responsavel Maior de idade(p3B)
        Menor p3B = new Menor("Fake2",LocalDate.of(2016, Month.SEPTEMBER, 18), "9987591094", p1B );
        
        //============Cadastramento de Pacientes no Sistema========////
        Paciente po = new Adulto("Aonio",LocalDate.of(1970, Month.SEPTEMBER, 13), "3846794842","Rua Tal" );
        sistema.cadastrarPaciente(p1);
        sistema.cadastrarPaciente(p2);
        sistema.cadastrarPaciente(p3);
        sistema.cadastrarPaciente(p4);
        //Teste Cadastrar Paciente com CPF de Paciente já cadastrado(p1B)
        try{
            sistema.cadastrarPaciente(p1B);
        }catch(PacienteJaExisteException e){
            System.out.println("\n" + e);
            System.out.println("Paciente não cadastrado\n");
        }
        //Teste Cadastrar Menor sem Responsavel Maior de Idade(p3B)
        try{
            sistema.cadastrarPaciente(p3B);
        }catch(ResponsavelnvalidoException e){
            System.out.println("\n" + e);
            System.out.println("Paciente não cadastrado\n");
        }
        
        //=======Instanciamento de Aplicações ==============//
        AplicacaoVacina p1dose = new AplicacaoVacina(v1, LocalDate.of(2022, Month.JANUARY, 25), p1);
        //Vacina está vencida, mas a aplicação foi instanciada? Perdi algo nas instruções?
        AplicacaoVacina p2dose = new AplicacaoVacina(v2, LocalDate.of(2022, Month.FEBRUARY, 20), p2); //<-- vacina vencida
        AplicacaoVacina p3dose = new AplicacaoVacina(v1, LocalDate.of(2022, Month.MARCH, 11), p3);
        AplicacaoVacina p4dose = new AplicacaoVacina(v1, LocalDate.of(2022, Month.APRIL, 15), p4);
        //Paciente p3B não foi cadastrado
        AplicacaoVacina p5dose = new AplicacaoVacina(v1, LocalDate.of(2022, Month.APRIL, 16), p3B);
        //==========Cadastramento de Aplicações=========//
        
        sistema.cadastrarAplicacao(p1dose);
        sistema.cadastrarAplicacao(p3dose);
        sistema.cadastrarAplicacao(p4dose);
        
        
        //Teste de Aplicar Vacina em Paciente não cadastrado(p3B)
        try{
        sistema.cadastrarAplicacao(p5dose);
        }catch(PacienteNaoCadastradoException e){
            System.out.println("\n" + e);
            System.out.println("Aplicação não cadastrada\n");
        }
        
        //Vacina não cadastrada
        Vacina v3 = new Vacina("FakeVac",LocalDate.of(2022, Month.APRIL, 01),180);
        //Aplicação com Vacina não Cadastrada(v3)
        AplicacaoVacina p6dose = new AplicacaoVacina(v3, LocalDate.of(2022, Month.APRIL, 15), p4);
        
        //Teste de Aplicar Vacina, com Vacina n]ao cadastrada
        try{
        sistema.cadastrarAplicacao(p6dose);
        }catch(VacinaNaoCadastradaException e){
            System.out.println("\n" + e);
            System.out.println("Aplicação não cadastrada\n");
        }
        //Teste cadastrar Aplicação com Vacina Vencida
        try{
        sistema.cadastrarAplicacao(p2dose); //<-- Vacina Vencida, porem aplicação aconteceu?
        }catch(VacinaVencidaException e){
            System.out.println("\n" + e);
            System.out.println("Aplicação não cadastrada\n");
        }
        
        //=======Impressão de Pacientes e Aplicações========//
        
        listaPacientes(sistema.todosPacientes());
        System.out.println("\n");
        listaAplicacoes(sistema.todasAplicacoes());
        
        
        Menor m = new Menor("N1", null, "cpf1", null);

        Menor m2 = new Menor("N2", null, "cpf2", null);

        System.out.println(m.equals(m2));
        
       
        
        
        
        
    }
    
}
