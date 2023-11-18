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

    private int mana;

    private int damage;

    private Weapon weapon;

    private int magicDamage;

    private int defense;

    private int magicRes;

    public Player(String name, int hp, int mana, int damage, int magicDamage, int defense, int magicRes) {
        this.name = name;
        this.mana = mana;
        this.hp = hp;
        this.damage = damage;
        this.magicDamage = magicDamage;
        this.defense = defense;
        this.magicRes = magicRes;
    }

    public String getName(){
        return this.name;
    }

    public void addHp(int hp){
        this.hp += hp;
    }

    public void decreaseHp(int hp){
        this.hp -= hp;
    }

    public int getHp(){return this.hp;}

    public int getMana(){return this.mana;}

    public void setMana(int mana){this.mana = mana;}

    public void addMana(int mana){this.mana+=mana;}

    public void decreaseMana(int mana){this.mana-=mana;}

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
            this.mana -=5;
        }else {
            dmgTaken = this.getMagicDamage() - obs.getMagicRes();
            this.mana -=5;
        }

        obs.decreaseHp(dmgTaken);
    }

    public void heal(){
        this.hp+=5;
    }

    public void healMana(){
        this.mana+=10;
    }

    public void buy(Store shop, Weapon choosenWeapon){
        double moneyInventory = this.getMoney();
        for (int i = 0; i < shop.getStoreInventory().size(); i++){
            if(choosenWeapon == shop.getStoreInventory().get(i)){
                if(this.getMoney() > choosenWeapon.getPrice()){
                    this.decreaseMoney(choosenWeapon.getPrice());
                    this.weapon = choosenWeapon;
                    this.addDamage(choosenWeapon.getDamage());
                    System.out.println("Voici maintenant vos dégâts : " + this.getDamage());
                }else {System.out.println("Vous n'avez pas assez d'argent, au revoir.");}
            }
        }
    }

    public void battleGain(){
        this.addXp(25);
        this.lvlup();
        this.addMoney(100);
    }
    public void lvlup(){
        if (this.xp % 100 == 0){
            this.level += 1;
            this.xp = 0;
            this.addDamage(10);
            this.addMgDam(10);
            this.addDefense(10);
            this.addMgRes(10);
            this.addHp(10);
            System.out.println("Congratulation you gain 1 level");
            System.out.println();
            System.out.println("Here is your new stat : " + "\n" +
                    "Damage :" + this.getDamage() + "\n" +
                    "Magic damage :" + this.getMagicDamage() + "\n" +
                    "Defense :" + this.getDefense() + "\n" +
                    "Magic resistance :" + this.getMagicDamage() + "\n" +
                    "Hp :" + this.getHp() + "\n");
        }
    }

}
