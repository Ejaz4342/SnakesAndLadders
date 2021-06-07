import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
    int diceValue;
    String p1;
    String p2;
    Random random=new Random();
    Scanner sc=new Scanner(System.in);
    public void playerDetails(){
        System.out.println("enter name of player1 ");
        p1=sc.next();
        System.out.println("enter name of player1 ");
        p2=sc.next();
    }
    public void gameRules(){
        System.out.println("Welcome "+p1+" and "+p2);
        System.out.println("*************************************");
        System.out.println("please reads the Rules of game carefully");
        System.out.println("1) each player will get one turn.");
        System.out.println("2) you can not playe after your turn plz wait for your next turn");
        System.out.println("3) there are total 8 snakes and 8 ladders");
    }
    int[] board=new int[100];
    public void createBoard(){

        for (int i=0;i<board.length;i++){
            board[i]=i+1;
        }
    }
    public void diceRoll(){
        for (int i=0;i<board.length;i++) {
            System.out.println(p1 + " please enter 1 to roll the dice");
            int pl1 = sc.nextInt();
            if (pl1 == 1) {
                diceValue = random.nextInt(7);
                System.out.println(diceValue);
            } else {
                System.out.println(p2 + " please wait for your turn");
            }
            System.out.println(p2 + " please enter 2 to roll the dice");
            int pl2 = sc.nextInt();
            if (pl2 == 2) {
                diceValue = random.nextInt(7);
                System.out.println(diceValue);
            } else {
                System.out.println(p1 + " please wait for your turn");
            }
        }
    }

}




