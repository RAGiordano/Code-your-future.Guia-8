/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.egg.pruebasjunit;

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
public class CocheTest {
    
    public CocheTest() {
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
     * Test of precioFinal method, of class Coche.
     */
    @Test
    public void testPrecioFinal() throws Exception {
        System.out.println("precioFinal");
        float descuento = 10.0F;
        Coche instance = new Coche ("Audi A3", 10000);
        Coche.impuesto = 20f;
        float expResult = 10800;
        float result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0.000001);
        
    }
    
}
