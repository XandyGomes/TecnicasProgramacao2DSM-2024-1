/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author Alexandre
 */
// a classe Conta2 com um construtor que inicializa o nome
public class Conta2 {
   
    private String nome;

    //o construtor inicializa "nome" com o mesmo nome do parâmento
    public Conta2(String nome){
        this.nome = nome;
    }
        
    //método para recuperar o nome
    public String getNome() {
        return nome;
    }

    //método para inserir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
       
}// fim da classe Conta2
