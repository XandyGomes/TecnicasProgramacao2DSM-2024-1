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
public abstract class Fisica extends Pessoa{
    private String cpf;
    private String rg;
    private String genero;
    private Date nasc;

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getGenero() {
        return genero;
    }

    public Date getNasc() {
        return nasc;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNasc(Date nasc) {
        this.nasc = nasc;
    }
    
}
