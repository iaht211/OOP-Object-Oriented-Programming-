package hust.soict.dsai;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

import java.util.Scanner;

public class Aims {
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void addToCart(Scanner scanner, Cart anOrder, Store anStore) {
        System.out.println("Choose an item to add: \n1.Book\n2.CD\n3.DVD");

        int k = scanner.nextInt();
        switch (k) {
            case 1:
                addBookToCart(scanner, anOrder);
                break;
            case 2:
                addCDToCart(scanner, anOrder);
                break;
            case 3:
                addDVDToCart(scanner, anOrder);
                break;

            default:
                System.out.println("Not correct!");
        }
    }
    public static void addBookToCart(Scanner scanner, Cart anOrder) {
        scanner.nextLine();
        Media book = new Book();
        System.out.println("Book title: ");
        book.setTitle(scanner.nextLine());
        System.out.println("Book category: ");
        book.setCategory(scanner.nextLine());

        System.out.println("Book cost: " );
        book.setCost(scanner.nextFloat());
        scanner.nextLine();
        System.out.println("Book id: ");
        book.setId(scanner.nextInt());
        System.out.println("Book added");
        anOrder.addMedia(book);
    }
    public static void addDVDToCart(Scanner scanner, Cart anOrder) {
        scanner.nextLine();
        Media dvd = new DigitalVideoDisc();
        System.out.println("DVD title: ");
        dvd.setTitle(scanner.nextLine());
        System.out.println("DVD category: ");
        dvd.setCategory(scanner.nextLine());

        System.out.println("DVD cost: " );
        dvd.setCost(scanner.nextFloat());
        scanner.nextLine();
        System.out.println("DVD id: ");
        dvd.setId(scanner.nextInt());
        System.out.println("DVD added");
        anOrder.addMedia(dvd);
    }
    public static void addCDToCart(Scanner scanner, Cart anOrder) {
        scanner.nextLine();
        Media cd = new CompactDisc();

        System.out.println("DVD title: ");
        cd.setTitle(scanner.nextLine());

        System.out.println("DVD category: ");
        cd.setCategory(scanner.nextLine());

        System.out.println("DVD cost: " );
        cd.setCost(scanner.nextFloat());

        scanner.nextLine();

        System.out.println("DVD id: ");
        cd.setId(scanner.nextInt());

        System.out.println("DVD added");
        anOrder.addMedia(cd);
    }
    public static void playMedia(Scanner scanner, Cart anOrder, Store anStore) {
        System.out.println("Play");
    }

    public static void seeAMediaDetails(Scanner scanner, Cart anOrder, Store anStore) {
        System.out.println("“See a media’s details");
        System.out.println("Enter title: ");
        scanner.nextLine();
        String title = scanner.nextLine();

    }

    public static void filterMediaInCart(Scanner scanner, Cart anOrder) {
        System.out.println("Filter medias in cart");
        System.out.println("Filter \n1. Title\n2. Id");
        int k = scanner.nextInt();
        switch(k) {
            case 1:
                break;
            case 2:
                break;
            default:
                k = 0;
                break;
        }
    }
    public static void sortMediaInCart(Scanner scanner, Cart anOrder) {
        System.out.println("“Sort medias in cart");
        System.out.println("Sort \n1. Title\n2. Cost");
        int k = scanner.nextInt();
        switch(k) {
            case 1:
                break;
            case 2:
                break;
            default:
                k = 0;
                break;
        }
    }
    public static void removeMediaFromCart(Scanner scanner, Cart anOrder) {

    }

    public static void placeOrder() {
        System.out.println("Order success");
    }

    public static void menu(Scanner scanner, Cart anOrder, Store anStore) {
        int k = scanner.nextInt();
        switch (k) {
            case 0:
                System.out.println("Exit");
                break;
            case 1:
                anStore.printStore();
                storeMenu();
                menu_1(scanner, anOrder, anStore);
                break;
            case 2:
                break;
            case 3:
                cartMenu();
                menu_3(scanner, anOrder, anStore);
                break;
            default:
                k = 0;
                break;
        }
    }
    public static void menu_1(Scanner scanner, Cart anOrder, Store anStore) {
        int k = scanner.nextInt();
        switch(k) {
            case 0:
                showMenu();
                menu(scanner, anOrder, anStore);
                break;
            case 1:
                seeAMediaDetails(scanner, anOrder, anStore);
                mediaDetailsMenu();
                menu_2(scanner, anOrder, anStore);
                break;
            case 2:
                addToCart(scanner, anOrder, anStore);
                anOrder.printLength();
                break;
            case 3:
                playMedia(scanner, anOrder, anStore);
                break;
            case 4:
                anOrder.printCart();
                cartMenu();
                menu_3(scanner, anOrder, anStore);
                break;
            default:
                k = 0;
                break;

        }
    }
    public static void menu_2(Scanner scanner, Cart anOrder, Store anStore) {
        int k = scanner.nextInt();
        switch(k) {
            case 0:
                showMenu();
                menu_1(scanner, anOrder, anStore);
                break;
            case 1:
                addToCart(scanner, anOrder, anStore);
                anOrder.printLength();
                break;
            case 2:
                playMedia(scanner, anOrder, anStore);
                break;
            default:
                k = 0;
                break;

        }
    }
    public static void menu_3(Scanner scanner, Cart anOrder, Store anStore) {
        int k = scanner.nextInt();
        switch(k) {
            case 0:
                showMenu();
                menu(scanner, anOrder, anStore);
                break;
            case 1:
                filterMediaInCart(scanner, anOrder);
                break;
            case 2:
                sortMediaInCart(scanner, anOrder);
                break;
            case 3:
                    removeMediaFromCart(scanner, anOrder);
                break;
            case 4:
                playMedia(scanner, anOrder, anStore);
                break;
            case 5:
                placeOrder();
                break;
            default:
                k = 0;
                break;

        }
    }




    public static void main(String[] args) {
        showMenu();
        Cart anOrder = new Cart();
        Store anStore = new Store();
        Scanner scanner = new Scanner(System.in);
        menu(scanner, anOrder, anStore);
        scanner.close();
        
    }
}