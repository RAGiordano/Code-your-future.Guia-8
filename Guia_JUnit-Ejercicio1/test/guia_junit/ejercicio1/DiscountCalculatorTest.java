/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package guia_junit.ejercicio1;

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

    /**
     * Test of getPrecio method, of class DiscountCalculator.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        DiscountCalculator instance = new DiscountCalculator(100, 20);
        double expResult = 80;
        double result = instance.getResultado();
        assertEquals(expResult, result, 0.0);
        
    }
}