package cannata;

/**
 * Created by Caroline on 2/13/2016.
 */
public class Customer extends Person {
    private String custNum;

    public Customer(){
        super();
        custNum = "";
    }

    public void setCustNum(String custNum){
        this.custNum = custNum;
    }
    public String getCustNum(){
        return custNum;
    }

    public String getDisplayText(){
        return super.toString() +  "\n"
                + "Customer number: " + getCustNum();
    }


}
