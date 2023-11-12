package Obstacle.Stone;

import Obstacle.Obstacle;

public class Stone extends Obstacle {

    private static int hp = 50;

    private static int defense = 15;

    private static int magicRes = 15;

    public Stone(){
        super(hp);
    }

    @Override
    public int getDefense() {
        return this.defense;
    }

    @Override
    public int getMagicRes() {
        return this.magicRes;
    }
}
