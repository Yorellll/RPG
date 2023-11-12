package Player;

import Obstacle.Obstacle;
import Store.Store;
import Weapon.Weapon;

public class Player {
    private String name;

    private double money = 20;

    private float xp = 0;

    private int level = 1;

    private int hp;

    private int damage;

    private Weapon weapon;

    private int magicDamage;

    private int defense;

    private int magicRes;

    public Player(String name, int hp, int damage, int magicDamage, int defense, int magicRes) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.magicDamage = magicDamage;
        this.defense = defense;
        this.magicRes = magicRes;
    }

    public void addHp(int hp){
        this.hp += hp;
    }

    public void decreaseHp(int hp){
        this.hp -= hp;
    }

    public void setWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void addMoney(double money){
        this.money += money;
    }

    public void decreaseMoney(double money){this.money -= money;}

    public double getMoney(){
        return this.money;
    }

    public void levelUp(){
        this.level +=1;
    }

    public int getLvl(){
        return this.level;
    }

    public void addXp(float xp){
        this.xp +=xp;
    }

    public float getXp(){
        return this.xp;
    }

    public int getDamage(){return this.damage;}
    public void addDamage(int damage){
        this.damage += damage;
    }

    public void decreaseDamage(int damage){
        this.damage -= damage;
    }

    public int getMagicDamage(){return this.magicDamage;}
    public void addMgDam(int magicDamage){
        this.magicDamage += magicDamage;
    }

    public int getDefense(){
        return this.defense;
    }
    public void decreaseMgDam(int magicDamage){
        this.magicDamage -=magicDamage;
    }

    public void addDefense(int defense){
        this.defense += defense;
    }

    public void decreaseDef(int defense){
        this.defense -= defense;
    }

    public int getMgRes(){
        return this.magicRes;
    }

    public void addMgRes(int magicRes){
        this.magicRes += magicRes;
    }

    public void decreaseMgRes(int magicRes){
        this.magicRes -= magicRes;
    }

    public void attack(Obstacle obs){
        int dmgTaken;
        if(this.getDamage() > this.getMagicDamage()){
            dmgTaken = (this.getDamage() - obs.getDefense());
        }else {
            dmgTaken = this.getMagicDamage() - obs.getMagicRes();
        }

        obs.decreaseHp(dmgTaken);
    }

    public void buy(Store shop, Weapon choosenWeapon){
        double moneyInventory = this.getMoney();
        for (int i = 0; i < shop.getStoreInventory().size(); i++){
            if(choosenWeapon == shop.getStoreInventory().get(i)){
                if(this.getMoney() > choosenWeapon.getPrice()){
                    this.decreaseMoney(choosenWeapon.getPrice());
                    this.weapon = choosenWeapon;
                }else {System.out.println("Vous n'avez pas assez d'argent");}
            }
        }
    }

}
