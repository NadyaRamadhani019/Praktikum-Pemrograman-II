package soal1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumOfDice = input.nextInt();
        LinkedList<Dice> diceList = new LinkedList<>();

        for (int i = 0; i < randomNumOfDice; i++) {
            diceList.add(new Dice());
        }

        int allValDice = 0;
        for(int i = 0; i < diceList.size(); i++){
            Dice dd = diceList.get(i);
            int diceNum = dd.getDiceNum();
            System.out.println("Dadu ke-" + (i+1)+ "bernilai " + diceNum);
            allValDice += diceNum;
        }

        System.out.println("Total nilai dadu keseluruhan " + allValDice);

    }
}