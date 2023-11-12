package Obstacle.Monster.Orc;

import Obstacle.Monster.Monster;

public class Orc extends Monster {

    private static int hp = 25;

    private static int damage = 10;

    private static int magicDamage = 2;

    private static int defense = 20;

    private static int magicRes = 5;

    public Orc(){
        super(hp, damage, magicDamage, defense, magicRes);
    }

}
