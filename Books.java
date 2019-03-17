package com.epam.lesson6task1;

public class Books {
    private Book[] books;
    private int size;
    private int index = 0;

    public Books(int size) {
        this.size = size;
        books = new Book[size];
    }

    public void add(Book book) {
        if (index < books.length) {
            books[index] = book;
            System.out.println("Book " + book.getTitle() + " was added ");
            index++;
        } else {
            System.out.println("There are no book");
        }
    }

    public void viewAllBooksInArray() {
        for (int i = 0; i < books.length; i++) {
            books[i].view();
        }
        System.out.println();
    }

    public void changePrice(double percentage) {
        double STO = 100;
        for (int i = 0; i < books.length; i++) {
            double price = books[i].getPrice();
            price = price + (price / STO * percentage);
            books[i].setPrice(price);
        }
    }

    public void findBooksOfSomeAuothor(String author) {
        for (int i = 0; i < books.length; i++) {
            if (author.equals(books[i].getAuthor())) {
                books[i].view();
            }
        }
    }

    public void findBookAfterSomeYear(int year) {
        for (int i = 0; i < books.length; i++) {
            if (year < (books[i].getYear())) {
                books[i].view();
            }
        }
    }
}
