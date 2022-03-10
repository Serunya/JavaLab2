public class leftTriangle {
    public static void main(String[] args) {
        /*
        * 0...5 = -8,837
        * -2...3 = 3,7
        * -5...1 = 156,361
        * -10...10 = 22030*/
        double a = 0;
        double b = 5;
        double sum = 0;
        double step = 0.001;
        for(double i = a; i < b; i += step){
            sum += (getfunction(i) * step);
        }
        System.out.printf("Определенный интеграл равен %.5f",sum);
    }


    static double getfunction(double x){
        final double e = 2.718281;
        double func = Math.pow(e,x) - Math.pow(x,3);
        return func;
    }
}
