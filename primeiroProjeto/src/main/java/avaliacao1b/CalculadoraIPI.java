/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao1b;

/**
 *
 * @author Alexandre
 */
public class CalculadoraIPI {
    
    private double porcetagemIPI;
    
    public CalculadoraIPI(double porcetagemIPI){
        this.porcetagemIPI = porcetagemIPI;
    }
    
    public double calcularValorTotalComIpi(double valorTotalSemIpi){
        double valorIPI = valorTotalSemIpi * (porcetagemIPI / 100);
        return valorTotalSemIpi + valorIPI;
    }
}
