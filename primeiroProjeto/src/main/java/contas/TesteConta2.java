/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author Alexandre
 */

//usando o construtor de Conta2 para inicializar a instância nome no momento em que cada
//objeto Conta2 é criado
public class TesteConta2 {
    public static void main(String[] args) {
        //cria dois obejos Conta2
        Conta2 minhaConta1 = new Conta2("Alexandre");
        Conta2 minhaConta2 = new Conta2("Gomes");

        //exibe o valor de cada nome para cada Conta2
        System.out.printf("Os nome dos objetos são: %s %s",
                minhaConta1.getNome(), minhaConta2.getNome());
    }
}
