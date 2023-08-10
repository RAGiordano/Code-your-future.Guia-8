/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_relaciones.ejercicio1;

import Entities.Breed;
import Entities.Dog;
import Entities.Person;

/**
 *
 * @author Usuario
 */
public class MainEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dog1 = new Dog("Madox", Breed.DOBERMAN, 4, 28.6f);
        Dog dog2 = new Dog("Boby", Breed.GERMAN_SHEPHERD, 3, 25.3f);
        
        
        Person person1 = new Person("Richard", "Dean Anderson", 35, 20518479, dog1);
        Person person2 = new Person("David", "Hasselhoff", 65, 10518479, dog2);
        
        System.out.println(person1.toString());
        System.out.println(person2.toString());
                
        
    }
    
}
