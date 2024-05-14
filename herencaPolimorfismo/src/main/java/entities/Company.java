/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Alexandre
 */
public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company(Integer numberOfEmployees, String name, Double anualIncome) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    @Override
    public double tax() {
       if(numberOfEmployees > 10){
           return getAnualIncome() * 0.14;
       }else{
           return getAnualIncome() * 0.16;
       }
    }
}
