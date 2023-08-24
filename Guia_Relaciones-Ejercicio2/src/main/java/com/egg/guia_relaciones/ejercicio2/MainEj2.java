/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.guia_relaciones.ejercicio2;

import Entities.Game;
import Services.PlayerService;
import Services.WaterGunService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game;
        WaterGunService waterGunService;
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        byte numberOfPlayers;
        byte actualPlayerNumber;
        PlayerService playerService;
        boolean playAgain = false;
        boolean continuePlaying;
        boolean gotWet = false;
        byte turn;

        do {
            System.out.println(" _______________________");
            System.out.println("|                       |");
            System.out.println("|   RUSSIAN WATER GUN   |");
            System.out.println("|_______________________|");
            System.out.println("");
            System.out.println("    *** NEW GAME ***");
            System.out.println("");
            System.out.println("¿How many players are there?");
            numberOfPlayers = Byte.parseByte(read.next());
            System.out.println("");
            System.out.println("¿Let's start? Press <ENTER> until someone gets wet");
            System.out.println("");
            read.next();

            //Sets new game
            waterGunService = new WaterGunService();
            playerService = new PlayerService(numberOfPlayers);
            game = new Game();
            game.fillGame(playerService.getPlayers(), waterGunService.getWaterGun());
            continuePlaying = true;
            turn = 1;

            do {
                System.out.println("Turn " + turn);
                System.out.println("");
                gotWet = game.playRound();
                actualPlayerNumber = game.getActualPlayerNumber();
                if (gotWet) {
                    System.out.println("¿Continue playing? (y/n)");
                    System.out.println("");
                    continuePlaying = (read.next().toLowerCase().equals("y"));
                    if (continuePlaying) {
                        
                        if (actualPlayerNumber == numberOfPlayers - 1) {
                            actualPlayerNumber = 0;
                        } else {
                            actualPlayerNumber ++;
                        }
                        
                        game.fillGame(playerService.getPlayers(), waterGunService.getWaterGun());

                        game.setActualPlayerNumber(actualPlayerNumber);
                        turn = 0;
                    }

                } else {
                    System.out.println("Dry. Press ENTER");
                    read.next();
                }
                turn ++;
            } while (continuePlaying);
            playerService.printPlayersStatus();
            System.out.println("");
            System.out.println("   *** GAME OVER ***");
            System.out.println("");
            System.out.println("¿Do you want to play again? (y/n)");
            playAgain = (read.next().toLowerCase().equals("y"));
        } while (playAgain);
        System.out.println("");
        System.out.println("Logging out");
    }

}
