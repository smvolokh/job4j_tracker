package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[] {
                new Book("Clean code", 100),
                new Book("Book_A", 150),
                new Book("Book_B", 200),
                new Book("Test_Book", 500)
        };

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("Book " + book.getName() + " has " + book.getPages() + " pages.");
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("Book " + book.getName() + " has " + book.getPages() + " pages.");
        }
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println("Book " + book.getName() + " has " + book.getPages() + " pages.");
            }
        }
    }
}
