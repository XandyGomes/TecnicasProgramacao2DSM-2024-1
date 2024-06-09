/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao1b;

/**
 *
 * @author Alexandre
 */
public class DadosCompra {
    private int codigoPeca;
    private double valorUnitarioPeca;
    private int quantidadePeca;
    
    public DadosCompra(int codigoPeca, double valorUnitarioPeca, int  quantidadePeca){
        this.codigoPeca = codigoPeca;
        this.valorUnitarioPeca = valorUnitarioPeca;
        this.quantidadePeca = quantidadePeca;
    }
    
    public double calcularValorTotalSemIpi(){
        return (valorUnitarioPeca * quantidadePeca);
    }
}
