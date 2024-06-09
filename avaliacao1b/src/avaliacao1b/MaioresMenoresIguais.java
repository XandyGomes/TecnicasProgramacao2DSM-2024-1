/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao1b;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class MaioresMenoresIguais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        System.out.println("Digite os 10 numeros inteiros positivos do vetor: ");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("Digite o numero inteiro X: ");
        int x = scanner.nextInt();

        int maiores = 0;
        int menores = 0;
        int iguais = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > x){
                maiores++;
            }else if(vetor[i] < x){
                menores++;
            }else{
                iguais++;
            }
        }
                // Imprimir os resultados
        System.out.println("Maiores que X: " + maiores);
        System.out.println("Menores que X: " + menores);
        System.out.println("Iguais a X: " + iguais);
    }
}
