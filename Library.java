package pp2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;

    ArrayList<BookCopy> copies;

    public Library(String name){
        this.name=name;
        this.copies=new ArrayList<>();
    }
    public void addBook(Book book,int noofcopies){
        for(int i=0; i<noofcopies; i++){
            BookCopy copy=new BookCopy(book,i+1);
            copies.add(copy);
        }
    }
    List<BookCopy> searchbytitle(String title){
        List<BookCopy> results =new ArrayList<>();
        for(BookCopy copy:copies){
            if(copy.book.title.equalsIgnoreCase(title)){
                results.add(copy);
            }
        }
        return results;
    }
    public void display() {
        System.out.println("AVAILABLE BOOKS:");
        for (BookCopy copy : copies) {
            if (copy.isavailable) {
                System.out.println(copy);
            }
        }
    }


}
