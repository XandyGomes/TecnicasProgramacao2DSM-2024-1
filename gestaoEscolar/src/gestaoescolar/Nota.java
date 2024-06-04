/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoescolar;

/**
 *
 * @author Alexandre
 */
public class Nota {

    private Aluno aluno;
    private Disciplina disciplina;
    private Double valor;

    // Constructor
    public Nota(Aluno aluno, Disciplina disciplina, Double valor) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.valor = valor;
    }

    // Getters e Setters
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
