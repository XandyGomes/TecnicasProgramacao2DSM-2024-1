/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacao;

/**
 *
 * @author Alexandre
 */
public abstract class Veiculo implements IVeiculo{
    
    private Integer velocidade;
    private String placa;
    private String chassi;
    private Integer ano;
    private Double valor;
    
    public static Double calcularValorVenda(Veiculo valor){
        return valor.getValor() - (valor.getValor() * 0.10);
    }
    
    @Override
    public void ligar(){
        System.out.println("Ligado");
    }
    
    @Override
    public void desligar(){
        System.out.println("Desligado");
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public String getPlaca() {
        return placa;
    }

    public String getChassi() {
        return chassi;
    }

    public Integer getAno() {
        return ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
   
}
