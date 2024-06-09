/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoLista3;

/**
 *
 * @author Alexandre
 */
public class TestaConta {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.inicializar(123456789, 100.0);

        System.out.println("Saldo inicial: " + conta1.getSaldo());

        conta1.depositar(50.0);

        System.out.println("Saldo após depósito: " + conta1.getSaldo());

        conta1.sacar(20.0);

        System.out.println("Saldo após saque: " + conta1.getSaldo());

        Conta conta2 = new Conta();
        conta2.inicializar(987654321, 50.0);

        conta1.transferir(30.0, conta2);

        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());
    }
}
