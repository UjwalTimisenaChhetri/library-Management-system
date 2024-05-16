public class Student extends Member {

    private String gradeLevel; //stores the gradelevel of student

    //constructor to initialize a student object, inheriting from member
    public Student(int memberID, String name, String email, String gradeLevel){
        super(memberID, name, email);//calls the constructor of the superclass(Member)
        this.gradeLevel= gradeLevel;//assigns the provided grade level
    }

    //getter and setter methods for grade level
    public String getGradeLevel(){
        return gradeLevel;
    }
    public void setGradeLevel(String gradeLevel){
        this.gradeLevel = gradeLevel;
    }
    //method to display information about student,overriding the displayInfo() method in Member
    public void displayInfo(){
        super.displayInfo();//calls the displayInfo() method of superclass (Member)
        System.out.println("GradeLevel: " + gradeLevel);//display the grade level of student
    }
    
}
