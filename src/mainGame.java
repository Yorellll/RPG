import Fight.Fight;
import Map.Map;
import Obstacle.Monster.Boss.Boss;
import Obstacle.Monster.Monster;
import Obstacle.Monster.Slime.Slime;
import Obstacle.Obstacle;
import Obstacle.Stone.Stone;
import Player.Elf.Elf;
import Player.Player;
import Player.Warrior.Warrior;
import Player.Wizard.Wizard;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class mainGame {
    public static void main(String[] args) {


        //Initialisation du joueur et de sa class

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your player's name :");
        String name = scan.nextLine();

        System.out.println("Which class player do you want to play ? Just enter the right number 1, 2 or 3.");

        System.out.println("1 : Elf : A powerful creature from the forest");
        System.out.println("2 : Warrior: A strong man which only swear with strength");
        System.out.println("3 : Wizard : A strange character which only use spells");
        System.out.println("If you write something wrong, you will be an Elf by default");
        int playerClass = scan.nextInt();

        Player player = new Elf(name);;


        player = switch (playerClass) {
            case 1 -> new Elf(name);
            case 2 -> new Warrior(name);
            case 3 -> new Wizard(name);
            default -> player;
        };


        System.out.println("Here is who you are :" + player.getClass() + "\n" + "Name : " + player.getName());
        System.out.println("Your hp : " +player.getHp() + "\n" +
                "Your default damage : " + player.getDamage() + "\n" +
                "Your magic damage :" + player.getMagicDamage() + "\n" +
                "Your starting money :" + player.getMoney() + "\n" +
                "Your mana :" + player.getMana() + "\n" +
                "Your defense :" + player.getDefense() + "\n" +
                "Your magic resistance :" + player.getMgRes() + "\n" +
                "Your weapon : " + "You start only with your hands" + "\n" +
                "Your start at lvl : " + player.getLvl());

        //Initialisation du boss qui marque la fin du jeu si on le bat
        Monster bs = new Boss();
        System.out.println();

        //Affichage de la map + mouvement du joueur

        System.out.println("Here is the map : ");
        System.out.println();
        System.out.println("1-> Can't move here \n" +
                           "2-> Player \n" +
                           "3-> Simple and destructible obstacle \n" +
                           "4-> Monster \n" +
                           "5-> Boss \n" +
                           "6-> Shop");
        Map myMap = new Map();
        System.out.println();

        System.out.println("MAP : ");
        myMap.displayMap();
        System.out.println("You can now choose where to go : ");

        int targetRow;

        int targetColumn;

        //Début du jeu
        int hpBoss = bs.getHp();
        while (hpBoss > 0){

            System.out.print("Enter the new row for the player (The first top is 0): ");
            targetRow = scan.nextInt();

            System.out.print("Enter the new column for the player (The first left is 0): ");
            targetColumn = scan.nextInt();

            myMap.cellType(player, bs, targetRow, targetColumn);

            myMap.movePlayer(targetRow, targetColumn);

            hpBoss = bs.getHp();

        }

        System.out.println("Congratulation, you've finished the game");








    }
}