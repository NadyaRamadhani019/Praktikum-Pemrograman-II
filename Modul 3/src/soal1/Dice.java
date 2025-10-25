package soal1;

import java.util.*;

public class Dice {
    private int diceNum;

    public Dice(){
        randomizeValue();
    }

    public void randomizeValue(){
        Random rand = new Random();
        this.diceNum = rand.nextInt(6)+1;
    }

    public int getDiceNum(){
        return this.diceNum;
    }
}