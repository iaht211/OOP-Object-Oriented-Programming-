import java.util.Scanner;

public class Matrix {
    // Ham de in ra ma tran
    public static void show(int[][] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Nhap vao so hang so cot
        System.out.println("Nhap vao so hang: ");
        int n = scanner.nextInt();
        System.out.println("Nhap vao so cot: ");
        int m = scanner.nextInt();
        // Khai bao ma tran
        int[][] arr_1 = new int[n][m];
        int[][] arr_2 = new int[n][m];
        int[][] sum = new int[n][m];
        // Nhap vao ma tran
        System.out.println("Nhap vao ma tran 1: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr_1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhap vao ma tran 2: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr_2[i][j] = scanner.nextInt();
            }
        }
        // Tinh tong 2 ma tran
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum[i][j] = arr_1[i][j] + arr_2[i][j];
            }
        }

        // In ra ma tran
        System.out.println("Ma tran 1: ");
        show(arr_1);
        System.out.println("Ma tran 2: ");
        show(arr_2);
        System.out.println("Ma tran tong: ");
        show(sum);

    }
}
