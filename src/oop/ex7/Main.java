package oop.ex7;

public class Main {
    public static void main(String[] args) {
        Backpack backpack = new Backpack(100);
        Book book = new Book("carte1", 200, 50);
        Book book2 = new Book("carte2", 200, 30);
        Book book3 = new Book("carte3", 200, 40);
        backpack.addBook(book);
        backpack.addBook(book2);
        System.out.println(backpack.addBook(book3));
        backpack.printCurrentBooks();
        System.out.println(backpack.getTotalPages());

    }
}
