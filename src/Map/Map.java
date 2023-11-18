package Map;

import Fight.Fight;
import Obstacle.Monster.Boss.Boss;
import Obstacle.Monster.Monster;
import Obstacle.Monster.Slime.Slime;
import Obstacle.Obstacle;
import Obstacle.Stone.Stone;
import Player.Player;
import Store.Store;
import Weapon.Weapon;

import java.util.ArrayList;
import java.util.Scanner;

public class Map {

    static int[][] MAP_TEMPLATE_DEFAULT = {
            {2, 3, 3, 4, 1, 0},
            {0, 0, 1, 0, 4, 1},
            {1, 3, 6, 4, 3, 1},
            {1, 4, 3, 4, 6, 4},
            {1, 0, 3, 4, 0, 0},
            {1, 3, 4, 3, 6, 5},

    };
    private int[][] map;
    public Map(){this.map = MAP_TEMPLATE_DEFAULT; }

    public int[][] getMap(){return this.map;}


    public int[][]setMap(int[][] newMap){
        MAP_TEMPLATE_DEFAULT = newMap;
        return MAP_TEMPLATE_DEFAULT;
    }
    public void showMap(){
        int numTab = 0;
        String line = "";
        for(int i = 0; i < map.length; i++){
            for (int j = 0; j < map[numTab].length; j ++){
                line += map[numTab][j] + " ";

            }
            numTab+= 1;
            System.out.println(line);
            line = "";

        }
    }

    public void movePlayer(int targetRow, int targetCol) {
        boolean canMove;
        int currentRow = -1;
        int currentCol = -1;

        outerLoop:
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 2) {
                    currentRow = i;
                    currentCol = j;
                    break outerLoop;
                }
            }
        }

        if (isAdjacent(currentRow, currentCol, targetRow, targetCol)) {

            map[currentRow][currentCol] = 0;
            map[targetRow][targetCol] = 2;


            displayMap();
            canMove = true;
        } else {
            System.out.println("The position you just asked is not next to your player. Try again.");
            canMove = false;
        }
    }

    public void displayMap() {
        for (int[] row : map) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private boolean isAdjacent(int row1, int col1, int row2, int col2) {
        return Math.abs(row1 - row2) <= 1 && Math.abs(col1 - col2) <= 1;
    }

    public boolean isPositionValid(int row, int col) {
        return row >= 0 && row < map.length && col >= 0 && col < map[0].length;
    }

    public void move(int targetRow, int targetColumn) {
        do {
            Scanner scan = new Scanner(System.in);

            this.movePlayer(targetRow, targetColumn);

            System.out.println("\nNew map :");
            this.displayMap();

        } while (!this.isPositionValid(targetRow, targetColumn));
    }

    public void cellType(Player p, Monster bs, int row, int col){
        int[][] moveTarget = this.getMap();
        switch (moveTarget[row][col]){
            case 1:
                System.out.println("You can't move here.");
                break;
            case 2:
                System.out.println("You can't move here, it's you.");
                break;
            case 3:
                Obstacle ob = new Stone();
                Fight f = new Fight(ob, p);
                f.destroy();
                p.battleGain();
                break;
            case 4:
                Monster ms = new Slime();
                Fight fi = new Fight(ms, p);
                fi.destroyMonster(ms);
                p.battleGain();
                break;
            case 5:
                Fight fiB = new Fight(bs, p);
                fiB.menuFightMonster(bs, p);
                bs.setHp(0);
                break;
            case 6:
                String shopName = "Crous";
                System.out.println("Here is the shop :" + shopName);
                int money = 999;
                ArrayList<Weapon> storeInventory = new ArrayList<Weapon>();
                Store sh = new Store(shopName, money);
                storeInventory = sh.getStoreInventory();
                for(int i = 0; i < storeInventory.size(); i++){
                    Weapon weap;
                    String weaponName;
                    weap = storeInventory.get(i);
                    weaponName = weap.getName();
                    System.out.println( "Item " + i + " : " + weaponName + " " + " Damage : " + weap.getDamage() + " Price : " + weap.getPrice());
                }
                System.out.println("Which do you choose ? (Just enter the number)");
                Scanner scan = new Scanner(System.in);
                int numberChoose = scan.nextInt();
                p.buy(sh, storeInventory.get(numberChoose));
                break;


        }
    }
}
