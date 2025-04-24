package pp2;

public class Student extends User{
    int rollno;
    public Student(String name,String status,int rollno){
        super(name, status);
        this.rollno=rollno;
    }

    @Override
    public void borrowbook(BookCopy copy) {
        super.borrowbook(copy);
    }

    @Override
    public void returnbook(BookCopy copy) {
        super.returnbook(copy);
    }
    public String toString() {
        return super.toString() + ", Roll No: " + rollno;
    }
}
