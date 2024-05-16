import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //create instance of Book, Student, Teacher and Borrow class
        Book book1 = new Book(3, "HTML", "Ujwal");

        Book book2 = new Book(90, "java", "Hari");

        Student student1 = new Student(36, "Timisena Chhetri", "Jungey.1@gmail.com", "Grade 12");

        Teacher teacher1 = new Teacher(6, "Govinda", "Govinda1@gmail.com", "Java");

        // Define borrow dates for the books
        LocalDate borrowDate1 = LocalDate.of(2023, 11, 17);
        LocalDate borrowDate2 = LocalDate.of(2023, 11, 5);

        // Create a Borrow instance for student1 borrowing book1 and set a return date
        Borrow borrow1 = new Borrow(37, student1, book1, borrowDate1);
        LocalDate returnDateforBorrow1 = LocalDate.of(2023, 11, 28);
        borrow1.setReturnDate(returnDateforBorrow1);

        // create a borrow instance for teacher1 borrowing book2
        Borrow borrow2 = new Borrow(40, teacher1, book2, borrowDate2);


        //displaying information using displayInfo() method
        book1.displayInfo();
        System.out.println(); //to add a blank line

        book2.displayInfo();
        System.out.println();

        student1.displayInfo();
        System.out.println();

        borrow1.displayInfo();
        System.out.println("Fine: $" + borrow1.calculateFine() );
        System.out.println( );

        teacher1.displayInfo();
        System.out.println ();
        
        borrow2.displayInfo();
        
        System.out.println( "Fine till today date: $" + borrow2.calculateFine() );
        //calculating fine 
        

    }
}
