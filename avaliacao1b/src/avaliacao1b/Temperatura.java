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
public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatu em Celcius: ");
        double celsius = scanner.nextDouble();
        
        double f = celsius * 1.8 + 32;
        double k = celsius + 273.15;
        double re = celsius * 0.8;
        double ra = celsius * 1.8 + 32 + 459.67;
        
        System.out.printf("Fahrenheit: %.2fºF\n", f);
        System.out.printf("Kelvin: %.2fºF\n", k);
        System.out.printf("Réaumur: %.2fºF\n", re);
        System.out.printf("Rankine: %.2fºF\n", ra);
    }
}
