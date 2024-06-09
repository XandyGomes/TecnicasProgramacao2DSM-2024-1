/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

/**
 *
 * @author Alexandre
 */
public class Departamento {
    private String nome;
    private Funcionario[] funcionarios = new Funcionario[100];
    private int numeroFuncionarios = 0;
    
    public Departamento(String nome){
        this.nome = nome;
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        if(numeroFuncionarios < 100){
            funcionarios[numeroFuncionarios] = funcionario;
            numeroFuncionarios++;
        }else{
            System.out.println("Limite máximo de funciuonarios atingido para o departamento: " + nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
    @Override
    public String toString(){
        return "Departamento{" +
                "nome='" + nome + "\'" +
                ", numeroFuncionarios=" + numeroFuncionarios + "}";
    }
    
}
