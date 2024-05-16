public class Book{
    //private attributes of the Book Class
    private int bookId; //stores identificaion of book
    private String title;//stores title of the book
    private String author;//stores author of book
    private boolean availability;//stores availability status of book

    //constructor to initialize a Book object
    public Book(int bookId, String title, String author)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availability= true;
    }

    //getter method to retrieve  the bookID
    public int getBookID(){
        return bookId;
    }
    //setter method to set the bookId
    public void setBookID(int bookId){
        this.bookId = bookId;
    }
    //getter method to retrive the book's title
    public String getTitle(){
        return title;
    }
    //setter method to set the book's title
    public void setTitle(String title){
        this.title = title;
    }
    //getter method to get the book's author
    public String getAuthor(){
        return author;
    }
    //setter method to set book's author
    public void setAuthor(String author){
        this.author = author;
    }
    //getter method to check if the book is available or not
    public boolean isAvailable(){
        return availability;
    }
    //sette method to set the availabilty status of the book 
    public void setAvailability(boolean availability){
        this.availability = availability;
    }

    //method to display informations of book
    public void displayInfo(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }
}