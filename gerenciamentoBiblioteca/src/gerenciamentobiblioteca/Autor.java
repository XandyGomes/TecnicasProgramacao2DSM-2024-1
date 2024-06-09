/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentobiblioteca;

/**
 *
 * @author Alexandre
 */
public class Autor {

    private String nome;

    public Autor(String nome) {
        this.nome = nome;
    }

    // Getters e setters para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome; // Retorna apenas o nome do autor
    }
}
