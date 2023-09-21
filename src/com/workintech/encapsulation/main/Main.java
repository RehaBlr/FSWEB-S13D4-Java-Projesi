package com.workintech.encapsulation.main;

import com.workintech.encapsulation.model.Player;
import com.workintech.encapsulation.model.Point;
import com.workintech.encapsulation.model.Weapon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());*/

        Player player = new Player("player", 105, Weapon.DAGGER);
        System.out.println(player);
        player.loseHealth(98);
        System.out.println(player);
        player.restoreHealth(30);
        System.out.println(player);
    }
}