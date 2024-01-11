package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public CompactDisc() {
        super();
    }
    public void addTrack(Track track) {
        for(Track t:tracks) {
            if(t.getTitle().equals(track.getTitle())) {
                System.out.println("The track already exists");
                return;
            }
        }
        System.out.println("The track has been added");
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        boolean k = false;
        for(Track t:tracks) {
            if(t.equals(track)) {
                k = true;
                break;
            }
        }
        if(k) {
            System.out.println("The track have been removed!");
        }
        else
            System.out.println("The track not exists");
    }
    public int getLength() {
        int total = 0;
        for(Track t:tracks) {
            total += t.getLength();
        }
        return total;
    }
    public void play() {
        Scanner scanner = new Scanner(System.in);
        if(this.getLength() <= 0) {
            System.out.println("ERROR: CDlength is 0");
            scanner.close();
            return;
        }
        System.out.println("List Track: ");
        int i = 1;
        for(Track t:tracks) {
            System.out.println(i+t.getTitle());
            i++;
        }
        System.out.println();
        System.out.println("Chosse the Track: ");
        int k = scanner.nextInt();
        if(k < (i-1)) {
            System.out.println("Playing CD: " + tracks.get(k-1).getTitle());
            System.out.println("CD length: " + tracks.get(k-1).getLength());
        }
        else {
            System.out.println("Does not exists. Please re-enter");
            k = scanner.nextInt();
        }
        System.out.println();
    }
}
