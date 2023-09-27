/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Usuario
 */
public class DivisionNumero {
    private int dividendo;
    private int divisor;

    
    //Constructors
    
    public DivisionNumero() {
    }

    public DivisionNumero(int divisor) {
        this.divisor = divisor;
    }

    // Getters & Setters
    
    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }
    
    // Other methods
    
    public static double dividir (int dividendo, int divisor) {
        return dividendo/divisor;
    }
    
}
