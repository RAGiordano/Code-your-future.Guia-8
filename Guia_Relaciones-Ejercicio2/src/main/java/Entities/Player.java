/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Usuario
 */
public class Player {
    private byte id;
    private String name;
    private boolean wet;

    public Player() {
    }

    public Player(byte id) {
        this.id = id;
        this.name = "Jugador " + (id + 1);
        this.wet = false;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getWet() {
        return wet;
    }

    public void setWet(boolean mojado) {
        this.wet = mojado;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", name=" + name + ", wet=" + wet + '}';
    }
    
    
}
