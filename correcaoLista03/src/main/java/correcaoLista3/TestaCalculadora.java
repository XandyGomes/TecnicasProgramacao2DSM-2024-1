/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoLista3;

/**
 *
 * @author Alexandre
 */
public class TestaCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somar(10, 20);
        int subtracao = calculadora.subtrair(10, 20);
        int multiplicacao = calculadora.multiplicar(10, 20);
        int divisao = calculadora.dividir(10, 20);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}

