/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.WaterGun;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class WaterGunService {
    private WaterGun waterGun;

    public WaterGunService() {
        waterGun = new WaterGun();
    }
    
//    public void WaterGunService(WaterGun waterGun) {
//        this.waterGun = new WaterGun();
//        this.waterGun.setActualPosition(waterGun.getActualPosition());
//        this.waterGun.setWaterPosition(waterGun.getWaterPosition());
//    }
    
    
    
    public void gunfill(WaterGun waterGun){
        waterGun.setActualPosition((byte) (new Random().nextInt(6) + 1));
        waterGun.setWaterPosition((byte) (new Random().nextInt(6) + 1));
    }
    
    public boolean shot(WaterGun waterGun){
        return (waterGun.getActualPosition() == waterGun.getWaterPosition());
    }
    
    public void nextShot(WaterGun waterGun){
        if (waterGun.getActualPosition() == 6){
            waterGun.setActualPosition((byte) 1);
        } else {
            waterGun.setActualPosition((byte)(waterGun.getActualPosition() + (byte) 1));
        }
    }

    
    public String toString(WaterGun waterGun) {
        return waterGun.toString();
    }

    public WaterGun getWaterGun() {
        return waterGun;
    }

    public void setWaterGun(WaterGun waterGun) {
        this.waterGun = waterGun;
    }
    
    
}
