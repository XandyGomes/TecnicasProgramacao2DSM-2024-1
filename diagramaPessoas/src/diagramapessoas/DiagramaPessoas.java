/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagramapessoas;

import implement.Colaborador;
import implement.Parceiro;
import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class DiagramaPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Colaborador c1 = new Colaborador();
    c1.setBairro("centro");
    c1.setCidade("São Paulo");
    c1.setCpf("123456789");

 
    Parceiro p1 = new Parceiro();
    p1.setBairro("Tião");


    System.out.println("Bairro: "+ c1.getBairro());
    System.out.println("Cidade: "+ c1.getCidade());
    System.out.println("CPF: "+ c1.getCpf());
    System.out.println("Bairro: "+ p1.getBairro());
    System.out.println("Fundação: "+ p1.getFundacao());
    System.out.println("Nascimento: "+ c1.getNasc());
        
        
        
    }
    
}
