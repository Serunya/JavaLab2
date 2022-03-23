public class NumberS {
    public static void main(String[] args) {
        String NewNumberic = "";
        int Number = 100;
        int Numeric = 3;
        System.out.println("Число переведенное с помошью класса = " + Integer.toString(Number,Numeric));
        while(Number >= Numeric){
            NewNumberic += Number % Numeric;
            Number = Number / Numeric;
        }
        NewNumberic += Number;
        NewNumberic = new StringBuilder(NewNumberic).reverse().toString();
        System.out.println("Число переведенное через алгоритм = "+ NewNumberic);

    }
}
