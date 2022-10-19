import java.util.Arrays;

public class Regby {
    public static void main(String[] args) {
        double[] lions = {18, 18.6, 19.1, 19.8, 20.5, 20.9, 21.3, 22, 23.4, 24.1, 25, 26, 26.7, 28, 29, 30.3, 31, 32, 33.6, 34, 35, 36.8, 39, 39.5, 40};
        double[] eagles = lions.clone();
        eagles[2] = 19; eagles [7] = 37;
        eagles[5] = 32;
        double sum1 = 0;
        double sum2 = 0;
        for (double x : lions){
            sum1 = sum1 + x;
        }
        System.out.println("lions =" + Arrays.toString(lions));
        System.out.println("lions avg ="+ sum1 / lions.length);
        for (double x : eagles){
            sum2 = sum2 + x;
        }
        System.out.println("eagles ="+ Arrays.toString(eagles));
        System.out.println("eagles avg =" + sum2 / eagles.length );

    }
}
