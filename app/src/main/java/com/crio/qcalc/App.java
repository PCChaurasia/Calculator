/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package com.crio.qcalc;


public class App {


    public static void main(String[] args) {

        System.out.println("Starting QCalc..");

        LogicCalculator calc = new LogicCalculator();

        calc.AND(8, 6);

        calc.printResult();

    }


    public Object getGreeting() {


        return new App();
    }



}
