/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author Helio
 */

 
public class NameExampleSemLambda {
 
     public static void main(String[] args) {
        Names nameInstance = new Names() {
           @Override
           public void sayName(String name) {
               System.out.println("My Name is " + name);
          }
       };
      myName(nameInstance, "John");
    }
 
    private static void myName(Names nameInstance, String name) {
      nameInstance.sayName(name);
   }
}