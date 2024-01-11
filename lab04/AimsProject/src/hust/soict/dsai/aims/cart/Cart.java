package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.util.Scanner;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; // Giá trị tối đa của mảng
    private int qtyOrdered = 0; // Thuộc tính để đếm số lưởng sản phẩm có trong cart
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; // Mảng tối đa 20 phần tử
    public int cnt = itemsOrdered.length;
    // hàm thể sản phẩm với vào giỏ hàng
    // đầu tiên thực hiện kiểm tra giỏi hàng xem đã đầy chưa nếu đầy rồi thì in ra thông báo
    // Nếu chưa đầy thì thực hiện thêm sản phẩm vào mảng và in ra thông báo đã thêm thành công
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered>=20) {
            System.out.println("The cart is almost full");
        }
        else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }

    }
    // hàm tính tổng tiền của sản phẩm có trong giỏ hàng
    public float totalCost() {
        float sum = 0;
        for(int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
    // Hàm xóa sản phẩm khỏi giỏ hàng bằng title
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].getTitle() == disc.getTitle()) {
                for(int j = i; j < qtyOrdered; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered--;
                System.out.println("The items have been remove!!!!");
            }
        }
    }

    //2.1 Overloading by differing types of parameter
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        int size = dvdList.length;
        for(int i = 0; i < size; i++) {
            itemsOrdered[qtyOrdered + i] = dvdList[i];
            qtyOrdered++;
        }
        System.out.println(qtyOrdered);
    }
    // 2.2. Overloading by differing the number of parameters
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
        System.out.println(qtyOrdered);
    }
    public void printCart() {
        System.out.println("**************CART************");
        for(int i = 0; i < qtyOrdered; i++) {
            System.out.print(itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost());
    }
    // Search by id
    public void searchID() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("nhap vao id muon tim: ");
        int id = scanner.nextInt();
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].getId() == id) {
                System.out.println("ID: " + id + itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("Khong tim thay san phan co id :" + id);
    }

    // Search by title
    public void searchTitle() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("nhap vao title muon tim: ");
        String title = scanner.nextLine();
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].isMatch(title)) {
                System.out.println("title: " + title + itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("Khong tim thay san phan co id :" + title);
    }
}
