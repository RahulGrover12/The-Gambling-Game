//Player Class//

import java.util.*;

public class Player {
    public int userGuess() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int userGuess = s.nextInt();
        return userGuess;
    }

}
