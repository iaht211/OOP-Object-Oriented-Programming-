import javax.swing.*;

public class CaculateTwoNum {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;

        // Khung nhập số thứ nhất ở dạng String vào
        strNum1 = JOptionPane.showInputDialog(null, "Please input first number: ",
                "Please input first number", JOptionPane.INFORMATION_MESSAGE);
        // Chuyển số thứ nhất từ String sang double
        num1 = Double.parseDouble(strNum1);

        // Khung nhập số thứ 2 ở dạng String vào
        strNum2 = JOptionPane.showInputDialog(null, "Please input first number: ",
                "Please input first number", JOptionPane.INFORMATION_MESSAGE);
        // Chuyển số thứ 2 từ String sang double
        num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double pro = num1 * num2;
        double quo = num1 / num2;

        // Tính tổng 2 số
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + sum,
                "Sum of two number", JOptionPane.INFORMATION_MESSAGE);

        // Tính hiệu 2 số
        JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + diff,
                "Different of two number", JOptionPane.INFORMATION_MESSAGE);

        // Tính tích 2 số
        JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + pro,
                "Product of two number", JOptionPane.INFORMATION_MESSAGE);

        // Tính thương 2 số
        JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + quo,
                "Quotient of two number", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
