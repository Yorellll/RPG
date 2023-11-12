package Weapon.Hammer;

import Weapon.Weapon;

public class Hammer extends Weapon {

    protected double price;

    public Hammer(String name, double damage, double price){
        super(damage, name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
