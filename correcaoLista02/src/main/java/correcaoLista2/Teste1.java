/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoLista2;

/**
 *
 * @author Alexandre
 */


public class Teste1 {
        public static void main(String[] args) {
        
            double quilometro = 2.8;
            double litro = 4.5;
            double metroCubico = 2.5;
            double barril = 3.0;
            
            System.out.println(quilometro + " quilômetros correspondem a " 
                    + ConversaoDeDados1.quilometroParaMetro(quilometro) + " metros.");
            System.out.println(litro + " litros correspondem a " 
                    + ConversaoDeDados1.litroParaDecilitros(litro) + " decilitros.");
            System.out.println(metroCubico + " metros cúbicos correspondem a " 
                    + ConversaoDeDados1.metroCubicoParaPesCubicos(metroCubico) + " metros.");
            System.out.println(barril + " barris correspondem a " 
                    + ConversaoDeDados1.barrilParaDecalitros(barril) + " decalitros.");
            System.out.println(barril + " barris correspondem a " 
                    + ConversaoDeDados1.barrilParaLitros(barril) + " litros.");
    }
}
