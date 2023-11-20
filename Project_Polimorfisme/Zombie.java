/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author Iqbal Maulana
 */
public class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void destroyed() {
        
    }

    public void heal() {
        
    }

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level;
    }
}
