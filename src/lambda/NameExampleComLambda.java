/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author Helio
 * Créditos: https://blog.idrsolutions.com/2014/10/5-minutes-explanation-java-lambda-expression/
 */


public class NameExampleComLambda {
 
     public static void main(String[] args) {
       myName(n -> System.out.println("My name is " + n), "John");
    }
 
     private static void myName(Names nameInstance, String name) {
      nameInstance.sayName(name);
    }
}