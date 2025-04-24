package pp2;

public class Book {
    String title;
    String author;
    int isbn;
    public Book(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public String toString(){
        return  "Book: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}
