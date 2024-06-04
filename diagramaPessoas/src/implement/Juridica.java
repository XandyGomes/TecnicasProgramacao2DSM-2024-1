/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

import java.util.Date;

/**
 *
 * @author Alexandre
 */
public abstract class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;
    private Date fundacao;

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public Date getFundacao() {
        return fundacao;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }
    
}
