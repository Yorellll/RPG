package Player.Wizard;

import Player.Player;

public class Wizard extends Player {

    private static int hp = 30;

    private static int mana = 20;
    private static int damage = 5;

    private static int magicDamage = 35;

    private static int defense = 5;

    private static int magicRes = 25;

    public Wizard(String name){
        super(name, hp, mana, damage, magicDamage, defense, magicRes);
    }


}
