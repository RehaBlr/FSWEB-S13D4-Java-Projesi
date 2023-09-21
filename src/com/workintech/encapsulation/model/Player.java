package com.workintech.encapsulation.model;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    private void checkHealth(int healthPercentage) {
        if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        checkHealth(healthPercentage);
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        int healthRemain = healthPercentage - damage;
        checkHealth(healthRemain);
        if (healthPercentage == 0) {
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion) {
        checkHealth(healthPotion + healthPercentage);
    }


    public String toString() {
        return "Name: " + name + " Health: " + healthPercentage +
                " Weapon: " + weapon.getDamage() + "-" + weapon.getAttackSpeed();
    }
}
