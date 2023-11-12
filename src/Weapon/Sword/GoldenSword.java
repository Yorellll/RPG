package Weapon.Sword;

public class GoldenSword extends Sword{

    protected final static double price = 20.0;

    protected final static double damage = 60.0;

    protected final static String name = "GoldenSword";

    public GoldenSword(){
        super(name, damage, price);
    }
}
