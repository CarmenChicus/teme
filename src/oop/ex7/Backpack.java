package oop.ex7;

public class Backpack {

    final int maxWeight;

    int currentWeight;

    Book[] books;

    int numberOfBooks;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.books = new Book[30];
        this.numberOfBooks = 0;
    }

    public boolean addBook(Book book){

        //verific daca adaugarea cartii nu depaseste greutate maxima
        if (currentWeight + book.weight > maxWeight){
            return false;
        }
        books[numberOfBooks++]= book;
        currentWeight += book.weight;
        return true;

    }

    public int getTotalPages(){
        int sum = 0;
        for (int i = 0; i < numberOfBooks; i++){
            sum+= books[i].numberOfPages;
        }
        return sum;
    }

    public void printCurrentBooks(){
        for (int i = 0; i< numberOfBooks; i++){
            System.out.println(books[i]);
        }
    }

}
