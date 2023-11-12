package Obstacle;

import java.io.ObjectStreamException;

public abstract class Obstacle {

    private int hp;

    public Obstacle(int hp){
        this.hp = hp;
    }

    public abstract int getDefense();

    public abstract int getMagicRes();

    public int getHp(){return this.hp;}

    public void setHp(int hp){this.hp = hp;}

    public void decreaseHp(int hp){
        this.hp -= hp;
    }
}
