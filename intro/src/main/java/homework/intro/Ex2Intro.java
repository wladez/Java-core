/**
 * Created by Владислав on 24.09.2017.
 */
package homework.intro;

import lombok.Data;

public class Ex2Intro {
    public static void main(String[] args)
    {
        double epsilon = 0.01;
        int n = 15;
        double[] a = new double[n];
        int res = -1;
        for (int i = 0; i < n; i++) {
            a[i] = 1 / Math.pow((i + 1), 2);
            System.out.print(a[i]+ " ");
            if (a[i] < epsilon) {
                res = i;
                break;
            }
        }

        if(res > 0) {
            System.out.println("Min index is " + res);
        } else {
            System.out.println("No element satisfies the condition");
        }
    }
}
