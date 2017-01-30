package nobles.christopher.OHero.io;

import nobles.christopher.OHero.app.MenuLogic;

import java.util.Scanner;

/**
 * Created by christophernobles on 9/19/16.
 */
public abstract class UserInput {
    static Scanner  userInput1 = new Scanner(System.in);
    MenuLogic menuLogic = new MenuLogic();

    public static String prompt() {
        String output = userInput1.next();
        return output;
    }

    public static int promptInt() {
        int output = userInput1.nextInt();
        return output;
    }

    public static double promptDouble() {
        double output = userInput1.nextDouble();
        return output;
    }

    public static MenuLogic.Name promptName() {

        MenuLogic.Name output = MenuLogic.Name.valueOf(userInput1.next().toUpperCase());
        return output;
    }


}
