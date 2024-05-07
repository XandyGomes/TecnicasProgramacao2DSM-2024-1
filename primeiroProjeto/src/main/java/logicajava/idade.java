/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicajava;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade em anos: ");
        int anos = scanner.nextInt();
        
        System.out.print("Digite sua idade em meses: ");
        int meses = scanner.nextInt();
        
        System.out.print("Digite sua idade em dias: ");
        int dias = scanner.nextInt();
        
        int totalDias = calcularDiasEmAnos(anos) + calcularDiasEmMeses(meses) + dias;
        
        System.out.println("Sua idade em dias é: " + totalDias);
    }
    
    public static int calcularDiasEmAnos(int anos){
        return anos * 365;
    }
    
    public static int calcularDiasEmMeses(int meses){
        return meses * 30;
    }
}
