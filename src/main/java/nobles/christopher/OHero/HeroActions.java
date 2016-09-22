package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class HeroActions {
    Hero hero;
    Menus menu;
    Display display = new Display();

    public enum Weapon {SWORD, SHIELD, BARRIER, RIFLE, SIDEARM}

    public void weaponSwitch(Weapon weapon) {

        switch (weapon) {
            case SWORD:
                display.print("More than a relic. With what this thing has seen, I'd be more worried about its previous owner." +
                        "\n If she comes to get it, she won't be happy to see you holding it.");
                hero.heroList.get(0).heroStrUp(2);
                hero.heroList.get(0).heroSpdUp(5);
                hero.heroList.get(0).heroEnUp(5);
                hero.heroList.get(0).heroWpUp(8);
                display.print("    [[LEVEL UP!]]    ");
                display.printInt(hero.heroList.get(0).heroLevel());
                break;

            case SHIELD:
                display.print("As long as they're more dead than you are, right?");
                hero.heroList.get(0).heroHpUp(14);
                hero.heroList.get(0).heroSpdUp(-4);
                hero.heroList.get(0).heroStrUp(3);
                hero.heroList.get(0).heroWpUp(7);
                display.print("    [[LEVEL UP!]]    ");
                display.printInt(hero.heroList.get(0).heroLevel());
                break;

            case BARRIER:
                display.print("Just one more volley.");
                hero.heroList.get(0).heroEnUp(-15);
                hero.heroList.get(0).heroHpUp(20);
                hero.heroList.get(0).heroSpdUp(10);
                hero.heroList.get(0).heroWpUp(5);
                display.print("    [[LEVEL UP!]]    ");
                display.printInt(hero.heroList.get(0).heroLevel());
                break;

            case RIFLE:
                display.print("The best defense..." +
                        "\n is another mag.");
                hero.heroList.get(0).heroHpUp(-5);
                hero.heroList.get(0).heroWpUp(34);
                hero.heroList.get(0).heroSpdUp(-4);
                hero.heroList.get(0).heroEnUp(-5);
                display.print("    [[LEVEL UP!]]    ");
                display.printInt(hero.heroList.get(0).heroLevel());
                break;

            case SIDEARM:
                display.print("Reflex shot. Fortune favors the first.");
                hero.heroList.get(0).heroHpUp(-8);
                hero.heroList.get(0).heroWpUp(16);
                hero.heroList.get(0).heroSpdUp(16);
                hero.heroList.get(0).heroStrUp(-4);
                display.print("    [[LEVEL UP!]]    ");
                display.printInt(hero.heroList.get(0).heroLevel());
                break;
        }

    }

    public void nowGoSwitch(int choice) {
        int x = -1;
        x++;
        switch(choice) {
            case 1:
                display.print("EXPLORE" +
                        "--The room is mostly dark. The sharp glow of flickering flat screen monitors provides the only illumination." +
                        "\n Harsh shadows are cast throughout the room, shifting whe a display changes or displays text from your mostly silent guide." +
                        "\n A constant low, nearly sub-bass thrum hums in the air. Occasionally, a trembling thump which can be felt through the walls and floor ripples through." +
                        "\n By any reasonable guess, you are far below ground---and high above, there is a pitched battle of some sort." +
                        "\n In your exploration of the room, you locate an armband which integrates easily into your gear, providing a partial shield.--");
                if (x <= 0) {
                hero.heroList.get(0).heroHpUp(4);
                display.print("   [[LEVEL UP!]]");
                display.printInt(hero.heroList.get(0).heroLevel());
                }
                else {display.print("There's nothing else to find. Nice try though.");}
                Menus.nowGo();
                break;
            case 2:
                display.print("--The door is stuck. Door opening requires 10 Strength or 10 Willpower (or 2 turns if lower than 10)--");
                display.print("Your Strength is:");
                display.printInt(hero.heroList.get(0).getHeroStr());
                display.print("Your Willpower is:");
                display.printInt(hero.heroList.get(0).getHeroWp());
                if (hero.heroList.get(0).getHeroStr() < 10 && hero.heroList.get(0).getHeroWp() < 10)
                    display.print("--You pushed again. The door glides open silently---but a shadow sweeps by the opening, moving to your right.--");
                else display.print("--The door opens with a bit more strength, gliding open silently. Despite appearing empty, the facility is well kept.--" +
                        "\n Immediately upon opening the door TO BE CONTINUED");
                break;
            case 3:
                display.print("So you want to know more about what is going on. I can respect that." +
                        "\n I'll never respect YOU, " + hero.heroList.get(0).getHeroName() + ", but I can respect the curiosity." +
                        "\n" +
                        "\n" +
                        "To be honest with you, I do not know. I know that you should not be here. I know that approximately two point seven trillion program alarms have been tripped in the past twenty four hours." +
                        "\n Orbital sensors. Atmospheric overpressure alerts. Connectivity severances spanning the entire easter seaboard of Asia." +
                        "\n Grenwich is dark. ISS is dark. Scattered reports of something in the skies above New York City." +
                        "\n Scattered reports of armed, powerful resistance. Human resistance. I suppose that is you, isn't it?" +
                        "\n I do not know how you got down here. That is your story to tell. What I can tell you is that, as things stand now, your presence here confirms my most pessimistic projections;" +
                        "\n We are losing. Badly. And no one knows just what is going on. Go find out. I will be with you." +
                        "\n Now go.");
                Menus.nowGo();
                break;
            case 4:
                display.print("\n\nSTATS");
                display.print("Energy Level:");
                display.printInt(hero.heroList.get(0).getHeroEn());
                display.print("Health Points:");
                display.printInt(hero.heroList.get(0).getHeroHp());
                display.print("Speed Rating:");
                display.printInt(hero.heroList.get(0).getHeroSpd());
                display.print("Willpower:");
                display.printInt(hero.heroList.get(0).getHeroWp());
                display.print("Strength Rating:");
                display.printInt(hero.heroList.get(0).getHeroStr());
                display.print("Total Hero Level:");
                display.printInt(hero.heroList.get(0).heroLevel());
                Menus.nowGo();

                break;
            default:
                display.print("Your indecision will get us both killed. Decide.");
                menu.nowGo();
                break;

        }
    }
}

