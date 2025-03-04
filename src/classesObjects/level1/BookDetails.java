package classesObjects.level1;

import java.util.Scanner;

class Book{
    String title;
    String author;
    int price;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " +author);
        System.out.println("Price: " + price);
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book bookdetails = new Book();

        System.out.println("Enter the name of the book:");
        bookdetails.title = sc.nextLine();
        System.out.println("Enter the author of the book:");
        bookdetails.author = sc.nextLine();
        System.out.println("Enter the price of the book:");
        bookdetails.price = sc.nextInt();
        bookdetails.display();


    }
}
