package com.workintech.encapsulation.model;

public enum Weapon {

    DAGGER(5,2.5),
    SWORD(10,1.8),
    AXE(15,1.5),
    MACE(20,1.2);


    private int damage;
    private double attackSpeed;
    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
