import java.util.Scanner;

public class Television {
    String mark;
    double size;
    String resolution;
    double price;

    public Television(){
        this.mark = "";
        this.size = 0.0;
        this.resolution = "";
        this.price = 0.0;
    }

    public Television(String mark, double size, String resolution, double price) {
        this.mark = mark;
        this.size = size;
        this.resolution = resolution;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void fill(){
        Scanner read = new Scanner(System.in);

        System.out.println("Mark:");
        this.mark = read.next();

        System.out.println("Size:");
        this.size = read.nextDouble();

        System.out.println("Resolution:");
        this.resolution = read.next();

        System.out.println("Price:");
        this.price = read.nextInt();
    }

    public void print_on_screen(){
        System.out.println("Mark:"+this.mark);
        System.out.println("Size:"+this.size);
        System.out.println("Resolution:"+this.resolution);
        System.out.println("Price:"+this.price);
    }
}
