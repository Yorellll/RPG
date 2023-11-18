package Player.Elf;

import Player.Player;

public class Elf extends Player{

    private static int hp = 50;

    private static int mana = 20;
    private static int damage = 25;

    private static int magicDamage = 25;

    private static int defense = 10;

    private static int magicRes = 10;

    public Elf(String name){
        super(name, hp, mana, damage, magicDamage, defense, magicRes);
    }


}
