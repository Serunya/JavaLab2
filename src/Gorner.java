import java.util.Scanner;

public class Gorner {
    public static void main(String[] args) {
        double[] P = {2,7,1,4,5};
        schem(2,P);
    }
    public static void schem(double x, double[] P){
        int n = P.length - 1;
        double result = P[n] * x + P[n-1];
        for(int i = n - 1; i >= 0; i--){
            result = result * x + P[i];
        }
        System.out.println(result);
    }
}

