/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre
 */
public class NomeDialogo {
    public static void main(String[] args) {
        //pede para o usuário inserir o nome
        String name = JOptionPane.showInputDialog("Qual o seu nome?");
        
        //cria a mensagem
        String message = String.format("Olá %s, bem vindo ao Java!", name);
        
        //exibe a mensagem para a caixa de diálogo
        JOptionPane.showMessageDialog(null, message);
        
        JOptionPane.showMessageDialog(null, "Olá "+ name+ " bem vindo ao Java!");
    }
}
