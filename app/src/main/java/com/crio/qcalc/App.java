/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package com.crio.qcalc;


public class App {


   public static void main(String[] args) {

       System.out.println("Starting QCalc..");

       

       
StandardCalculator calc = new StandardCalculator();

// calc.add(Double.MAX_VALUE, 1.0);

calc.printResult();

   }
       

public Object getGreeting() {

    
    return new App();
}




}
