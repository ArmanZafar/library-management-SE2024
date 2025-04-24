package pp2;

public class ReturnThread extends Thread{
    User user;
    BookCopy bookcopy;

    public ReturnThread(User user,BookCopy bookCopy){
        this.user=user;
        this.bookcopy=bookCopy;
    }
    public void run(){
        try{
            Thread.sleep(5000);
            user.returnbook(bookcopy);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }
}
