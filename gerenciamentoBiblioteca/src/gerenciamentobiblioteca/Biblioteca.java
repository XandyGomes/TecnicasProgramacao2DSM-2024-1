/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentobiblioteca;

/**
 *
 * @author Alexandre
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca implements Pesquisavel {

    private List<Livro> livros;
    List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void realizarEmprestimo(Leitor leitor, Livro livro, Funcionario funcionario) {
        if (livro.getQuantidadeDisponivel() > 0 && !leitorPossuiEmprestimosEmAberto(leitor)) {
            Emprestimo emprestimo = new Emprestimo(leitor, livro, funcionario);
            emprestimos.add(emprestimo);
            livro.setQuantidadeDisponivel(livro.getQuantidadeDisponivel() - 1);
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            if (livro.getQuantidadeDisponivel() == 0) {
                System.out.println("Livro indisponível para empréstimo.");
            } else {
                System.out.println("Leitor possui empréstimos em aberto.");
            }
        }
    }

    public void registrarDevolucao(Emprestimo emprestimo) {
        emprestimo.setDataDevolucao(new Date()); // Data atual no momento da devolução
        emprestimo.getLivro().setQuantidadeDisponivel(emprestimo.getLivro().getQuantidadeDisponivel() + 1);
        System.out.println("Devolução registrada com sucesso!");
    }

    @Override
    public void pesquisarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(livro);
            }
        }
    }

    @Override
    public void pesquisarLivroPorAutor(String nomeAutor) {
        for (Livro livro : livros) {
            for (Autor autor : livro.getAutores()) {
                if (autor.getNome().equalsIgnoreCase(nomeAutor)) {
                    System.out.println(livro);
                }
            }
        }
    }

    public void listarLivrosDisponiveis() {
        for (Livro livro : livros) {
            if (livro.getQuantidadeDisponivel() > 0) {
                System.out.println(livro);
            }
        }
    }

    public void listarEmprestimosEmAberto() {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getDataDevolucao() == null) {
                System.out.println(emprestimo);
            }
        }
    }

    private boolean leitorPossuiEmprestimosEmAberto(Leitor leitor) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLeitor().equals(leitor) && emprestimo.getDataDevolucao() == null) {
                return true;
            }
        }
        return false;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

}
