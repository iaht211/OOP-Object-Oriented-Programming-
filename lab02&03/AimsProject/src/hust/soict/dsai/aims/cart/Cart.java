package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();


    public void addMedia(Media media) {
        int size = itemsOrdered.size();
        if(size <= 20) {
            itemsOrdered.add(media);
            System.out.println("The media hava been added");
        }
        else {
            System.out.println("The cart have full");
        }
    }
    public boolean removeMedia(Media media) {
        for (Media m : itemsOrdered) {
            if(m.equals(media.getId())) {
                return true;
            }
        }
        return false;
    }

    public float totalCost() {
        float total = 0;
        for(Media m:itemsOrdered) {
            total += m.getCost();
        }
        return total;
    }
    public void printCart() {
        System.out.println("**************CART************");
        int i = 1;
        for(Media m:itemsOrdered) {
            System.out.println(i + ".DVD - " + m.getTitle() + " - " +
                    m.getCategory() + " - " +
                    m.getTitle() + " - " +
                    m.getCost());
            i++;
        }
        System.out.println("Total cost: " + totalCost());

    }
    // Search by id
    public boolean search(int id) {
        for(Media m: itemsOrdered) {
            if(m.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Search by title
    public boolean search(String title) {
        for(Media m: itemsOrdered) {
            if(m.getTitle() == title) {
                return true;
            }
        }
        return false;
    }
    public void printLength() {
        System.out.println(itemsOrdered.size());
    }
}
