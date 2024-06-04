/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoescolar;

/**
 *
 * @author Alexandre
 */
import java.util.Date;

public class Aluno extends Pessoa {

    private String matricula;

    // Constructor
    public Aluno(String nome, Date dataNascimento, String endereco, String matricula) {
        super(nome, dataNascimento, endereco);
        this.matricula = matricula;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
