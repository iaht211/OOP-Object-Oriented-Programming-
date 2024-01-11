package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.util.Scanner;

public class Store {
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100];
    private int qtyOrdered = 0;
    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyOrdered < itemsInStore.length) {
            itemsInStore[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println("DVD added to the store: " + dvd.getTitle());
        } else {
            System.out.println("Store is full. Cannot add more DVDs.");
        }
    }

    public void removeDVD() {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        System.out.println("Title : ");
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInStore[i].getTitle().equals(title)) {
                System.out.println("DVD removed from the store: " + title);
                // Move the last DVD in the array to the removed position
                itemsInStore[i] = itemsInStore[qtyOrdered - 1];
                itemsInStore[qtyOrdered - 1] = null;
                qtyOrdered--;
                return;
            }
        }
        System.out.println("DVD not found in the store: " + title);
    }

}
