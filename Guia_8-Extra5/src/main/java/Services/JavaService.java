/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Java;

/**
 *
 * @author Usuario
 */
public class JavaService {
    Java java = new Java();
    
    public boolean adivinar(String mes){
//        System.out.println("El mes secreto es: " + java.getMesSecreto());
//        System.out.println("El mes introducido es: " + mes);
//        System.out.println(java.getMesSecreto().equals(mes));
        return mes.equals(java.getMesSecreto());
    }
}
