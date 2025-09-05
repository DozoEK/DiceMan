package Dice;

import java.util.Random;

public class DiceRoll {
    private Random rand = new Random();

    public void rollUntilFive() {
        int roll = 0;
        while (roll < 5) {
            roll += rand.nextInt(6);
            System.out.println("Rolled: " + roll);
        }
        System.out.println("You rolled ");
    }
}
