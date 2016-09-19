package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class MenuLogic {

    Display display = new Display();

    public enum Name {SILVER, FOX, FAULT, BISHOP, RICOCHET}

    public void nameSwitch(Name name) {

        switch (name) {
            case SILVER:
                display.print("You 1990 model just don't stay down." +
                        "\n Probably your only redeeming trait.");
                break;

            case FOX:
                display.print("Would have been best if at least some of you could stay out of this." +
                        "\n You're here now though. Start getting caught up.");
                break;

            case FAULT:
                display.print("Do you really trust him?");
                break;

            case BISHOP:
                display.print("You got this far. Now it's time to make it count.");
                break;

            case RICOCHET:
                display.print("If there is something to be said for the production model..." +
                        "\n it is that they know they have something to prove.");
                break;
            default:
                display.print("I'm here to teach, not judge. Suit up.");


        }
    }
}

