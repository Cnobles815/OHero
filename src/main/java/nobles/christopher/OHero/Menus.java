package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class Menus {
    Display display = new Display();
    UserInput userInput = new UserInput();
    MenuLogic menuLogic = new MenuLogic();

    public void opening() {
        display.print(" Let me assure you that I am not happy to see you." +
                "\n You look like too little too late, to me." +
                "\n But what good has reserve, at the end of things?" +
                "\n Introduce yourself.");
        namePrompt();
        MenuLogic.Name heroName = MenuLogic.Name.valueOf(userInput.prompt().toUpperCase());
        display.print("So your name is " + heroName + " ?");

        menuLogic.nameSwitch(heroName);
    }

    public void namePrompt() {
        display.print("ENTER NAME");
    }

}
