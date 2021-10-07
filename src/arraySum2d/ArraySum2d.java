package arraySum2d;

public class ArraySum2d {
    public int sumAll(int[][] array) throws IllegalArgumentException {

        int eins = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                eins += array[i][j];
            }
        }
        return eins;
    }

    public int[] rowSums(int[][] array) throws IllegalArgumentException {





        return null;
    }

    public int[] colSums(int[][] array) throws IllegalArgumentException {
        return null;
    }
}
