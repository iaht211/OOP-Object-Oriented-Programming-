package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        //  Tạo các đối tượng thông qua các contructor khác nhau với đầu và khác nhau
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Ficton", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // Tính tổng giá tiền sản phẩm có trong cart
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // tạo thử 1 video mới giống với video 3 và thử hàm xóa video đã được tạo
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.removeDigitalVideoDisc(dvd4);
        System.out.println(anOrder.cnt);

        DigitalVideoDisc itemsOrdered1[] = {dvd1, dvd3};
        anOrder.addDigitalVideoDisc(itemsOrdered1);

        anOrder.addDigitalVideoDisc(dvd1, dvd2);
        
    }
}