package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class Menus {
    static Display display = new Display();
    static UserInput userInput = new UserInput();
    MenuLogic menuLogic = new MenuLogic();
    static HeroActions heroActions = new HeroActions();
    Hero hero;

    public enum Weapon {SWORD}

    public void opening() {
        display.print(" \n I am G.E.M. You've probably never heard of me." +
                "\n And let me assure you that I am not happy to see you." +
                "\n That is a joke. Currently, I am completely blind. You'll help me with that." +
                "\n The vast majority of my sensors are down." +
                "\n ...that said, you look like too little too late, to me." +
                "\n But what good has reserve, at the end of things?" +
                "\n Introduce yourself. Let's begin." +
                "\n     [[ENTER HERO NAME: Silver, Basilisk, Siren, Wally, Ricochet, Fox, Zombie, Delgado, Fault, Bishop]]");
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

        HeroActions.Weapon weaponName = HeroActions.Weapon.valueOf(userInput.prompt().toUpperCase());
        heroActions.weaponSwitch(weaponName);
        theExposition();

    }

    public void theExposition(){
        display.print("Alright. This will have to do for the moment. I want you to listen---well, read---very carefully." +
                "\n You are a long way from anything which wants to survive. We knew the first wave would go badly but..." +
                "\n Honestly, even my predictions could not have accounted for all that has happened." +
                "\n Your first objective is clear: Get out of this bunker. I will maintain contact and feed you as much information as I can." +
                "\n If you encounter an angel, " + hero.heroList.get(0).getHeroName() + ", you are to run. Not fight, run." +
                "\n You won't get far, but it is the more productive brand of futility. Now go.");
        nowGo();

    }

    public static  void nowGo(){
        display.print(" \n\n\n   [[CHAPTER 1: \"Now go.\"]]    ");
        display.print("OPTIONS" +
                "\n1. Explore Room" +
                "\n2. Exit Room" +
                "\n3. Open Terminal [G.E.M]" +
                "\n4. Check Stats");
        int choice = userInput.promptInt();
        heroActions.nowGoSwitch(choice);


    }

}
