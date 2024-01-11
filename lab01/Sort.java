import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int iN = scanner.nextInt();
        int Arr[] = new int[iN];

        for(int i = 0; i < iN; i++){
            Arr[i] = scanner.nextInt();
        }
        for(int i =0; i< iN; i++) {
            for(int j = 1; j < iN-i; j++ ) {
                if(Arr[j-1] > Arr[j]) {
                    int tmp = Arr[j-1];
                    Arr[j-1] = Arr[j];
                    Arr[j] = tmp;
                }
            }
        }
        System.out.println("Chuoi sau khi sap xep la:");
        for(int i=0; i< iN; i++) {
            System.out.print(Arr[i] + " ");
        }
    }
}
