package randomNumbers;

import javax.swing.plaf.IconUIResource;
import java.util.Random;

public class RandomNumbers{
    public int[] getRandomNumbers(int number) {
        int[] randomnumbers = new int[number];

        for (int i = 0; i < number; i++) {
            int zahl;
            Random generator = new Random();
            zahl = generator.nextInt(11);

            randomnumbers[i] = generator.nextInt(10) + 1;
        }
        return randomnumbers;
    }

    public int evaluateArray(int[] randomNumbers, int digit){

        int count = 0;

                for(int i = 0; i < randomNumbers.length; i++) {
                    if (digit == randomNumbers[i]){
                        count ++;
            }
        }
         return count;


    }

    public String getRandomNumbersToString(int[] randomNumbers){
        String ender = null;
        for(int i = 0; i < randomNumbers.length; i++)
            ender =+ randomNumbers[0]+" ";




        return ender;
    }
}