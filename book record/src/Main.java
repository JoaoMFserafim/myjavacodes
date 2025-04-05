import java.util.Scanner;

public class Main {

    public int menu(){
        Scanner read = new Scanner(System.in);

        int option_number;

        System.out.println("---record book system---");
        System.out.println("---insert book 1---");
        System.out.println("---remove book 2---");
        System.out.println("---search book per author 3---");
        System.out.println("close");
        System.out.println("Option : ");
        option_number = read.nextInt();

        return option_number;
    }
    public static void main(String[] args) {


    }
}