package oop.ex7;

public class Book {

    String title;
    int numberOfPages;
    int weight;

    public Book(String title, int numberOfPages, int weight) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", weight=" + weight +
                '}';
    }
}
