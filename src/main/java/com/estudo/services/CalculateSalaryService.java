package com.estudo.services;

import com.estudo.interfaces.CalculateSalaryInterface;

public class CalculateSalaryService implements CalculateSalaryInterface {

    private static final double SEVEN = 0.075;
    private static final double NINE = 0.09;
    private static final double TWELVE = 0.12;
    private static final double FOURTEEN = 0.14;


    @Override
    public Double calculateInss(Double salary) {

        double amout = 0.0;
        double amout_1;
        double amout_2;
        double amout_3;
        double amout_4;


        if(salary > 0 && salary <= 1320){
            amout = salary * SEVEN;

        }else if(salary > 1320 && salary <= 2571.29){
            amout_1 = 1320 * SEVEN;
            amout_2 = ((salary - 1320) * NINE);
            amout = amout_1 + amout_2;

        }else if (salary > 2571.29 && salary <= 3856.94){

            amout_1 = 1320 * SEVEN;
            amout_2 = ((2571.29 - 1320) * NINE);
            amout_3 = ((salary - 2571.29) * TWELVE);

            amout = amout_1 + amout_2 +amout_3;


        }else if (salary > 3856.94 && salary <= 7507.49){

            amout_1 = 1320 * SEVEN;
            amout_2 = ((2571.29 - 1320) * NINE);
            amout_3 = ((salary - 2571.29) * TWELVE);
            amout_4 = ((salary - 3856.94) * FOURTEEN);

            amout = amout_1 + amout_2 +amout_3 + amout_4;


        }else {
            amout = 876.95;
        }


        return amout;
    }
}
