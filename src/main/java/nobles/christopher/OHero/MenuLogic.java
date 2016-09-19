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
                display.print("You 1990 model just don't stay down." +
                        "\n Probably your only redeeming trait.");
                Hero Silver = new Hero("Silver", 10, 20, 10, 15);
                display.print("HERO LEVEL:");
                display.printInt(Silver.heroLevel());
                break;

            case FOX:
                display.print("Would have been best if at least some of you could stay out of this." +
                        "\n You're here now though. Start getting caught up.");
                Hero Fox = new Hero("Fox", 2, 8, 10, 22);
                display.print("HERO LEVEL:");
                display.printInt(Fox.heroLevel());
                break;

            case FAULT:
                display.print("Do you really trust him?");
                Hero Fault = new Hero("Fault", 5, 12, 19, 12);
                display.print("HERO LEVEL:");
                display.printInt(Fault.heroLevel());
                break;

            case BISHOP:
                display.print("You got this far. Now it's time to make it count.");
                Hero Bishop = new Hero("Bishop", 3, 10, 19, 11);
                display.print("HERO LEVEL:");
                display.printInt(Bishop.heroLevel());
                break;

            case RICOCHET:
                display.print("If there is something to be said for the production model..." +
                        "\n it is that they know they have something to prove.");
                Hero Ricochet = new Hero("Ricochet", 12, 18, 4, 10);
                display.print("HERO LEVEL:");
                display.printInt(Ricochet.heroLevel());
                break;
            case ZOMBIE:
                display.print("Undeath isn't a curse. It's a fair trade.");
                Hero Zombie = new Hero("Zombie", 6, 30, 8, 1);
                display.print("HERO LEVEL:");
                display.printInt(Zombie.heroLevel());
                break;
            case SIREN:
                display.print("The Siraant typically hide their hand in affairs." +
                        "\n This is surely no different. What are you hiding?");
                Hero Siren = new Hero("Siren", 2, 8, 12, 25);
                display.print("HERO LEVEL:");
                display.printInt(Siren.heroLevel());
                break;
            case WALLY:
                display.print("You're already one of my favorite unanswered questions.");
                Hero Wally = new Hero("Wally", 16, 16, 14, 12);
                display.print("HERO LEVEL:");
                display.printInt(Wally.heroLevel());
                break;
            case DELGADO:
                display.print("Legends are dead. Myths are forgotten. So what are you?");
                Hero Delgado = new Hero("Delgado", 9, 9, 19, 11);
                display.print("HERO LEVEL:");
                display.printInt(Delgado.heroLevel());
                break;
            case BASILISK:
                display.print("No, I don't want an apple.");
                Hero Basilisk = new Hero("Basilisk", 5, 13, 15, 8);
                display.print("HERO LEVEL:");
                display.printInt(Basilisk.heroLevel());
                break;
            default:
                display.print("I'm here to teach, not judge. Suit up.");


        }
    }
}

