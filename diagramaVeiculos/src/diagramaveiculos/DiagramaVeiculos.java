/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagramaveiculos;

import implementacao.Automovel;
import implementacao.Motocicleta;
import implementacao.Veiculo;

/**
 *
 * @author Alexandre
 */
public class DiagramaVeiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Automovel auto = new Automovel();
        Motocicleta moto = new Motocicleta();
        
        System.out.println("===AUTOMÓVEL===");
        auto.ligar();
        auto.acelerar(120);
        auto.frear(0);
        auto.desligar();
        auto.setValor(75000.0);
        System.out.println("Valor de venda à vista do automóvel é: " + Veiculo.calcularValorVenda(auto));
        System.out.println("============");
        
        System.out.println("===MOTOCICLETA===");
        moto.ligar();
        moto.acelerar(80);
        moto.frear(0);
        moto.desligar();
        moto.setValor(9000.0);
        System.out.println("Valor de venda à vista da motocicleta é: " + Veiculo.calcularValorVenda(moto));
        System.out.println("============");
    }
    
}
