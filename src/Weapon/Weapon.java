package Weapon;

public abstract class Weapon {
    private double damage;
    private String name;

    public Weapon(double damage, String name){
        this.damage = damage;
        this.name =  name;
    }

    public int getDamage() {
        return (int) damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPrice();




}
