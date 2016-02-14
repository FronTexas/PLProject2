package cannata;

public class PersonApp {

    public static void main(String[] args) {
        String continueChoice = "y";

        Person p;

        Console.displayLine("Welcome to the Person Tester application");
        Console.displayLine();

        while (continueChoice.equalsIgnoreCase("y")) {
            String personCreationChoice = Console.getString("Create customer or employee? (c/e): ").toLowerCase();

            // Re-prompts if an invalid answer is given
            Boolean validCreation = false;
            while (!validCreation){
                if (personCreationChoice.equals("c") || personCreationChoice.equals("e")){
                    validCreation = true;
                } else {
                    personCreationChoice = Console.getString("Please enter either (c/e): ").toLowerCase();
                }
            }

            if (personCreationChoice.equals("c")) {
                Customer c = new Customer();
                c.setFirstName(Console.getString("Enter first name: "));
                c.setLastName(Console.getString("Enter last name: "));
                c.setEmail(Console.getString("Enter email address: "));
                c.setCustNum(Console.getString("Customer number: "));
                p = c;
            } else {
                Employee e = new Employee();
                e.setFirstName(Console.getString("Enter first name: "));
                e.setLastName(Console.getString("Enter last name: "));
                e.setEmail(Console.getString("Enter email address: "));
                e.setSocialSecurityNum(Console.getString("Social security number: "));
                p = e;
            }

            print(p);

            continueChoice = Console.getString("Continue? (y/n): ").toLowerCase();
            Boolean validContinue = false;
            while(!validContinue){
                if (continueChoice.equals("y") || continueChoice.equals("n")){
                    validContinue = true;
                } else {
                    continueChoice = Console.getString("Please enter valid option. (y/n): ").toLowerCase();
                }
            }
        }
    }

    public static void print(Person p){
        Console.displayLine();
        Console.displayLine("You entered: \n" +
                                p.getDisplayText());
        Console.displayLine();
    }
}
