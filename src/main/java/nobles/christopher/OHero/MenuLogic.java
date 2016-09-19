package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class MenuLogic {

    Display display = new Display();
    Hero hero;

    public enum Name {SILVER, FOX, FAULT, BISHOP, RICOCHET, WALLY, DELGADO, SIREN, ZOMBIE, BASILISK}

    public void nameSwitch(Name name) {

        switch (name) {
            case SILVER:
                display.print("  You 1990 model just don't stay down." +
                        "\n   Probably your only redeeming trait.");
                hero = new Hero("Silver", 10, 20, 10, 15);
                display.print("  HERO LEVEL:");
                display.printInt(hero.heroLevel());
                break;

            case FOX:
                display.print("  Would have been best if at least some of you could stay out of this." +
                        "\n   You're here now though. Start getting caught up.");
                hero = new Hero("Fox", 2, 8, 10, 22);
                display.print("  HERO LEVEL:");
                display.printInt(hero.heroLevel());
                break;

            case FAULT:
                display.print("  Do you really trust him?");
                hero = new Hero("Fault", 5, 12, 19, 12);
                display.print("  HERO LEVEL:");
                display.printInt(hero.heroLevel());
                break;

            case BISHOP:
                display.print("  You got this far. Now it's time to make it count.");
                hero = new Hero("Bishop", 3, 10, 19, 11);
                display.print("  HERO LEVEL:");
                display.printInt(hero.heroLevel());
                break;

            case RICOCHET:
                display.print("  If there is something to be said for the production model..." +
                        "\n   it is that they know they have something to prove.");
                hero = new Hero("Ricochet", 12, 18, 4, 10);
                display.print("  HERO LEVEL:");
                display.printInt(hero.heroLevel());
                break;

            case ZOMBIE:
                display.print("  Undeath isn't a curse. It's a fair trade.");
                hero = new Hero("Zombie", 6, 30, 8, 1);
                display.print("  HERO LEVEL:");
                display.printInt(hero.heroLevel());
                break;

            case SIREN:
                display.print("  The Siraant typically hide their hand in affairs." +
                        "\n   This is surely no different. What are you hiding?");
                hero = new Hero("Siren", 2, 8, 12, 25);
                display.print("  HERO LEVEL:");
                display.printInt(hero.heroLevel());
                break;

            case WALLY:
                display.print("  You're already one of my favorite unanswered questions.");
                hero = new Hero("Wally", 16, 16, 14, 12);
                display.print("  HERO LEVEL:");
                display.printInt(hero.heroLevel());
                break;

            case DELGADO:
                display.print("  Legends are dead. Myths are forgotten. So what are you?");
                hero = new Hero("Delgado", 9, 9, 19, 11);
                display.print("  HERO LEVEL:");
                display.printInt(hero.heroLevel());
                break;

            case BASILISK:
                display.print("  No, I don't want an apple.");
                hero = new Hero("Basilisk", 5, 13, 15, 8);
                display.print("  HERO LEVEL:");
                display.printInt(hero.heroLevel());
                break;

            default:
                display.print("  I'm here to teach, not judge. Suit up.");
                hero = new Hero();
                display.print("  HERO LEVEL:");
                display.printInt(hero.heroLevel());



        }
    }

    public void getHero(){

    }
}

