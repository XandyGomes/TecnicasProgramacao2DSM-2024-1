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
public class Funcionario {
    private String nome;
    private double salario;
    private LocalDate dataAdmissao;
    
    public Funcionario(String nome, double salario, LocalDate dataAdmissao){
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    @Override
    public String toString(){
        return "Funcionario{" + "nome='"+nome + "'" +
               ", salário=" + salario +
               ", data admissao=" + dataAdmissao + "}";
    }
    
}
