package com.estudo.interfaces;

public interface CalculateSalaryInterface {

    public Double calculateInss(Double salary);


    //Exemplo do modificardor default.
    default double salaryByYear(Double salary){
        return salary * 12;
    }
}

