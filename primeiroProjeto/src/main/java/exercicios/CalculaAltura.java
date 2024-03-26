/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class CalculaAltura {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double maiorAltura = 0.0;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturasHomens = 0.0;
        int numMulheres = 0;
        int numHomens = 0;
        
        for(int i=1; i<=10; i++){
            System.out.print("Digite a altura da "+i+"ª pessoa: ");
            double altura = entrada.nextDouble();
            System.out.print("Digite o sexo da "+i+"ª pessoa (M/F): ");
            String sexo = entrada.next();
            
            if(altura > maiorAltura){
                maiorAltura = altura;
            }
            
            if(altura < menorAltura){
                menorAltura = altura;
            }
            
            if(sexo.equals("M") || sexo.equals("m")){
                somaAlturasHomens += altura;
                numHomens++;
            }else{
                numMulheres++;
            }
        }
        double mediaAlturasHomens = (somaAlturasHomens/numHomens);
        System.out.println("Maior altura: "+maiorAltura);
        System.out.println("Menor altura: "+menorAltura);
        System.out.println("Média de altura dos homens: "+mediaAlturasHomens);
        System.out.println("Número de mulheres: "+numMulheres);
    }
}
