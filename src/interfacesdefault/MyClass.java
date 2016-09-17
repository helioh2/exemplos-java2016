/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesdefault;

/**
 *
 * @author Helio
 * Créditos: https://blog.idrsolutions.com/2015/01/java-8-default-methods-explained-5-minutes/
 */
public class MyClass implements InterfaceA, InterfaceB {
 
    @Override
    public void saySomething() {
        System.out.println("Hello World");
    }
 
    @Override
    public void sayHi() {
        InterfaceA.super.sayHi();
    }
    
   
 
}