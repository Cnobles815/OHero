package nobles.christopher.OHero.io;

import nobles.christopher.OHero.app.MenuLogic;
import nobles.christopher.OHero.units.Hero;
import nobles.christopher.OHero.units.HeroActions;

import java.io.IOException;

/**
 * Created by christophernobles on 9/19/16.
 */
public abstract class Menus {
    static HeroActions heroActions = new HeroActions();
    static MenuLogic menuLogic = new MenuLogic();
    static Hero hero;



    public static void opening() {
        Display.print((char)27 + "[34m \n I am G.E.M. You've probably never heard of me..." +
                "\n                       ...and while I likely know more than anyone would care to about you, do not allow that to abuse your sense of insignificance." +
                "\n \n   I have existed since before the rise of the first." +
                "\n \n   I will exist beyond the fall of the last." +
                "\n\n You? You have arrived charmingly in media res. If it all looks the same in every direction, one may subjectively refer to themselves as the center." +
                "\n That also means that while you are not necessarily late, you clearly are not early either."  +
                "\n Introduce yourself. Let's begin.");
        Display.print((char)27 + "[0;1m\n\n\n     [[ Silver, Basilisk, Siren, Wally, Ricochet, Fox, Zombie, Delgado, Fault, Bishop, NEW]]");
        namePrompt();
        MenuLogic.Name heroName = MenuLogic.Name.valueOf(UserInput.prompt().toUpperCase());
        //display.print("So your name is " + heroName + " ?");

        menuLogic.nameSwitch(heroName);
        //display.print(hero.heroList.iterator().toString());
        weaponPrompt();

    }

    public static void namePrompt() {
        Display.print((char)27 + "[1m                        [[CHOOSE HERO OR SELECT NEW]]");
    }

    public static void weaponPrompt() {
        Display.print((char)27 + "[34m   In theory, you ought be able to hold your own as a 'hero' by the time you leave this facility." +
                "\n    I will be honest. This is my favorite part. You see..." +
                "\n    You won't be leaving unless that theory pans out to some shred of truth. If you fail, you will die." +
                "\n    Take something useful. If you do not know how to use any of them, this will be a very short training.");
        Display.print((char)27 +        "[0;1m\n \n             [[SWORD, SHIELD, BARRIER, RIFLE, SIDEARM, FOCUS, SHOTGUN]]");

        HeroActions.Weapon weaponName = HeroActions.Weapon.valueOf(UserInput.prompt().toUpperCase());
        try {
            heroActions.weaponSwitch(weaponName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        theExposition();

    }

    public static void theExposition() {
        Display.print((char)27 + "[34mAlright. This will have to do for the moment. I want you to listen very carefully." +
                "\n The enemies between you and the exit are designed to scale in difficulty depending upon the 'hero' facing them." +
                "\n The scale is best appreciated as 'just enough to kill them'. So, take that as you will. Whatever you do best probably will not be sufficient here." +
                "\n Your first objective is clear: Get out of this room. I will maintain contact and feed you as much information as I can." +
                "\n And oh, " + hero.heroList.get(0).getHeroName() + ". [snarky comment here]" +
                "\n You won't get far, but perserverence is the more productive brand of futility. Now go.");
        nowGo();

    }

    public static void nowGo() {
        Display.print((char)27 + "[1m \n\n\n   [[CHAPTER 1: \"Now go.\"]]    ");
        Display.print((char)27 + "[1mOPTIONS" +
                "\n1. Explore Room" +
                "\n2. Exit Room" +
                "\n3. Open Terminal [G.E.M]" +
                "\n4. Check Stats");
        int choice = UserInput.promptInt();
        heroActions.nowGoSwitch(choice);


    }

    public static void goWhere() {
        Display.print((char)27+"[1m1. Go left." +
                "\n2. Go right." +
                "\n3. Yell for help." +
                "\n4. Dance. ");
        int choice = UserInput.promptInt();
        heroActions.goWhereSwitch(choice);

    }

}
