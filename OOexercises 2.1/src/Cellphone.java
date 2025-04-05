import java.util.Scanner;

public class Cellphone {
    private String mark;
    private String model;
    double price;
    int size;


    public Cellphone(){
        this.mark = "";
        this.model = "";
        this.price = 0.0;
        this.size = 0;
    }

    public Cellphone(String mark, String model, double price, int size) {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public String getMark(){
        return mark;
    }

    public String getModel(){
        return model;
    }

    public int getSize() {
        return size;
    }

    public void fill(){
        Scanner read = new Scanner(System.in);

        System.out.println("whats the mark of cellphone? ");
        this.mark = read.next();

        System.out.println("Whats the model?");
        this.model = read.next();

        System.out.println("Whats the size of storage");
        this.size = read.nextInt();

        System.out.println("What's the price?");
        this.price = read.nextDouble();
    }

    public void print(){
        System.out.println("Mark:" + this.mark);
        System.out.println("Model:" + this.model);
        System.out.println("Size:" + this.size);
        System.out.println("Price:" + this.price);
    }
}
