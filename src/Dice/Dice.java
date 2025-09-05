package Dice;

import java.util.Random;

public class Dice {
    private Random rand = new Random();
    int dice = rand.nextInt(6) + 1;

    public void rollUntilFive() {
        int roll = 0;
        while (roll != 6 ) {
            roll = rand.nextInt(6) + 1;
            System.out.println("Rolled: " + roll);
        }

        System.out.println("You rolled all the dice!");
    }
}
