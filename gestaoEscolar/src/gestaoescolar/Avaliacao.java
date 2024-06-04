/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestaoescolar;

/**
 *
 * @author Alexandre
 */
public interface Avaliacao {

    void registrarNota(Aluno aluno, Disciplina disciplina, double nota);

    void registrarFrequencia(Aluno aluno, Disciplina disciplina, boolean presente);
}
