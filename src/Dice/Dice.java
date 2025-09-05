package Dice;

import java.util.Random;

public class Dice {
    private Random rand = new Random();
    int dice = (int)(Math.random() * 6) +1;

    public void rollUntilFive() {
        int rollcounter = 1;
        int roll = 0;
        while (rollcounter < 6) {
            roll = rand.nextInt(6) + 1;
            System.out.println("Rolled: " + roll);
            rollcounter++;
        }

        System.out.println("EK DiceMan rolled all the dice!");
    }

}
