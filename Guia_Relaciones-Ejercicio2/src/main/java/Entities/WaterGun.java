/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class WaterGun {
    private byte actualPosition;
    private byte waterPosition;

    public WaterGun() {
        
    }

    public byte getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(byte actualPosition) {
        this.actualPosition = actualPosition;
    }

    public void setWaterPosition(byte waterPosition) {
        this.waterPosition = waterPosition;
    }

    public byte getWaterPosition() {
        return waterPosition;
    }

    @Override
    public String toString() {
        return "WaterGun{" + "actualPosition=" + actualPosition + ", waterPosition=" + waterPosition + '}';
    }
    
    
}
