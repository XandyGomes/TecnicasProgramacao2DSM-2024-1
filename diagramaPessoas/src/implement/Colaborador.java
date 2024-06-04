/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

/**
 *
 * @author Alexandre
 */
public class Colaborador extends Fisica{
    private String ctps;
    private String pis;
    private String tituloEleitor;
    private boolean reservista;
    private String estadoCivil;
    private int numDependentes;
    private boolean ativo;
    private String setor;
    private String cargo;
    private float salario;
    private String telefone1;
    private String telefone2;
    private String emailPessoal;
    private String emailCorporativo;

    public String getCtps() {
        return ctps;
    }

    public String getPis() {
        return pis;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public boolean isReservista() {
        return reservista;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public int getNumDependentes() {
        return numDependentes;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public String getSetor() {
        return setor;
    }

    public String getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public String getEmailPessoal() {
        return emailPessoal;
    }

    public String getEmailCorporativo() {
        return emailCorporativo;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public void setReservista(boolean reservista) {
        this.reservista = reservista;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }

    public void setEmailCorporativo(String emailCorporativo) {
        this.emailCorporativo = emailCorporativo;
    }


    private void admitir() {
        // Lógica para admitir colaborador
    }

    private void demitir() {
        // Lógica para demitir colaborador
    }

    @Override
    public void cadastrar() {
        // Lógica para cadastrar colaborador
    }

    @Override
    public void excluir() {
        // Lógica para excluir colaborador
    }
    
}
