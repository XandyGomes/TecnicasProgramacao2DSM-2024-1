/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoLista2;

/**
 *
 * @author Alexandre
 */
public class EncontrarMaiorMenor {
    
    public static void main(String[] args) {
        
        int[] vetor = {10, 5, 7, 3, 1, 3, 11, 20, 6, 9};
        int maior = vetor[0];
        int menor = vetor[0];
        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            } else if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
