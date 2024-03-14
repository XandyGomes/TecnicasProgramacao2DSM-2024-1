/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.primeiroprojeto;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Soma {
    public static void main(String[] args) {
        //cria um scanner paera obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        int number1, number2, sum;
        
        System.out.print("Digite o primeiro numero: ");
        number1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        
        System.out.printf("A soma é %d", sum);
        
        
    }
}
