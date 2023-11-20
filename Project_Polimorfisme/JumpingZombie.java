/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author Iqbal Maulana
 */
public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        double healingFactor = 0.3 * level;
        health += (int) (health * healingFactor);
    }

    @Override
    public void destroyed() {
        health -= (int) (health * 0.1);
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data = \nHealth = " + health + "\nLevel = " + level;
    }
}