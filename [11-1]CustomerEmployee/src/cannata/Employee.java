package cannata;

/**
 * Created by Caroline on 2/13/2016.
 */
public class Employee extends Person {
    private String socialSecurityNum;

    public Employee(){
        super();
        socialSecurityNum = "";
    }

    public void setSocialSecurityNum(String s){
        socialSecurityNum = s;
    }
    public String getSocialSecurityNum(){
        return socialSecurityNum;
    }

    public String getDisplayText(){
        return super.toString() + "\n"
                + "Social security number: " + getSocialSecurityNum();
    }
}
