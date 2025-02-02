import java.util.Scanner;

class MainDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int[][] matrix = new int[n][n];
        int sum = 0; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}