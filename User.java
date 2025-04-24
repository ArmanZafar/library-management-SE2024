package pp2;

import java.util.ArrayList;

public class User {
    String name;
    String status;
    ArrayList<BookCopy> borrowedbook;

    public User(String name,String status){
        this.name=name;
        this.status=status;
        this.borrowedbook=new ArrayList<>();
    }
    public void borrowbook(BookCopy copy){
        if(copy.isavailable){
            borrowedbook.add(copy);
            System.out.println(name+" borrowed the book "+copy.book.title);
            copy.isavailable=false;
            ReturnThread rt = new ReturnThread(this,copy);
            rt.start();
        }
        else{
            System.out.println("The book is not available");
        }
    }
    public void returnbook(BookCopy copy)
    {
        if(borrowedbook.remove(copy)){
        System.out.println(name+" returned the book "+copy.book.title);
        copy.isavailable=true;
    }
    else{
        System.out.println("Book was not borrowed by "+name);
    }
    }
    public String toString() {
        return "Name: " + name + ", Status: " + status;
    }
}
