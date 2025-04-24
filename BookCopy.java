package pp2;
//composition class
public class BookCopy {
    Book book;
    int copyId;
    boolean isavailable=true;

    public BookCopy(Book book,int copyId){
        this.book=book;
        this.copyId=copyId;
    }
    public String toString(){
        return book.toString() + ", Copy ID: " + copyId + ", Available: " + isavailable;
    }
}
