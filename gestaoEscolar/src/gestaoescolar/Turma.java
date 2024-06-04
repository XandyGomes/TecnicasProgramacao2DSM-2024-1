/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoescolar;

/**
 *
 * @author Alexandre
 */
import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String codigo;
    private int ano;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;
    private Disciplina disciplina;

    // Constructor
    public Turma(String codigo, int ano, Professor professor, Disciplina disciplina) {
        this.codigo = codigo;
        this.ano = ano;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
