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

public class NumerosPrimos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        System.out.print("Números primos menores ou iguais a " + n + ": ");
        for (int i = 2; i <= n; i++) {
            int divisors = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    divisors++;
                }
            }
            if (divisors == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}

