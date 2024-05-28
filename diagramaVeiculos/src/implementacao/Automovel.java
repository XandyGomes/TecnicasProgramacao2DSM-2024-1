/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacao;

/**
 *
 * @author Alexandre
 */
public class Automovel extends Veiculo{
    
    private String cor;

    @Override
    public void acelerar(Integer valor) {
        System.out.println("Acelerou: " + valor + " km");
    }

    @Override
    public void frear(Integer valor) {
        System.out.println("Freou para: " + valor + " km");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
