import java.util.*;

public class Game {
    Random rand = new Random();
    private int ComputerGuess;
    private int userGuess;

    public void playGame() {
        System.out.println("We both will guess a number 5 times from 1 to 100 and,");
        System.out.println("if your guess is within 20 of my guess : then you win. Else I will win");

        int n = 5;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String Name = s.next();
        for (int i = 0; i < n; i++) {
            ComputerGuess = ComputerGuess();
            Player p = new Player();
            userGuess = p.userGuess();

            System.out.println("Computer Guess is : " + ComputerGuess);
            Compare(userGuess, ComputerGuess);
        }
    }

    public int ComputerGuess() {
        int programGuess = rand.nextInt(100);
        return programGuess;
    }

    public void Compare(int user, int computer) {
        if (user < 100) {
            if (user >= (computer - 10) && user <= computer) {
                System.out.println("User is Winner  and Computer is loser");
            } else if (user <= (computer + 10) && user >= computer) {
                System.out.println("User is Winner and Computer is loser");
            } else
                System.out.println("Computer is Winner and User is loser");

        } else
            System.out.println("You have entered wrong choice");
    }
}
