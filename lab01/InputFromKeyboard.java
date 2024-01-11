import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name: "); // in ra dong chu trong ngoac
        String strName = scanner.nextLine(); // Nhap vao du lieu
        System.out.println("How old are you ?");
        int iAge = scanner.nextInt();
        System.out.println("How tall are you ?");
        double dHeight = scanner.nextDouble();
        System.out.println("Mrs/Ms. " + strName + " iAge " + iAge +
                "years old. " + " Your height is " + dHeight + ".");
    }
}
