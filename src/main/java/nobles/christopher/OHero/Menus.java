package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class Menus {
    Display display = new Display();
    UserInput userInput = new UserInput();

    public void opening() {
        display.print(" So you want to be a hero." +
                "\n I won't try to convince you otherwise." +
                "\n This world could use a few more." +
                "\n But tell me something first..." +
                "\n What do you want to be called?");
        namePrompt();
        String name = userInput.prompt();
        display.print("So your name is " + name + " ?");
    }

    public void namePrompt() {
        display.print("ENTER NAME");
    }

}
