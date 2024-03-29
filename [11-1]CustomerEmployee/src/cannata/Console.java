package cannata;
import java.util.Scanner;
/**
 * Created by Caroline on 2/13/2016.
 */
public class Console {
    private static Scanner sc = new Scanner(System.in);

    public static void displayLine(){
        System.out.println();
    }

    public static void displayLine(String s){
        System.out.println(s);
    }

    public static void displaySingleLine(String s){
        System.out.print(s);
    }

    public static String getString(String prompt){
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }

    public static int getInt(String prompt){
        int i = 0;
        while (true){
            System.out.print(prompt);
            try {
                i = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e){
                System.out.println("Error! Invalid integer. Try again.");
            }
        }
        return i;
    }

    public static double getDouble(String prompt){
        double d = 0;
        while (true){
            System.out.print(prompt);
            try {
                d = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid decimal. Try again.");
            }
        }
        return d;
    }
}
