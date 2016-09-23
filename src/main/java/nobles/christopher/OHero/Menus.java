package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class Menus {
    static Display display = new Display();
    static UserInput userInput = new UserInput();
    static HeroActions heroActions = new HeroActions();
    MenuLogic menuLogic = new MenuLogic();
    Hero hero;



    public void opening() {
        display.print(" \n I am G.E.M. You've probably never heard of me." +
                "\n And let me assure you that I am not happy to see you." +
                "\n I have existed since before the rise of the first." +
                "\n I will exist beyond the fall of the last." +
                "\n You? You have arrived charmingly en-media-res. If it all looks the same in every direction, one may subjectively refer to themselves as the center." +
                "\n Enough. You have no interest in such things." +
                "\n Introduce yourself. Let's begin." +
                "\n     [[ Silver, Basilisk, Siren, Wally, Ricochet, Fox, Zombie, Delgado, Fault, Bishop, NEW]]");
        namePrompt();
        MenuLogic.Name heroName = MenuLogic.Name.valueOf(userInput.prompt().toUpperCase());
        //display.print("So your name is " + heroName + " ?");

        menuLogic.nameSwitch(heroName);
        weaponPrompt();

    }

    public void namePrompt() {
        display.print("                  [[CHOOSE HERO OR SELECT NEW]]");
    }

    public void weaponPrompt() {
        display.print("   In theory, you ought be able to hold your own as a 'hero' by the time you leave this facility." +
                "\n    I will be honest. This is my favorite part. You see..." +
                "\n    You won't be leaving unless that theory pans out to some shred of truth. If you fail, you will die." +
                "\n    Take something useful. If you do not know how to use any of them, this will be a very short training." +
                "\n \n             [[SWORD, SHIELD, BARRIER, RIFLE, SIDEARM, FOCUS, SHOTGUN]]");

        HeroActions.Weapon weaponName = HeroActions.Weapon.valueOf(userInput.prompt().toUpperCase());
        heroActions.weaponSwitch(weaponName);
        theExposition();

    }

    public void theExposition() {
        display.print("Alright. This will have to do for the moment. I want you to listen very carefully." +
                "\n The enemies between you and the exit are designed to scale in difficulty depending upon the 'hero' facing them." +
                "\n The scale is best appreciated as 'just enough to kill them'. So, take that as you will. Whatever you do best probably will not be sufficient here." +
                "\n Your first objective is clear: Get out of this room. I will maintain contact and feed you as much information as I can." +
                "\n And oh, " + hero.heroList.get(0).getHeroName() + ". [snarky comment here]" +
                "\n You won't get far, but perserverence is the more productive brand of futility. Now go.");
        nowGo();

    }

    public static void nowGo() {
        display.print(" \n\n\n   [[CHAPTER 1: \"Now go.\"]]    ");
        display.print("OPTIONS" +
                "\n1. Explore Room" +
                "\n2. Exit Room" +
                "\n3. Open Terminal [G.E.M]" +
                "\n4. Check Stats");
        int choice = userInput.promptInt();
        heroActions.nowGoSwitch(choice);


    }

    public static void goWhere() {
        display.print("1. Go left." +
                "\n2. Go right." +
                "\n3. Yell for help." +
                "\n4. Dance. ");
        int choice = userInput.promptInt();
        heroActions.goWhereSwitch(choice);

    }

}
