package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    // Cotructor tạo 1 video chỉ với đầu vào có title
    public DigitalVideoDisc() {
        //this.id = update();
        super();
    }

    public DigitalVideoDisc(String title) {
        super(title);
        this.id = update();
    }
    // Contructor tạo 1 video với đầu vào category, title, cost
    public DigitalVideoDisc(String title,String category , float cost) {
        super(title, category, cost);
        this.id = update();
    }
    // Contructor tạo 1 sản phẩm với title, category, director, cost, lenght
    public DigitalVideoDisc( String title, String category, String director, int length, float cost) {
        super(length, director, title, category, cost);
        this.id = update();
    }
    public DigitalVideoDisc(String director, int length) {
        super(director, length);
    }
    // getter để lấy ra thông tin của các thuộc tính có chỉ định truy cập là private


    private int update(){
        nbDigitalVideoDiscs ++;
        return nbDigitalVideoDiscs;
    }
    public String toString() {
        return this.getTitle() + " - " + this.getCategory() +
                " - " + this.getDirector() +" - "+ this.getLength() +
                " : " + this.getCost() + " $\n";
    }

    public boolean isMatch(String title) {
        if(this.getTitle().equals(title)) return true;
        else return false;
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());

        System.out.println("DVD length: " + this.getLength());
    }

}
