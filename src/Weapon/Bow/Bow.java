package Weapon.Bow;

import Weapon.Weapon;

public class Bow extends Weapon {

    protected double price;

    public Bow(String name, double damage, double price){
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
