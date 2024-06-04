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
import java.util.Date;
import java.util.List;

public class Professor extends Pessoa {

    private String registro;
    private List<Disciplina> disciplinas = new ArrayList<>();

    // Constructor
    public Professor(String nome, Date dataNascimento, String endereco, String registro) {
        super(nome, dataNascimento, endereco);
        this.registro = registro;
    }

    // Getters e Setters
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
