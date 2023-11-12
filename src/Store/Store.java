package Store;

import Weapon.Bow.ElficBow;
import Weapon.Bow.WindBow;
import Weapon.Bow.WoodenBow;
import Weapon.Hammer.DiamondHammer;
import Weapon.Hammer.GoldenHammer;
import Weapon.Hammer.IronHammer;
import Weapon.Sword.DiamondSword;
import Weapon.Sword.GoldenSword;
import Weapon.Sword.IronSword;
import Weapon.Weapon;

import java.util.ArrayList;

public class Store {

    private ArrayList<Weapon> storeInventory = new ArrayList<Weapon>();

    private String storeName;

    private double money;

    public Store(String storeName, int money){
        this.storeName = storeName;
        this.money = money;

        this.storeInventory.add(new WoodenBow());
        this.storeInventory.add(new WindBow());
        this.storeInventory.add(new ElficBow());

        this.storeInventory.add(new IronHammer());
        this.storeInventory.add(new GoldenHammer());
        this.storeInventory.add(new DiamondHammer());

        this.storeInventory.add(new IronSword());
        this.storeInventory.add(new GoldenSword());
        this.storeInventory.add(new DiamondSword());
    }


    public ArrayList<Weapon> getStoreInventory() {
        return storeInventory;
    }

    public void setStoreInventory(ArrayList<Weapon> storeInventory) {
        this.storeInventory = storeInventory;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
