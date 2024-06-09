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
public class ExemploArray {

    public static void main(String[] args) {
        //cria um array do tipo inteiro com tamanho [5]
        int[] numeros = new int[5];
        //Preencher o array com números informados pelo usuário
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Informe o " + (i+1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }
        //imprime os numeros do array
        System.out.print("Números Informados: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + ", ");
        }
        //calcular a média dos números
        double soma = 0.0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        double media = soma / numeros.length;
        //Imprimir a média dos números
        System.out.println("\nMédia dos números: " + media);
    }
}
