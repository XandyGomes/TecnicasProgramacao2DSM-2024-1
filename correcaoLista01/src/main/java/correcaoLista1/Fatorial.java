/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoLista1;

/**
 *
 * @author Alexandre
 */
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        int fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
        scanner.close();
    }
}
