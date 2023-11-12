package Obstacle.Monster.Slime;

import Obstacle.Monster.Monster;

public class Slime extends Monster {

    private static int hp = 15;

    private static int damage = 5;

    private static int magicDamage = 13;

    private static int defense = 2;

    private static int magicRes = 12;

    public Slime(){
        super(hp, damage, magicDamage, defense, magicRes);
    }
}
