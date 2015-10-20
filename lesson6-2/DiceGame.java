// lesson6/chevalier_de_mere

import java.util.Random;

public class DiceGame
{
    Random generator;
    
    public DiceGame()
    {   
        generator = new Random(45);
    }
    /** 
     * Throw a die four times and bet on at least one 6. 
     * @return true if the chevalier wins. 
     */
    public boolean game1()
    {
        // YOUR CODE HERE
        // Use the instance variable generator to simulate 
        // 4 die rolls. 
        // Return true if the chevalier wins (at least one is a 6).
        boolean seen6 = false;
        for (int i = 0; i < 4; ++i) {
            int dice = generator.nextInt(6) + 1;
            if (dice == 6) seen6 = true;
        }
        return seen6;
    }
    
    /**
     * Throw two dice 24 times and bet on at least one double-six.
     * @return true if the chevalier wins. 
     */
    public boolean game2()
    {   
        // YOUR CODE HERE 
        // Use the instance variable generator to simulate 
        // 24 rolls of a pair of dice.
        // Return true if at least one pair is both 6s. 
        boolean seen6 = false;
        for (int i = 0; i < 24; ++i) {
            int dice1 = generator.nextInt(6) + 1;
            int dice2 = generator.nextInt(6) + 1;
            if (dice1 == 6 && dice2 == 6) seen6 = true;
        }
        return seen6;
    }
}

