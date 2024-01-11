import java.util.Scanner;

public class MonthYear {

    public static void main(String[] args) {
        String[] month_31 = {"January", "Jan", "Jan.", "1",
                "March", "Mar", "Mar.", "3",
                "May", "5",
                "July", "Jul", "Jul.", "7",
                "August", "Aug", "Aug.", "8",
                "October", "Oct", "Oct.", "10",
                "December", "Dec", "Dec.", "12"};
        String[] month_30 = {"April", "Apr", "Apr.", "4",
                "June", "Jun", "Jun.", "6",
                "September", "Sep", "Sep.", "9",
                "November", "Nov", "Nov.", "11"};
        String[] february = {"February", "Feb", "Feb.", "2"};
        Scanner scanner = new Scanner(System.in);

        int year;
        while(true) {
            System.out.println("Nhap vao nam: ");
            year = scanner.nextInt();
            if(year >= 0)	 break;
            else	 continue;
        }

        scanner.nextLine();
        String month;
        System.out.println("Nhap vao thang: ");
        month = scanner.nextLine();
        for(String i : month_31) {
            if(i.equals(month)) {
                System.out.println("Thang: " + month + " nam: " + year + " co 31 ngay!");
                System.exit(0);
            }
        }

        for(String i : month_30) {
            if(i.equals(month)) {
                System.out.println("Thang: " + month + " nam: " + year + " co 30 ngay!");
                System.exit(0);
            }
        }

        for(String i:february) {
            if(i.equals(month)) {
                if(year % 4 == 0 || year % 100 != 0) {
                    System.out.println("Thang 2 nam "+year+" co 29 ngay!");
                    System.exit(0);
                }
                else
                    System.out.println("Thang 2 nam "+year+" co 28 ngay!");
                System.exit(0);
            }
        }
        System.out.println("Thang nhap vao khong hop le!");
    }

}
