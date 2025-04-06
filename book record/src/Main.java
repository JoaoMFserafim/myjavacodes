import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int menu(){
        Scanner read = new Scanner(System.in);

        int option_number;

        System.out.println("---record book system---");
        System.out.println("---insert book 1---");
        System.out.println("---remove book 2---");
        System.out.println("---search book per author 3---");
        System.out.println("---close 0---");
        System.out.println("Option : ");
        option_number = read.nextInt();

        return option_number;
    }

    public void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Book> listOfBooks= new ArrayList<>();
        int numOfSwitch;

        numOfSwitch = menu();

        switch (numOfSwitch){
            case 1:// insert book
                System.out.println("Add a new book to the record system");

                Book bookForAdd = new Book();

                bookForAdd.fill();

                listOfBooks.add(bookForAdd);
                break;
            case 2://remove book with name of book
                System.out.println("Remove the book with the name of then");

                Book bookForRemove = new Book();

                System.out.println("Insert the name of book:");
                bookForRemove.name = read.next();

                for (int i = 0; i <= listOfBooks.size(); i++){
                    Book a = listOfBooks.get(i);
                    if (bookForRemove.equals(a.name)){
                        System.out.println("the book is been founded ");
                        listOfBooks.remove(bookForRemove);
                        System.out.println("the book has been removed");
                    }else {
                        System.out.println("the book inst been found");
                    }
                }

                break;
            case 3:
                System.out.println("Search on the archives the books with authors per parameters");

                Book book_searched = new Book();

                System.out.println("Insert the name of author:");
                book_searched.author = read.next();

                for (int i =0;i <= listOfBooks.size(); i++){
                    Book b = listOfBooks.get(i);
                    if(b.name.equals(book_searched.name)){
                        List<Book> listStorage = new ArrayList<>();
                        listStorage.add(b);
                        int total_books_founded = 0;
                        total_books_founded++;

                        System.out.println("Books founded: " + total_books_founded);
                        listStorage.toArray();
                    }
                }


                break;
            case 0:
                System.out.println("CLOSED");
                break;
            default:
        }



    }
}