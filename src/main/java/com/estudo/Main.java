package com.estudo;

import com.estudo.services.CalculateSalaryService;
import com.estudo.services.OperationsService;

import java.text.DecimalFormat;

public class Main {


    public void calculateSalary(double salary, boolean salaryYear){

        //Instancia do Objeto CalculateSalaryService
        CalculateSalaryService service = new CalculateSalaryService();


        if(salaryYear){
            var result = service.salaryByYear(salary);
            System.out.println("Salary by Year => " + result);

        }else{
            var result = service.calculateInss(salary);

            System.out.println("Gross Salary => " + salary);
            //DecimalFormat usado para formatar a saida do Double com apenas 2 casa decimais.
            System.out.println("Inss  => -" + new DecimalFormat("#,##0.00").format(result) );
            System.out.println("Net Salary  => " + new DecimalFormat("#,##0.00").format(salary - result) );
        }
    }


    public void operationsSum(int a, int b){
        OperationsService operationsService = new OperationsService();
        var result = operationsService.sum(a, b);
        System.out.println("Calculator - Sum  => " + result);
    }


    //Classe principal da aplicação JAVA.
    public static void main(String[] args){

        //Instancia do Objeto Main
        Main mainApp = new Main();


        mainApp.calculateSalary(3000, false);
        mainApp.operationsSum(4, 5);

    }
}
