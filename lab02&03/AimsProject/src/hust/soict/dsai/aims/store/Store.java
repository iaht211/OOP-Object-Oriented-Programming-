package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public static final int MAX_NUMBERS_DVD = 100;
    public void addMedia(Media media) {
        int size = itemsInStore.size();
        if(size != 100) {
            itemsInStore.add(media);
            System.out.println("The media have been added!");
        }
        else {
            System.out.println("The store is almost full");
        }
    }

    public void removeMedia(Media media) {
        for(Media m: itemsInStore) {
            if(m.getTitle() == media.getTitle()) {
                itemsInStore.remove(media);
                System.out.println("The disc has been removed");
            }
        }
    }
    public boolean search(int id) {
        for(Media m: itemsInStore) {
            if(m.getId() == id) {
                return true;
            }
        }
        return false;
    }
    // Search by Title
    public boolean search(String title) {
        for(Media m: itemsInStore) {
            if(m.getTitle() == title) {
                return true;
            }
        }
        return false;
    }
    public void printStore() {
        System.out.println("***********************STORE***********************");
        int i = 1;
        for(Media m: itemsInStore) {
            System.out.println((i) + ".DVD - " + m.getTitle() + " - " +
                    m.getCategory() + " - " +
                    m.getTitle() + " - " +
                    m.getCost());
            i++;
        }
    }
}
