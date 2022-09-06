/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author sidneynogueira
 */
public class Util {
        
    public static int diferencaAnos(LocalDate d1, LocalDate d2){
        Period periodo = Period.between(d1, d2);
        //System.out.println(periodo.getYears() + " Anos " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias");
        return periodo.getYears();
    }
    
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(1980, 8, 3);
        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(diferencaAnos(ld2,ld1));
    }
    
    public static boolean verificaData(String campo){
        try{
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate.parse(campo, formato);
            return true;
        }catch(Exception e){
            return false;
        }  
    }
    
    public static LocalDate convertData(String data){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(data, formato);
        
    }
    
    public static boolean verificaDouble(String campo){
        try{
            Double.parseDouble(campo);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    
}
