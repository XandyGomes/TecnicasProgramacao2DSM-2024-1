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
public class TesteConta1 {
    public static void main(String[] args) {
        String name;
        
        //cria um objeto scanner para obter entrada a partir da janela de comando 
        Scanner input = new Scanner(System.in);
        
        //cria um objeto a partir da classe Conta1() e atribui a minhaConta
        Conta1 minhaConta = new Conta1();
        
        //exibe o valor inicial do nome (....)
        System.out.printf("O nome inicial é: %s%n ", minhaConta.getNome());
        
       //solicita e lê o nome
       System.out.println("Por favor, entre com o nome: ");
       name = input.nextLine(); //lê um linha de texto
       minhaConta.setNome(name); //insere name em minhaConta
       
       System.out.println();
       
       //exibe o nome armazenado no obejto minhaConta
       System.out.printf("O nome do objeto em minhaConta é: %s%n", minhaConta.getNome());  
    }
}
