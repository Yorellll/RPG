package Weapon.Sword;

public class IronSword extends Sword{

    protected final static double price = 15.0;

    protected final static double damage = 30.0;

    protected final static String name = "IronSword";

    public IronSword(){
        super(name, damage, price);
    }
}
