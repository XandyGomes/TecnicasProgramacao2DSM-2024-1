/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

/**
 *
 * @author Alexandre
 */
public class Empresa {
    private String nome;
    private String cnpj;
    private Departamento[] departamentos = new Departamento[10];
    private int numeroDepartamentos = 0;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
    
   public void adicionarDepartamento(Departamento departamento){
       if(numeroDepartamentos < 10){
           departamentos[numeroDepartamentos] = departamento;
           numeroDepartamentos++;
       }else{
            System.out.println("Limite máximo de departamentos atingido para a empresa: " + nome);
        }
   }
   
   public void darAumentoDepartamento(String nomeDepartamento){
       for(Departamento departamento : departamentos){
           if(departamento.getNome().equals(nomeDepartamento)){
               for(int i = 0; i < departamento.getNumeroFuncionarios(); i++){
                   Funcionario funcionario = departamento.getFuncionarios()[i];
                   double novoSalario = funcionario.getSalario() * 1.1;
                   funcionario.setSalario(novoSalario);
               }
               System.out.println("Aumento de 10% aplicado aos funcionários do departamento: " + nomeDepartamento);
               return;
           }
       }
       System.out.println("Departamento não encontrado: " + nomeDepartamento);
   }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public int getNumeroDepartamentos() {
        return numeroDepartamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public void setNumeroDepartamentos(int numeroDepartamentos) {
        this.numeroDepartamentos = numeroDepartamentos;
    }
    
    
}
