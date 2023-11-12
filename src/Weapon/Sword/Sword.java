package Weapon.Sword;

import Weapon.Weapon;

public class Sword extends Weapon {

    protected double price;

    public Sword(String name, double damage, double price){
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
