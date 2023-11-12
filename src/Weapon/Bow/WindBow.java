package Weapon.Bow;

public class WindBow extends Bow{
    protected final static double price = 6.0;

    protected final static double damage = 20.0;

    protected final static String name = "WindBow";

    public WindBow(){
        super(name, damage, price);
    }
}
