import javax.swing.*;
public class HelloNameDialog {
    public static void main(String[] args){

        String result;
        // hiện ra khung để nhập thông tin và lưu vào chuỗi result
        result = JOptionPane.showInputDialog
                ("Nguyen Van Thai 20215135 -" + " Please enter your name:");
        // hiện khung thông báo
        JOptionPane.showMessageDialog(null,
                "Toi la Nguyen Van Thai 20215135. Hi " + result + " !");

        System.exit(0);

    }
}
