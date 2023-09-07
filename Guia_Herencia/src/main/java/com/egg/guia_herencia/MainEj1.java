/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_herencia;

import Entities.Animal;
import Entities.Cat;
import Entities.Dog;
import Entities.Horse;

/**
 *
 * @author Usuario
 */
public class MainEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal dog1 = new Dog("Stich", "carne", 15, "Doberman");
        dog1.feed();
        
        Animal dog2 = new Dog("Teddy", "croquetas", 10, "Chihuahua");
        dog2.feed();
        
        Animal cat1 = new Cat("Pelusa", "galletas", 15, "Siamés");
        cat1.feed();
        
        Animal horse1 = new Horse("Spark", "pasto", 25, "Fino");
        horse1.feed();
        
        
    }
    
}
