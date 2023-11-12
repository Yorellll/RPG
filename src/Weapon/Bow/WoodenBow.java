package Weapon.Bow;

public class WoodenBow extends Bow{

    protected final static double price = 2.0;

    protected final static double damage = 8.0;

    protected final static String name = "WoodenBow";

    public WoodenBow(){
        super(name, damage, price);
    }
}
