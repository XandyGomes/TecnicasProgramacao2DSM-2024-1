/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerenciamentobiblioteca;

/**
 *
 * @author Alexandre
 */
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // 1. Crie Objetos
        // Autores
        Autor autor1 = new Autor("J.K. Rowling");
        Autor autor2 = new Autor("George R.R. Martin");
        Autor autor3 = new Autor("Machado de Assis");

        // Livros
        Livro livro1 = new Livro("9780439554930", "Harry Potter e a Pedra Filosofal", 1997, "Bloomsbury", "Fantasia", 5);
        Livro livro2 = new Livro("9780553103540", "A Guerra dos Tronos", 1996, "Bantam Spectra", "Fantasia", 3);
        Livro livro3 = new Livro("9788525048682", "Dom Casmurro", 1899, "Companhia das Letras", "Romance", 2);

        // Leitores
        Leitor leitor1 = new Leitor("João Silva", new Date(725827200000L), "Rua A, 123", "(16) 99999-8888", "joao@email.com", "L001");
        Leitor leitor2 = new Leitor("Maria Souza", new Date(495244800000L), "Rua B, 456", "(16) 98888-7777", "maria@email.com", "L002");

        // Funcionários
        Funcionario funcionario1 = new Funcionario("Pedro Santos", new Date(-725827200000L), "Rua C, 789", "(16) 97777-6666", "pedro@email.com", "Bibliotecário");

        // Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // 2. Associe
        livro1.adicionarAutor(autor1);
        livro2.adicionarAutor(autor2);
        livro3.adicionarAutor(autor3);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // 3. Realize Empréstimos
        biblioteca.realizarEmprestimo(leitor1, livro1, funcionario1);
        biblioteca.realizarEmprestimo(leitor2, livro2, funcionario1);

        // 4. Registre Devoluções
        biblioteca.registrarDevolucao(biblioteca.emprestimos.get(0)); // Devolve o primeiro livro emprestado

        // 5. Realize Pesquisas
        System.out.println("\nPesquisando livro por título 'Harry Potter e a Pedra Filosofal':");
        biblioteca.pesquisarLivroPorTitulo("Harry Potter e a Pedra Filosofal");

        System.out.println("\nPesquisando livro por autor 'Machado de Assis':");
        biblioteca.pesquisarLivroPorAutor("Machado de Assis");

        // 6. Realize Listagens
        System.out.println("\nLivros disponíveis:");
        biblioteca.listarLivrosDisponiveis();

        System.out.println("\nEmpréstimos em aberto:");
        biblioteca.listarEmprestimosEmAberto();
    }
}
