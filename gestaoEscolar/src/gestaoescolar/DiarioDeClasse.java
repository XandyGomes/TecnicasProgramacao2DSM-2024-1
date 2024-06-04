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

public class DiarioDeClasse implements Avaliacao {

    private List<Nota> notas = new ArrayList<>();
    private List<Frequencia> frequencias = new ArrayList<>();

    @Override
    public void registrarNota(Aluno aluno, Disciplina disciplina, double nota) {
        notas.add(new Nota(aluno, disciplina, nota));
    }

    @Override
    public void registrarFrequencia(Aluno aluno, Disciplina disciplina, boolean presente) {
        frequencias.add(new Frequencia(aluno, disciplina, presente));
    }

    public List<Double> getNotas(Aluno aluno, Disciplina disciplina) {
        List<Double> notasAlunoDisciplina = new ArrayList<>();
        for (Nota nota : notas) {
            if (nota.getAluno().equals(aluno) && nota.getDisciplina().equals(disciplina)) {
                notasAlunoDisciplina.add(nota.getValor());
            }
        }
        return notasAlunoDisciplina;
    }

    public List<Boolean> getFrequencias(Aluno aluno, Disciplina disciplina) {
        List<Boolean> frequenciasAlunoDisciplina = new ArrayList<>();
        for (Frequencia frequencia : frequencias) {
            if (frequencia.getAluno().equals(aluno) && frequencia.getDisciplina().equals(disciplina)) {
                frequenciasAlunoDisciplina.add(frequencia.isPresente());
            }
        }
        return frequenciasAlunoDisciplina;
    }
}
