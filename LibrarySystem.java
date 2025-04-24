package pp2;

public class LibrarySystem {
    public static void main(String[] args) {
        Library l1=new Library("CENTRAL LIBRARY");
        System.out.println("*******************************\n"+"\t"+l1.name);
        System.out.println("*******************************");
        Book b1=new Book("Treasure island","Robert Stevenson",1000);
        Book b2=new Book("Moby Dick","Herman Melville",2000);
        Student s1=new Student("Ali","UnderGraduate",8);

        l1.addBook(b1,2);

        l1.display();

        BookCopy copy=l1.searchbytitle("Treasure island").get(0);

        System.out.println(s1);
        s1.borrowbook(copy);

    }
}
