/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentobiblioteca;

/**
 *
 * @author Alexandre
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Emprestimo {

    private Leitor leitor;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Funcionario funcionario;

    public Emprestimo(Leitor leitor, Livro livro, Funcionario funcionario) {
        this.leitor = leitor;
        this.livro = livro;
        this.dataEmprestimo = new Date(); // Data atual no momento do empréstimo
        this.funcionario = funcionario;
    }

    // Getters e setters para todos os atributos
    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Emprestimo{"
                + "Leitor=" + leitor.getNome()
                + ", Livro=" + livro.getTitulo()
                + ", Data de Empréstimo=" + dateFormat.format(dataEmprestimo)
                + ", Data de Devolução=" + (dataDevolucao != null ? dateFormat.format(dataDevolucao) : "Em aberto")
                + ", Funcionário=" + funcionario.getNome()
                + '}';
    }

}
