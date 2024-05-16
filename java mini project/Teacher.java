public class Teacher extends Member{
    private String subject; // Stores a  subject

    //constructor to initialize Teacher object, inheriting from Member
    public Teacher(int memberID, String name, String email, String subject){
        super(memberID, name, email);//calls the constructor of superclass (Member)
        this.subject = subject;
    }
    //getter and setter methods for subject
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

     //method to display information about teacher,overriding the displayInfo() method in Member   
    public void displayInfo(){
        super.displayInfo();//calls the displayInfo() method of superclass (Member)
        System.out.println("Subject: " + subject);//display the subject of teacher
    }
}