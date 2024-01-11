package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDiscs = 0;
    // Cotructor tạo 1 video chỉ với đầu vào có title
    public DigitalVideoDisc() {
        //this.id = update();
    }
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        this.id = update();
    }
    // Contructor tạo 1 video với đầu vào category, title, cost
    public DigitalVideoDisc(String category,String title , float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = update();
    }
    // Contructor tạo 1 sản phẩm với ditector, category, title, cost
    public DigitalVideoDisc( String director, String category, String title, float cost) {
        super();
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.title = title;
        this.id = update();
    }
    // contructor tạo sản phẩm với đầu vào title, category, director, length, cost
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = update();
    }
    // getter để lấy ra thông tin của các thuộc tính có chỉ định truy cập là private
    public String getTitle() {return title;} // Lấy ra title

    public String getCategory() {return category;} // Lấy ra category

    public String getDirector() {return director;} // Lấy ra director

    public int getLength() {return length;} // Lấy ra lenght

    public float getCost() {return cost;} // Lấy ra cost
    public int getId() {return id;}
    public void setTitle(String title) {
        this.title = title;
    }

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
        if(this.title.equals(title)) return true;
        else return false;
    }
}
