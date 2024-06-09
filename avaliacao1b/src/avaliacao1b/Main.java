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
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Leia a porcentagem do IPI do usuário
        System.out.print("Digite a porcentagem do IPI");
        double porcetagemIPI = scanner.nextDouble();
        
        //Leia os dados da peça 1
        System.out.println("**Dados da Peça 1:*");
        System.out.print("Código: ");
        int codigoPeca1 = scanner.nextInt();
        System.out.print("Valor unitário: ");
        double valorUnitarioPeca1 = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidadePeca1 = scanner.nextInt();
        
        //Leia os dados da peça 2
        System.out.println("**Dados da Peça 2:*");
        System.out.print("Código: ");
        int codigoPeca2 = scanner.nextInt();
        System.out.print("Valor unitário: ");
        double valorUnitarioPeca2 = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidadePeca2 = scanner.nextInt();
        
        //criação dos objetos
        CalculadoraIPI calculadoraIPI = new CalculadoraIPI(porcetagemIPI);
        DadosCompra produto1 = new DadosCompra(codigoPeca1, valorUnitarioPeca1, quantidadePeca1);
        DadosCompra produto2 = new DadosCompra(codigoPeca2, valorUnitarioPeca2, quantidadePeca2);
        
        //cálculo dos valores
        double valorTotalSemIpi = produto1.calcularValorTotalSemIpi() + produto2.calcularValorTotalSemIpi();
        double valorTotalComIpi = calculadoraIPI.calcularValorTotalComIpi(valorTotalSemIpi);
        double valorTotalIPI = valorTotalComIpi - valorTotalSemIpi;
        
        // Impressão dos resultados
        System.out.println("\n**Resultados:**");
        System.out.printf("Valor total dos produtos sem IPI: R$ %.2f\n", valorTotalSemIpi);
        System.out.printf("Valor total do IPI: R$ %.2f\n", valorTotalIPI);
        System.out.printf("Valor total dos produtos com IPI: R$ %.2f\n", valorTotalComIpi);        
        
    }
}
