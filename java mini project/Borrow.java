import java.time.LocalDate;

public class Borrow {
    //private attributes of Borrow class
    private int borrowID; //stores borrow id
    private Member member;// borrower information
    private Book book;// borrowed book information
    private LocalDate borrowDate; // book borrowed date
    private LocalDate returnDate; // book returned date

    public Borrow(int borrowID, Member member, Book book, LocalDate borrowDate){
        this.borrowID = borrowID;
        this.member = member;
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = null; //assuming initially book is not returned
    }
    //getter and setter methods for borrowId
    public int getBorrowID(){
        return borrowID;
    }
    public void setBorrowID(int borrowID){
        this.borrowID = borrowID;
    }
    
    //getter and setter methods for member
    public Member getMember(){
        return member;
    }
    public void setMember(Member member){
        this.member = member;
    }

    //getter and setter method for book
    public Book getBook(){
        return book;
    }
    public void setBook(Book book){
        this.book = book;
    }
    //getter and setter for borrowDate
    public LocalDate getBorrowdate(){
        return borrowDate;
    }
    public void setBorrowdate(LocalDate borrowDate){
        this.borrowDate = borrowDate;
    }
    //getter and setter for returdates
    public LocalDate getReturnDate(){
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate){
        this.returnDate= returnDate;
    }
    //calculating fine assuming 7 days after borrow date
    public double calculateFine(){
        if (returnDate==null){
            LocalDate today = LocalDate.now();
            LocalDate dueDate = borrowDate.plusDays(7);
            if (today.isAfter(dueDate)){
                long daysLate = today.toEpochDay() - dueDate.toEpochDay();
                return daysLate * 1; //assuiming fine a dollar per day
            }
        }
        //if return is not null
        else if(returnDate!= null){ 
            long daylate = returnDate.toEpochDay() - borrowDate.toEpochDay();
            return daylate*1;
        }
        return 0;
    }
    //method to display information aboout the borrow
    public void displayInfo() {
        System.out.println("Borrow Id: " +borrowID);
        System.out.println("Borrower information: ");
        member.displayInfo(); //display member information
        System.out.println("Borrow Date: " +  borrowDate);
        if (returnDate != null) {
            System.out.println("Return Date: " + returnDate);
            
        }
        else{
            System.out.println("Book Not Return Yet");
        }
    }
}
