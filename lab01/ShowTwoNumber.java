import javax.swing.*;

public class ShowTwoNumber{
    public static void main(String[] args) {
        // khai báo
        String strNum1, strNum2;
        String strNotification = "Nguyen Van Thai - 20215135 - You've just entered ";

        // Hiển thị ra khung điền số thứ 1
        strNum1 = JOptionPane.showInputDialog(null, "Nguyen Van Thai - 20215135 - Please input the first number: ",
                "Nguyen Van Thai - 20215135 - Please input the first number ", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        // hiển thị ra khung điền số thứ 2
        strNum2 = JOptionPane.showInputDialog(null, "Nguyen Van Thai - 20215135 - Please input the second number: ",
                "Nguyen Van Thai - 20215135 - Please input the second number ", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        // hiển thị ra khung hiện ra 2 số vừa nhập
        JOptionPane.showMessageDialog(null, strNotification,
                    "Nguyen Van Thai - 20215135 - Show two number: ", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

}