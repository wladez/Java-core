/**
 * Created by Владислав on 23.09.2017.
 */
package homework.intro;

public class Ex3Intro {
    public static void main(String[] args){
        int a = 0;
        int b = 5;
        double h = Math.PI/6;
        double i = a;
        System.out.println("x   F(x)");
        while(i <= b){
            double y = Math.tan(i) - 3;
            System.out.println(i + "    " + y);
            i += h;
        }
    }
}
