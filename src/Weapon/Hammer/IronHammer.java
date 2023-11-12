package Weapon.Hammer;

public class IronHammer extends Hammer {

    protected final static double price = 10.0;

    protected final static double damage = 20.0;

    protected final static String name = "IronHammer";

    public IronHammer(){
        super(name, damage, price);
    }
}
