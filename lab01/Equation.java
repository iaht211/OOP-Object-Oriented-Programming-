import javax.swing.*;

public class Equation {

    public static void firstDegree() {
        String strNum1, strNum2;
        double a, b;
        String strNotification = "Nghiem cua phuong tring ";

        // Khung hien thi nhap vao chuoi so
        strNum1 = JOptionPane.showInputDialog(null, "Please input first num: ",
                "Please input first num", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input second num: ",
                "Please input second num", JOptionPane.INFORMATION_MESSAGE);

        // Chuyen so tu String thanh double
        a = Double.parseDouble(strNum1);
        b = Double.parseDouble(strNum2);
        // nghiemcua phuong trinh
        if(a != 0){
            double x = -1 * (b / a);
            strNotification += a + " x + " + b + " = 0 la : x = " + x;
            JOptionPane.showMessageDialog(null, strNotification);
        }
        else
            JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem !");


        System.exit(0);
    }

    public static void secondDegree() {
        String strNum1, strNum2, strNum3;
        double a, b, c;
        double x;
        String strNotification;

        strNum1 = JOptionPane.showInputDialog(null, "Please input number a: ",
                "Please input number a", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input number b: ",
                "Please input number a", JOptionPane.INFORMATION_MESSAGE);
        strNum3 = JOptionPane.showInputDialog(null, "Please input number c: ",
                "Please input number a", JOptionPane.INFORMATION_MESSAGE);
        // Chuyen doi cac chuoi vua nhap sang Double
        a = Double.parseDouble(strNum1);
        b = Double.parseDouble(strNum2);
        c = Double.parseDouble(strNum3);

        // xet cac truong hop cua a,b,c tu do tim ra nghiem 
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    strNotification = "Phuong trinh vo so nghiem!";
                    JOptionPane.showMessageDialog(null, strNotification);
                }
                else {
                    strNotification = "Phuong trinh vo nghiem!";
                    JOptionPane.showMessageDialog(null, strNotification);
                }
            }
            else{
                x = -1 * (b/a);
                strNotification = "Phuong trinh co nghiem: x = " + x;
                JOptionPane.showMessageDialog(null, strNotification);
            }
        }
        else{
            double delta = (b * b) - (4 * a * c);
            if(delta == 0){
                x = -1 * (b / 2*a);
                strNotification = "Phuong trinh co nghiem kep: x = " + x;
                JOptionPane.showMessageDialog(null, strNotification);
            } else if (delta < 0) {
                strNotification = "Phuong trinh vo nghiem!";
                JOptionPane.showMessageDialog(null, strNotification);
            }
            else {
                strNotification = "Phuong trinh co 2 nghiem: " +
                        (Math.sqrt(-1*b + delta)/(4*a) + " and " + Math.sqrt(-1*b - delta)/(4*a));
                JOptionPane.showMessageDialog(null, strNotification);
            }
        }
    }

    public static void linearSystem() {
        String strNum1, strNum2, strNum3, strNum4, strNum5, strNum6;
        String strNotification;
        // Nhap vao dau vao cho cac bien can thiet
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number : ",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number : ",
                "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNum3 = JOptionPane.showInputDialog(null, "Please input the third number : ",
                "Input the third number", JOptionPane.INFORMATION_MESSAGE);
        strNum4 = JOptionPane.showInputDialog(null, "Please input the forth number : ",
                "Input the forth number", JOptionPane.INFORMATION_MESSAGE);
        strNum5 = JOptionPane.showInputDialog(null, "Please input the fifth number : ",
                "Input the fifth number", JOptionPane.INFORMATION_MESSAGE);
        strNum6 = JOptionPane.showInputDialog(null, "Please input the sixth number : ",
                "Input the sixth number", JOptionPane.INFORMATION_MESSAGE);
        // Chuyen doi cac chuoi thanh kieu Double
        double a11 = Double.parseDouble(strNum1);
        double a12 = Double.parseDouble(strNum2);
        double a21 = Double.parseDouble(strNum3);
        double a22 = Double.parseDouble(strNum4);
        double b1 = Double.parseDouble(strNum5);
        double b2 = Double.parseDouble(strNum6);
        // Tinh toan nghiem cua he phuong trinh
        double D = Math.abs(a11*a22 - a12 * a21);
        double D1 = Math.abs(b1*a22 - b1*a12);
        double D2 = Math.abs(b2*a11 - a22*b1);
        double x = D1 / D;
        double y = D2 / D;
        // Hien thi ra nghiem cua he phuong trinh
        strNotification = "Nghiem cua he phuong trinh la : (x, y) = " + x + ", " + y;
        JOptionPane.showMessageDialog(null, strNotification);


    }

    public static void main(String[] args) {

    }
}