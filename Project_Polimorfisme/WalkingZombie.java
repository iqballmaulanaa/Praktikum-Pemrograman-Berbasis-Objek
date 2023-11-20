/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author Iqbal Maulana
 */
public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        double healingFactor = 0.2 * level;
        health += (int) (health * healingFactor);
    }

    @Override
    public void destroyed() {
        health -= (int) (health * 0.2);
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = \nHealth = " + health + "\nLevel = " + level;
    }
}