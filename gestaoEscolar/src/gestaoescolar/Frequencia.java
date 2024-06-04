/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoescolar;

/**
 *
 * @author Alexandre
 */
public class Frequencia {

    private Aluno aluno;
    private Disciplina disciplina;
    private Boolean presente;

    // Constructor
    public Frequencia(Aluno aluno, Disciplina disciplina, Boolean presente) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.presente = presente;
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

    public Boolean isPresente() {
        return presente;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }
}
