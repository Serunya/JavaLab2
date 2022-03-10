import java.util.Arrays;
public class tableFunction {
    public static void main(String[] args) {
        double[][] func = function();
        System.out.printf("%-15s","x");
        System.out.printf("%-10s", "sin(x)");
        System.out.printf("%-10s","e^x / x * lg(x)\n");
        for (int i = 0; i < 15; i++) {
            System.out.printf("%-15.7f", func[0][i]);
            System.out.printf("%-10.5f", func[1][i]);
            System.out.printf("%-10.5f\n", func[2][i]);
        }
        /*
        System.out.printf("\n%-15s", "sin(x)");
        for (int i = 0; i < 15; i++) {
            System.out.printf("%10.5f ", func[1][i]);
        }
        for (int i = 0; i < 15; i++) {
            System.out.printf("%10.5f ", func[2][i]);
        }
         */
    }

    static double[][] function(){
        final double Pi = 3.1415926;
        final double step = Pi/15;
        final double e = 2.72;
        double[][] arr = new double[3][15];
        double x = 0;
        for (int i = 0; i < 15; i++){
            x+= step;
            arr[0][i] = x;
        }
        x = 0;
        for(int i = 0; i < 15; i++){
            x += step;
            arr[1][i] = Math.sin(x);
        }
        x = 0;
        for(int i = 0; i < 15; i++){
            x += step;
            arr[2][i] = Math.pow(e,x) / x * Math.log10(x) ;
        }
        return arr;
    }
}
