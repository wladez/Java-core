/**
 * Created by Владислав on 23.09.2017.
 */
package homework.intro;

public class Ex5Intro {
    public static void main(String[] args){
        int n = 7; //размер матрицы (n на n)
        int[][] array = new int[n][n];
        for(int i = 0; i < n; i++){
            array[i][i] = 1;
            array[i][n-1-i] = 1;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
