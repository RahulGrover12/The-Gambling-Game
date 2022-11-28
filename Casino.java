import java.util.*;

public class Casino {

    Player p1 = new Player();
    Game g1 = new Game();
    String userAnswer;
    Scanner sc = new Scanner(System.in);

    public void OrganizeNewGame() {
        System.out.println("Welcome to our Casino : Would you like to play a game? (y/n)");
        userAnswer = sc.next();
        if (userAnswer.equals("y") || userAnswer.equals("Y")) {
            System.out.println("Let's get started");
            g1.playGame();
        } else
            System.out.println("Good Bye");
    }

}
