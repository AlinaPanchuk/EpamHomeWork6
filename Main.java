package com.epam.lesson6task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter the size of array : ");
        Books books = getBooks();
        System.out.println();

        System.out.println("All books: ");
        books.viewAllBooksInArray();

        System.out.print("Please enter the % you want to change the book's price: ");
        books.changePrice(inputDouble());
        books.viewAllBooksInArray();

        System.out.print("List of books with Autor - > ");
        books.findBooksOfSomeAuothor(inputString());

        System.out.println();
        System.out.print("List of books written after year - > ");
        books.findBookAfterSomeYear(inputInt());
    }

    private static Books getBooks() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        Books books = new Books(value);
        for (int i = 0; i < value; i++) {
            System.out.println("Please enter the following info Id, Title, Author, Publisher, Year, Page, Price ");
            Book book = new Book(inputInt(), inputString(), inputString(), inputString(), inputInt(), inputInt(), inputDouble());
            books.add(book);
            System.out.println();
        }
        return books;
    }

    private static double inputDouble() {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        return value;
    }

    private static String inputString() {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        return value;
    }

    private static int inputInt() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        return value;
    }


}
