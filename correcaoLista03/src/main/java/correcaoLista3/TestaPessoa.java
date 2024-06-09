/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoLista3;

/**
 *
 * @author Alexandre
 */
public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.inicializar("João", "Silva", 30, "123.456.789-00");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCpf());

        pessoa.setNome("Maria");
        pessoa.setSobrenome("Santos");
        pessoa.setIdade(25);
        pessoa.setCpf("987.654.321-00");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCpf());
    }
}

