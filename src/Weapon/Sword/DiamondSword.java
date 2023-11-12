package Weapon.Sword;

public class DiamondSword extends Sword{

    protected final static double price = 20.0;

    protected final static double damage = 60.0;

    protected final static String name = "DiamondSword";

    public DiamondSword(){
        super(name, damage, price);
    }
}
