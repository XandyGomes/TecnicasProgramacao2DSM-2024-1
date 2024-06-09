/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestaoescolar;

/**
 *
 * @author Alexandre
 */
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Criação de objetos
        Secretaria secretaria = new Secretaria();
        DiarioDeClasse diarioDeClasse = new DiarioDeClasse();

        Professor professor1 = new Professor("João Silva", new Date(), "Rua A, 123", "PROF123");
        Professor professor2 = new Professor("Sérgio Gomes", new Date(), "Rua B, 321", "PROF321");

        Disciplina matematica = new Disciplina("Matemática", 80, professor1);
        Disciplina portugues = new Disciplina("Português", 120, professor2);

        Turma turmaA = new Turma("TURMA-A", 2024, professor1, matematica);
        Turma turmaB = new Turma("TURMA-B", 2024, professor2, portugues);

        Aluno aluno1 = new Aluno("Maria Souza", new Date(), "Rua B, 456", "2024001");
        Aluno aluno2 = new Aluno("Pedro Santos", new Date(), "Rua C, 789", "2024002");
        Aluno aluno3 = new Aluno("José Amaral", new Date(), "Rua E, 953", "2024003");

        // Matrícula de alunos
        secretaria.matricular(aluno1, turmaA);
        secretaria.matricular(aluno2, turmaA);
        secretaria.matricular(aluno3, turmaB);
        

        // Registro de notas e frequências
        diarioDeClasse.registrarNota(aluno1, matematica, 9.5);
        diarioDeClasse.registrarFrequencia(aluno1, matematica, true);
        diarioDeClasse.registrarNota(aluno2, matematica, 7.0);
        diarioDeClasse.registrarFrequencia(aluno2, matematica, false);
        diarioDeClasse.registrarNota(aluno3, portugues, 6.0);
        diarioDeClasse.registrarFrequencia(aluno3, portugues, true);

        // Consultas
        System.out.println("Alunos matriculados na turma " + turmaA.getCodigo() + ":");
        for (Aluno aluno : turmaA.getAlunos()) {
            System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
        }

        System.out.println("Alunos matriculados na turma " + turmaB.getCodigo() + ":");
        for (Aluno aluno : turmaB.getAlunos()) {
            System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
        }

        System.out.println("\nNotas do aluno " + aluno1.getNome() + " em " + matematica.getNome() + ":");
        for (Double nota : diarioDeClasse.getNotas(aluno1, matematica)) {
            System.out.println("- " + nota);
        }

        System.out.println("\nNotas do aluno " + aluno2.getNome() + " em " + matematica.getNome() + ":");
        for (Double nota : diarioDeClasse.getNotas(aluno2, matematica)) {
            System.out.println("- " + nota);
        }

        System.out.println("\nNotas do aluno " + aluno3.getNome() + " em " + portugues.getNome() + ":");
        for (Double nota : diarioDeClasse.getNotas(aluno3, portugues)) {
            System.out.println("- " + nota);
        }

        System.out.println("\nFrequências do aluno " + aluno1.getNome() + " em " + matematica.getNome() + ":");
        for (Boolean presente : diarioDeClasse.getFrequencias(aluno1, matematica)) {
            System.out.println("- " + (presente ? "Presente" : "Ausente"));
        }

        System.out.println("\nFrequências do aluno " + aluno2.getNome() + " em " + matematica.getNome() + ":");
        for (Boolean presente : diarioDeClasse.getFrequencias(aluno2, matematica)) {
            System.out.println("- " + (presente ? "Presente" : "Ausente"));
        }

        System.out.println("\nFrequências do aluno " + aluno3.getNome() + " em " + portugues.getNome() + ":");
        for (Boolean presente : diarioDeClasse.getFrequencias(aluno3, portugues)) {
            System.out.println("- " + (presente ? "Presente" : "Ausente"));
        }
    }
}
