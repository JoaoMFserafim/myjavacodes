import java.util.Scanner;

public class Book {
    String name;
    String author;
    int number_of_pages;
    double price;
    int identification;

    public Book(){
        this.name = "";
        this.author = "";
        this.number_of_pages = 0;
        this.price = 0.0;
        this.identification = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public void fill(){
        Scanner read = new Scanner(System.in);

        System.out.println("fill the data so book:");

        System.out.println("Name:");
        this.name = read.next();

        System.out.println("Author:");
        this.author = read.next();

        System.out.println("Number of pages:");
        this.number_of_pages = read.nextInt();

        System.out.println("Price:");
        this.price = read.nextDouble();

        System.out.println("Number of identification:");
        this.identification = read.nextInt();

        System.out.println("SUCCESS!!!"+"The data of book is filled");
    }


}
