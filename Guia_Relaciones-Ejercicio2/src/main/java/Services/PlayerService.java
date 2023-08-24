/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Player;
import Entities.WaterGun;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PlayerService {
    private WaterGunService waterGunService;
    private ArrayList<Player> players;
    
    public PlayerService() {
        players = new ArrayList();
        waterGunService = new WaterGunService();
    }
    
    public PlayerService(byte numberOfPlayers) {
        players = new ArrayList();
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player((byte)i));
        }
        waterGunService = new WaterGunService();
    }
    
    public boolean shot (WaterGun waterGun, Player player){
        
        if (waterGunService.shot(waterGun)){
            //System.out.println("¡Wet!");
            player.setWet(true);
            return true;
        } else {
            waterGunService.nextShot(waterGun);
            return false;
        }
    }
    
    public void printPlayersStatus(){
        System.out.println("");
        System.out.println("Players status:");
        for (int i = 0; i < players.size(); i++) {
            if(players.get(i).getWet()){
                System.out.println(players.get(i).getName() + " is wet");
            } else {
                System.out.println(players.get(i).getName() + " is dry");
            }
            
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
    
    
}
