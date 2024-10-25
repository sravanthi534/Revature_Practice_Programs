import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int m2 = sc.nextInt(); 
        int p = sc.nextInt();
        int[][] B = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        int[][] result = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                result[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
