package Weapon.Hammer;

public class GoldenHammer extends Hammer {
    protected final static double price = 20.0;

    protected final static double damage = 40.0;

    protected final static String name = "GoldenHammer";

    public GoldenHammer(){
        super(name, damage, price);
    }
}
