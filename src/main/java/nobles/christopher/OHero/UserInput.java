package nobles.christopher.OHero;
import java.util.Scanner;

/**
 * Created by christophernobles on 9/19/16.
 */
public class UserInput {
    Scanner userInput1 = new Scanner(System.in);

    public String prompt(){
        String output = userInput1.next();
        return output;
    }

    public int promptInt() {
        int output = userInput1.nextInt();
        return output;
    }

    public double promptDouble() {
        double output = userInput1.nextDouble();
        return output;
    }




}
