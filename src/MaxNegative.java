public class MaxNegative {
    public static void main(String[] args) {
        int[][] mas = {{12,21},{42,12,12,44},{25,12},{41,-25}};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < mas.length;i++){
            for(int j = 0; j < mas[i].length;j++){
                if(mas[i][j] < 0 && mas[i][j] > max){
                    max = mas[i][j];
                }
            }
        }
        System.out.println("Максимальный отрицательный элемент = " + max);
    }

}
