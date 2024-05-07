/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

import java.time.LocalDate;

/**
 *
 * @author Alexandre
 */
public class Main {

    public static void main(String[] args) {
        // Criando a empresa
        Empresa empresa = new Empresa("Exemplo LTDA", "12.345.678/0001-90");

        // Criando departamentos
        Departamento departamentoVendas = new Departamento("Vendas");
        Departamento departamentoMarketing = new Departamento("Marketing");

        // Criando funcionários
        Funcionario funcionario1 = new Funcionario("João Silva", 2500.00, LocalDate.of(2023, 10, 05));
        Funcionario funcionario2 = new Funcionario("Maria Gomes", 3000.00, LocalDate.of(2022, 07, 12));
        Funcionario funcionario3 = new Funcionario("Pedro Souza", 1800.00, LocalDate.of(2024, 02, 01));

        // Adicionando funcionários aos departamentos
        departamentoVendas.adicionarFuncionario(funcionario1);
        departamentoVendas.adicionarFuncionario(funcionario2);
        departamentoMarketing.adicionarFuncionario(funcionario3);

        // Adicionando departamentos à empresa
        empresa.adicionarDepartamento(departamentoVendas);
        empresa.adicionarDepartamento(departamentoMarketing);

        // Imprimindo informações da empresa
        System.out.println("Empresa: " + empresa.getNome() + " (" + empresa.getCnpj() + ")");
        System.out.println("-----------------------------------------");

        // Imprimindo informações dos departamentos
        for (Departamento departamento : empresa.getDepartamentos()) {
            if (departamento != null) {
                System.out.println("Departamento: " + departamento.getNome());
                System.out.println("------------------------");
                for (int i = 0; i < departamento.getNumeroFuncionarios(); i++) {
                    Funcionario funcionario = departamento.getFuncionarios()[i];
                    System.out.println(funcionario);
                }
                System.out.println("------------------------");
            }
        }

        // Aplicando aumento de 10% aos funcionários do departamento de Vendas
        empresa.darAumentoDepartamento("Vendas");

        // Imprimindo informações dos departamentos após o aumento
        for (Departamento departamento : empresa.getDepartamentos()) {
            if (departamento != null) {
                System.out.println("Departamento: " + departamento.getNome());
                System.out.println("------------------------");
                for (int i = 0; i < departamento.getNumeroFuncionarios(); i++) {
                    Funcionario funcionario = departamento.getFuncionarios()[i];
                    System.out.println(funcionario);
                }
                System.out.println("------------------------");
            }
        }
    }
}