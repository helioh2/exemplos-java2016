/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesdefault;

/**
 *
 * @author Helio
 */
public interface InterfaceB {
    default public void sayHi() {
        System.out.println("Hi from InterfaceB");
    }
}
