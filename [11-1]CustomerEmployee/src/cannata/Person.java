package cannata;

/**
 * Created by Caroline on 2/13/2016.
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private String email;

    public Person(){
        firstName = "";
        lastName = "";
        email = "";
    }

    // get & set methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    // String representation of Person object
    @Override
    public String toString(){
        return "Name: " + getFirstName() + " " + getLastName() + "\n"
                + "Email: " + getEmail();
    }

    public abstract String getDisplayText();




}
