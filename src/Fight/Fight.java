package Fight;

import Obstacle.Monster.Monster;
import Obstacle.Obstacle;
import Player.Player;

import java.util.Objects;
import java.util.Scanner;

public class Fight {

    private Obstacle ob;

    public Obstacle getOb() {
        return ob;
    }

    public void setOb(Obstacle ob) {
        this.ob = ob;
    }

    public Player getP() {
        return p;
    }

    public void setP(Player p) {
        this.p = p;
    }

    private Player p;

    public Fight(Obstacle ob, Player p){
        this.p = p;
        this.ob = ob;
    }

    public void destroy(){
        System.out.println("Here is just an obstacle, you can destroy it easily");
        System.out.println("It only have " + this.getOb().getHp() + "hp");
        System.out.println("Would you do it ? Yes/No");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if(Objects.equals(choice, "Yes")){
            this.menuFight(this.getOb(), this.getP());
        } else if (Objects.equals(choice, "No")) {
            System.out.println("It's an illusion, you don't have the choice. Just destroy it");
        }else {
            System.out.println("Entry error, try again");
        }
    }

    public void menuFight(Obstacle ob, Player p){

        String choice;
        while (ob.getHp() > 0){
            Scanner scan = new Scanner(System.in);
            System.out.println("What would you ? \n" +
                    "Attack ? \n" +
                    "Heal \n" +
                    "Heal mana");
            choice = scan.nextLine();
            if(Objects.equals(choice, "Attack")){
                p.attack(ob);
                if(ob.getHp() <0){
                    ob.setHp(0);
                }
                System.out.println("Obstacle hp : " + ob.getHp());
            } else if (Objects.equals(choice, "Heal")) {
                p.heal();
                System.out.println("Player hp :" + p.getHp());
            } else if (Objects.equals(choice, "Heal mana")) {
                p.healMana();
                System.out.println("Mana :" + p.getMana());
            }else {
                System.out.println("Entry error, try again");
            }
        }
        System.out.println("Fight complete");
    }

    public void menuFightMonster(Monster ob, Player p){

        String choice;
        int hpOb = ob.getHp();
        while (ob.getHp() > 0){
            Scanner scan = new Scanner(System.in);
            System.out.println("Oh god, here is a crazy boss.");
            System.out.println("What would you ? \n" +
                    "Attack ? \n" +
                    "Heal \n" +
                    "Heal mana");
            choice = scan.nextLine();
            if(Objects.equals(choice, "Attack")){
                p.attack(ob);
                System.out.println("Boss hp :" + ob.getHp());
                hpOb = ob.getHp();
                ob.attack(p);
                System.out.println("Player hp:" + p.getHp());
            } else if (Objects.equals(choice, "Heal")) {
                p.heal();
                System.out.println("Player hp :" + p.getHp());
            } else if (Objects.equals(choice, "Heal mana")) {
                p.healMana();
                System.out.println("Mana :" + p.getMana());
            }else {
                System.out.println("Entry error, try again");
            }
        }
        System.out.println("Fight complete");
    }

    public void destroyMonster(Monster ms){
        System.out.println("Here is just a Monster, you can destroy it easily");
        System.out.println("It only have " + ms.getHp() + "hp");
        System.out.println("Would you do it ? Yes/No");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if(Objects.equals(choice, "Yes")){
            this.menuFight(this.getOb(), this.getP());
        } else if (Objects.equals(choice, "No")) {
            System.out.println("It's an illusion, you don't have the choice. Just destroy it");
        }else {
            System.out.println("Entry error, try again");
        }
    }
}
