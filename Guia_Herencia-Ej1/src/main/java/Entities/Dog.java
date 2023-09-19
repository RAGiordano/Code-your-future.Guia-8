/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Usuario
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }
    
    @Override
    public void feed(){
        System.out.println("Dogs eat " + this.getFood());
    }
}
