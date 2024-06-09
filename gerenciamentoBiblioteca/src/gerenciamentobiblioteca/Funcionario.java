/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentobiblioteca;

/**
 *
 * @author Alexandre
 */
import java.util.Date;

public class Funcionario extends Pessoa {

    private String cargo;

    public Funcionario(String nome, Date dataNascimento, String endereco, String telefone, String email, String cargo) {
        super(nome, dataNascimento, endereco, telefone, email);
        this.cargo = cargo;
    }

    // Getters e setters para cargo
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
