package Weapon.Bow;

public class ElficBow extends Bow{

    protected final static double price = 20.0;

    protected final static double damage = 60.0;

    protected final static String name = "ElficBow";

    public ElficBow(){
        super(name, damage, price);
    }
}
