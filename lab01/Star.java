import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" "); // In khoang cach
            }
            for(int j = 1; j <= (2*i - 1); j++){
                System.out.print("*"); // In ra ki tu * tao thanh tam giac
            }
            System.out.println(""); // Xuong dong
        }
    }
}
