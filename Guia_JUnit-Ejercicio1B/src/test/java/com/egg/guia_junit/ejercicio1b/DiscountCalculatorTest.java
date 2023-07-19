/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.egg.guia_junit.ejercicio1b;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class DiscountCalculatorTest {
    
    public DiscountCalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        
    }
    
    @Test
    public void testCalculoDescuento() throws Exception {
    System.out.println("Cálculo descuento");
    DiscountCalculator calculo = new DiscountCalculator (100, 10);
    double expResult = 90;
    double result = calculo.getResultado();
    assertEquals(expResult, result, 0.0);
    
    DiscountCalculator calculo2 = new DiscountCalculator (100, 0);
    expResult = 100;
    result = calculo2.getResultado();
    assertEquals(expResult, result, 0.0);
    
    DiscountCalculator calculo3 = new DiscountCalculator (100, 100);
    expResult = 0;
    result = calculo3.getResultado();
    assertEquals(expResult, result, 0.0);
    
    DiscountCalculator calculo4 = new DiscountCalculator (100, -10);
    expResult = 110;
    result = calculo4.getResultado();
    assertEquals(expResult, result, 0.0);
    }
    

    
}
