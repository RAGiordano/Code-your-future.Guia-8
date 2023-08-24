/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Services.PlayerService;
import Services.WaterGunService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Game {
    private PlayerService playerService = new PlayerService();
    private WaterGunService waterGunService = new WaterGunService();
    private List<Player> players;
    private WaterGun waterGun;
    private byte actualPlayerNumber;
    private byte wetPlayer;
    

    public Game() {
    }

    public Game(List<Player> players, WaterGun waterGun) {
        this.players = players;
        this.waterGun = waterGun;
        this.actualPlayerNumber = 0;
        this.wetPlayer = -1;
    }
    
    
    
    public void fillGame(ArrayList<Player> players, WaterGun waterGun){
        this.players = new ArrayList(players);
        this.waterGun = waterGun;
        waterGunService.gunfill(waterGun);
        this.actualPlayerNumber = 0;
    }
    
    public boolean playRound(){
        Player actualPlayer = this.players.get(this.actualPlayerNumber);
        if(playerService.shot(this.waterGun, actualPlayer)){
            System.out.println("");
            System.out.println("¡Player " + (actualPlayerNumber + 1) + " got wet!");
          return true;
        } else {
            System.out.println("");
            System.out.println("Player " + (actualPlayerNumber + 1) + " keeps breathing.");
            
            //Updates actualPlayerNumber
            if (actualPlayerNumber == players.size() - 1){
                this.actualPlayerNumber = 0;
            } else {
                actualPlayerNumber ++;
            }
            
            return false;
        }
    }

    public byte getActualPlayerNumber() {
        return actualPlayerNumber;
    }

    public void setActualPlayerNumber(byte actualPlayerNumber) {
        this.actualPlayerNumber = actualPlayerNumber;
    }
    
    
}
