/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicajava;

/**
 *
 * @author Alexandre
 * 02) Fazer um programa que imprima a média aritmética dos números 7, 8 e 9.
 * A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
 */
public class MediaAritmetica {
    public static void main(String[] args) {
        double[] numeros1 = {7, 8, 9};
        
        double[] numeros2 = {4, 5, 6};
        
        double media1 = calcularMedia(numeros1);
        double media2 = calcularMedia(numeros2);
       
        System.out.println("Média dos números 7, 8 e 9: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        
        double somaMedias = media1 + media2;
        System.out.println("A soma das duas médias: " + somaMedias);
        
        double mediaDasMedias = calcularMedia(new double[]{media1, media2});
        System.out.println("Média das médias: " + mediaDasMedias);
    }
    
    public static double calcularMedia(double [] numeros){
        double soma = 0;
        for(double numero : numeros){
            soma = soma + numero;
        }
        return soma / numeros.length;
    }
}
