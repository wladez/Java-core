/**
 * Created by Владислав on 23.09.2017.
 */
package homework.intro;

public class Ex4Intro {
    public static void main(String[] args){
        double[] array = {1.0, 2.4, 3.5, 4.6, 5.7};
        double[] array2 = new double [array.length*2];

        for(int i=0; i<2; i++){
            for(int j=0; j<array.length; j++){
                array2[j+i*array.length] = array[j];
            }
        }

        double[] sumArray = new double[array2.length];

        for(int i=0; i<array2.length; i++){
            sumArray[i] = array2[i] + array2[array2.length-i-1];
        }

        double max = sumArray[0];

        for(int i = 0; i<sumArray.length; i++){
            if(max < sumArray[i]){
                max = sumArray[i];
            }
        }
        System.out.print("Max value is " + max);
    }
}
