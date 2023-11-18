package Obstacle.Monster.Boss;

import Obstacle.Monster.Monster;
import Player.Player;

public class Boss extends Monster {

    private static int hp = 100;
    private static int damage = 30;

    private static int magicDamage = 30;

    private static int defense = 30;

    private static int magicRes = 30;

    public Boss(){super(hp, damage, magicDamage, defense, magicRes);}

    public void defensePose(){
        defense *=2;
    }

    public void heal(){
        this.hp +=15;
    }
}
