/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.alexandre.herencapolimorfismo;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.text.html.parser.AttributeList;

/**
 *
 * @author Alexandre
 */
public class HerencaPolimorfismo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.print("Insira o número de contribuintes: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Contribuinte #" + i + " data:");
            System.out.print("Físico or Jurídico (f/j)? ");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Renda Anual: ");
            Double rendaAnual = sc.nextDouble();

            if (tipo == 'f') {
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = sc.nextDouble();
                list.add(new Individual(gastosSaude, nome, rendaAnual));
            } else {
                System.out.print("Número de funcionários: ");
                Integer numFuncionarios = sc.nextInt();
                list.add(new Company(numFuncionarios, nome, rendaAnual));
            }
        }

        System.out.println();
        System.out.println("Impostos Pagos:");
        for (TaxPayer impPagos : list) {
            System.out.println(impPagos.getName() + ": R$ " + String.format("%.2f", impPagos.tax()));
        }

        System.out.println();
        double soma = 0.0;
        for (TaxPayer totalImpostos : list) {
            soma += totalImpostos.tax();
        }
        System.out.println("Total de impostos: R$ " + String.format("%.2f", soma));

        sc.close();
    }
}
