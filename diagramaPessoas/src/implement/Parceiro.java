/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

/**
 *
 * @author Alexandre
 */
public class Parceiro extends Juridica{
    private String tipoPessoa;
    private float desempenho;

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public float getDesempenho() {
        return desempenho;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public void setDesempenho(float desempenho) {
        this.desempenho = desempenho;
    }

    public void bloquear() {
        // Lógica para bloquear parceiro
    }

    @Override
    public void cadastrar() {
        // Lógica para cadastrar parceiro
    }

    @Override
    public void excluir() {
        // Lógica para excluir parceiro
    }
}
