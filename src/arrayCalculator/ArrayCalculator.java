package arrayCalculator;


import java.sql.Array;
import java.util.Arrays;

public class ArrayCalculator {
    public int[] duplicateArrayValues(int[] array) {
        if(array==null){
            return null;
        }
        int[]verdoppelt = new int[array.length];
        for(int i = 0; i < array.length; i++){
            verdoppelt[i] = array[i]*2;
        }


        return verdoppelt;
    }

    public int[] sumArrays(int[] array1, int[] array2) throws IllegalArgumentException {
        if(array1==null){
            return null;
        }
        if(array2==null){
            return null;
        }
        if(array1.length != array2.length){
            throw new IllegalArgumentException();
        }

        int[]verdoppelt2 = new int[array1.length];
        for(int i = 0; i < array1.length; i++){
            verdoppelt2[i] = array1[i]+array2[i];
        }

        return verdoppelt2;
    }

    public int[] swapArrays(int[] array) {
        if(array==null){
            return null;
        }

        int  k = 0;
        int[] arrayb = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--){
            arrayb[k] = array[i];
            k++;
        }

            return arrayb;
    }



    public int sumEven(int[] array) {



        int endsum= 0;

        if(array==null){
            return endsum;
        }

        for(int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
               endsum += array[i];
            }
        }

        return endsum;
    }

    public int[] getLargestTwo(int[] array) throws IllegalArgumentException {
        if (array == null) {
            return null;
        }
        if (array.length <= 1){
            throw new IllegalArgumentException();
        }
        int[] groessteZahlen = new int[2];
        Arrays.sort(array);
        groessteZahlen[0] = array[array.length - 1];
        groessteZahlen[1] = array[array.length - 2];
        return groessteZahlen;

    }
}
