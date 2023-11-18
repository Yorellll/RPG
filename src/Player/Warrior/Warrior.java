package Player.Warrior;

import Player.Player;

public class Warrior extends Player {

    private static int hp = 75;

    private static int mana = 25;
    private static int damage = 35;

    private static int magicDamage = 5;

    private static int defense = 25;

    private static int magicRes = 5;

    public Warrior(String name){
        super(name, hp, mana, damage, magicDamage, defense, magicRes);
    }
}
