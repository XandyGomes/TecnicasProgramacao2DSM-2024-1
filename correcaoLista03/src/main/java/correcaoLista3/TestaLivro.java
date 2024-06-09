/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoLista3;

/**
 *
 * @author Alexandre
 */
public class TestaLivro {

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.inicializar("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia", "HarperCollins");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Editora: " + livro.getEditora());

        livro.setTitulo("A Metamorfose");
        livro.setAutor("Franz Kafka");
        livro.setAnoPublicacao(1915);
        livro.setGenero("Ficção");
        livro.setEditora("Atlântico");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Editora: " + livro.getEditora());
    }
}


