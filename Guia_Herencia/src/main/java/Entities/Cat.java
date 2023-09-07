/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Usuario
 */
public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }
    
    @Override
    public void feed(){
        System.out.println("Cats eat " + this.getFood());
    }
}
