/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentobiblioteca;

/**
 *
 * @author Alexandre
 */
import java.util.List;
import java.util.ArrayList;

public class Livro {

    private String isbn;
    private String titulo;
    private List<Autor> autores;
    private int anoPublicacao;
    private String editora;
    private String genero;
    private int quantidadeDisponivel;

    public Livro(String isbn, String titulo, int anoPublicacao, String editora, String genero, int quantidadeDisponivel) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.genero = genero;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    // Getters e setters para todos os atributos
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void adicionarAutor(Autor autor) {
        this.autores.add(autor);
    }

    @Override
    public String toString() {
        String autoresStr = "";
        for (Autor autor : autores) {
            autoresStr += autor.getNome() + ", ";
        }
        // Remove a última vírgula e espaço
        if (autoresStr.length() > 0) {
            autoresStr = autoresStr.substring(0, autoresStr.length() - 2);
        }

        return "----------------------\n"
                + "ISBN: " + isbn + "\n"
                + "Título: " + titulo + "\n"
                + "Autores: " + autoresStr + "\n"
                + "Ano de Publicação: " + anoPublicacao + "\n"
                + "Editora: " + editora + "\n"
                + "Gênero: " + genero + "\n"
                + "Quantidade Disponível: " + quantidadeDisponivel;
    }
}
