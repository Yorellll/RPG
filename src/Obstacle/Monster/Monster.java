package Obstacle.Monster;

import Obstacle.Obstacle;
import Player.Player;

public class Monster extends Obstacle {

    private int damage;
    private int magicDamage;
    private int defense;
    private int magicRes;

    public Monster(int hp, int damage, int magicDamage, int defense, int magicRes){
        super(hp);
        this.damage = damage;
        this.magicDamage = magicDamage;
        this.defense = defense;
        this.magicRes = magicRes;
    }

    public int getDamage(){return this.damage;}


    public int getMagicDamage(){return this.magicDamage;}

    @Override
    public int getDefense(){return this.defense;}

    @Override
    public int getMagicRes(){return this.magicRes;}

    public void attack(Player play){
        int dmgTaken;
        if(this.getDamage() > this.getMagicDamage()){
            dmgTaken = (this.getDamage() - play.getDefense());
        }else {
            dmgTaken = this.getMagicDamage() - play.getMgRes();
        }

        play.decreaseHp(dmgTaken);
    }
}
