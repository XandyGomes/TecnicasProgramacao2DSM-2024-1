/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class TesteTodasContas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Conta1 primeiroObj = new Conta1();

        System.out.print("Digite o nome do primeiro objeto: ");
        String name = entrada.nextLine();
        primeiroObj.setNome(name);
        
        Conta2 segundoObj = new Conta2("Gomes");
        Conta2 terceiroObj = new Conta2("Silva");
        
        System.out.printf("Os nomes de todos os objetos são: %s %s %s",
                primeiroObj.getNome(), segundoObj.getNome(), terceiroObj.getNome());
    }
}