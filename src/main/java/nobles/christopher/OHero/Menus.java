package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class Menus {
    Display display = new Display();

    public void opening() {
        display.print("So you want to be a hero." +
                "\n I won't try to convince you otherwise." +
                "\n This world could use a few more." +
                "\n But tell me something first..." +
                "\n What do you want to be called?");

    }

    public void namePrompt() {
        display.print("ENTER NAME");

    }
}
