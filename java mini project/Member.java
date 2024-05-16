public class Member {
    private int memberID;//stores the identification number of member
    private String name;//stores the name
    private String email;//stores the email
    //constructor to initialize a member object
    public Member(int memberID, String name, String email){
        this.memberID = memberID;
        this.name = name;
        this.email = email;
    }

    //getter and setter for member's ID
    public int getMemberID(){
        return memberID;
    }
    public void setMemberID(int memberID){
        this.memberID = memberID;
    }

    //getters and setter methods for name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //getter and setter methods for email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    //method to display information about the member
    public void displayInfo(){
        System.out.println("MemberID: " + memberID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
