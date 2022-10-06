package Task3;

public class Customer {

//String initialization
    final private String firstName;
    final private String lastName;
    final private String userName;


    //Constructor
    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    //get and set for our strings
    public String getfirstName() {
        return firstName;
    }
    public String getlastName() {
        return lastName;
    }
    public String userName() {
        return userName;
    }


    public String toString() {
        return "name =" + firstName + lastName + "username =" + userName;
    }
}












