package com.estudo.interfaces;

public interface CalculateSalaryInterface {

    public Double calculateInss(Double valorSario);


    //Exemplo do modificardor default.
    default double salaryByYear(Double valorSalario){
        return valorSalario * 12;
    }
}

