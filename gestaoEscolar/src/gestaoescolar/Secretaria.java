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

public class Secretaria implements Matriculavel {

    private List<Matricula> matriculas = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno, Turma turma) {
        // Verificar se o aluno já está matriculado na turma
        for (Matricula matricula : matriculas) {
            if (matricula.getAluno().equals(aluno) && matricula.getTurma().equals(turma)) {
//                System.out.println("Aluno já matriculado nesta turma.");
                return; // Sai do método se o aluno já estiver matriculado
            }
        }

        // Verificar se há vagas na turma (implementar lógica de acordo com a capacidade da turma)
        // Exemplo:
        if (turma.getAlunos().size() >= 30) { // Supondo que a turma tenha capacidade para 30 alunos
//            System.out.println("Turma lotada.");
            return; // Sai do método se a turma estiver lotada
        }

        // Matricular o aluno
        Matricula novaMatricula = new Matricula(aluno, turma);
        matriculas.add(novaMatricula);
        turma.getAlunos().add(aluno);
//        System.out.println("Aluno matriculado com sucesso!");
    }

    @Override
    public void cancelarMatricula(Aluno aluno, Turma turma) {
        // Encontrar a matrícula a ser cancelada
        Matricula matriculaParaCancelar = null;
        for (Matricula matricula : matriculas) {
            if (matricula.getAluno().equals(aluno) && matricula.getTurma().equals(turma)) {
                matriculaParaCancelar = matricula;
                break;
            }
        }

        // Verificar se a matrícula existe
        if (matriculaParaCancelar == null) {
//            System.out.println("Aluno não matriculado nesta turma.");
            return; // Sai do método se a matrícula não existir
        }

        // Cancelar a matrícula
        matriculas.remove(matriculaParaCancelar);
        turma.getAlunos().remove(aluno);
//        System.out.println("Matrícula cancelada com sucesso!");
    }

    // Getters
    public List<Matricula> getMatriculas() {
        return matriculas;
    }
}
