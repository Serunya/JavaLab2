import java.util.Arrays;

public class sortMatrix {
    public static void main(String[] args) {
        int[] arr = {21,12,17,42,16,5,32,25,90};
        System.out.println("Матрица до сортировки:");
        inputArr(arr);
        Arrays.sort(arr);
        System.out.println("\nМатрица после сортировки:");
        inputArr(arr);
    }

    static void inputArr(int[] arr){
        for(int i = 0; i < 3;i++){
            for(int j = i * 3; j < 3 + i * 3;j++){
                System.out.printf("%4d ", arr[j]);
            }
            System.out.println();
        }
    }

}
