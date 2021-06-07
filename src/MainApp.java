import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SnakeAndLadder sl=new SnakeAndLadder();
        sl.playerDetails();
        sl.gameRules();
        System.out.println("enter 1 to star :: enter 0 to quite ");
        if(sc.nextInt()==1){
            sl.createBoard();
            sl.diceRoll();
        }else {
            System.exit(0);
        }

    }
}
