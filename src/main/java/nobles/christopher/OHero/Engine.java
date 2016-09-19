package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class Engine {
    Menus menus = new Menus();
    Hero hero;
    HeroActions heroActions = new HeroActions();
    Display display = new Display();
    UserInput userInput = new UserInput();



    public void opening() {
        menus.opening();
    }


}
