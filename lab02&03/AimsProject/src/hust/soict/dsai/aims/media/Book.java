package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book() {
        super();
    }

    public void addAuthor(String authorName) {
        for(String s: this.authors) {
            if(s == authorName) {
                System.out.println("The authors already exists");
                return;
            }
        }
        this.authors.add(authorName);
        System.out.println("The authors has beeen added");
    }

    public void removeAuthors(String authorName) {
        boolean k = false;
        for(String s:this.authors) {
            if(s == authorName) {
                k = true;
                break;
            }
        }
        if(k) {
            this.authors.remove(authorName);
        }
        else {
            System.out.println("The authors does not exist");
        }
    }
}
