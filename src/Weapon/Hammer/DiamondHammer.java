package Weapon.Hammer;

public class DiamondHammer extends Hammer{
    protected final static double price = 40.0;

    protected final static double damage = 80.0;

    protected final static String name = "DiamondHammer";

    public DiamondHammer(){
        super(name, damage, price);
    }
}
