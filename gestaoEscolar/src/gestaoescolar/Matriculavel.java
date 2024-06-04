/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestaoescolar;

/**
 *
 * @author Alexandre
 */
public interface Matriculavel {

    void matricular(Aluno aluno, Turma turma);

    void cancelarMatricula(Aluno aluno, Turma turma);
}
