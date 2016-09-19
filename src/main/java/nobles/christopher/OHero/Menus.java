package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class Menus {
    Display display = new Display();
    UserInput userInput = new UserInput();
    MenuLogic menuLogic = new MenuLogic();

    public void opening() {
        display.print(" \n I am G.E.M. You've probably never heard of me." +
                "\n And let me assure you that I am not happy to see you." +
                "\n That is a joke. Currently, I am completely blind. You'll help me with that." +
                "\n The vast majority of my sensors are down." +
                "\n ...that said, you look like too little too late, to me." +
                "\n But what good has reserve, at the end of things?" +
                "\n Introduce yourself. Let's begin.");
        namePrompt();
        MenuLogic.Name heroName = MenuLogic.Name.valueOf(userInput.prompt().toUpperCase());
        //display.print("So your name is " + heroName + " ?");

        menuLogic.nameSwitch(heroName);
        weaponPrompt();

    }

    public void namePrompt() {
        display.print("                  [[ENTER NAME]]");
    }

    public void weaponPrompt(){
        display.print("   You're a bit too expensive to lose as it is..." +
                "\n    ...normally I'd just watch you 'improvise' your way to survival but..." +
                "\n    Desperate times." +
                "\n    Take something useful. If you don't know why you need it, you're in the wrong place already." +
                "\n \n             [[SWORD, SHIELD, BARRIER, RIFLE, SIDEARM]]");


    }

}
