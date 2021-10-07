package volumeFilter;

public class VolumeFilter {

    public int[] smoothValues(int[] values) {

        int[] ge = new int[values.length];

            //den 0. berechnen 8 (der erste + der zweite) /2
            ge[0]=(values[0]+values[1])/2;

            int i;

            // Schleife vom 1. bis zum vorletzen
            for(i = 1; i < values.length -1; i++){
                // und jeweils berechnen
                int wert = (values[i-1]+values[i]+values[i+1])/3;
                //speichern im array
               ge[i] = wert;

            }

            // den letzten berechnen
            ge[ge.length-1]=(values[values.length-2]+values[values.length-1])/2;
            return ge;


    }
}
