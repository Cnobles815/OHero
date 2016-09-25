package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class HeroActions {
    Hero hero;
    //Menus menu;
    Display display = new Display();

    public enum Weapon {SWORD, SHIELD, BARRIER, RIFLE, SIDEARM, SHOTGUN, FOCUS}
    public void weaponSwitch(Weapon weapon) {

        switch (weapon) {
            case SWORD:
                display.print("More than a relic. With what this thing has seen, I would be more worried about its previous owner." +
                        "\n If she comes to get it, she will not be happy to see you holding it.");
                hero.heroList.get(0).heroStrUp(2);
                hero.heroList.get(0).heroSpdUp(5);
                hero.heroList.get(0).heroEnUp(5);
                hero.heroList.get(0).heroWpUp(8);
                display.print("    [[LEVEL UP!]]    ");
                display.printInt(hero.heroList.get(0).heroLevel());
                break;

            case SHIELD:
                display.print("The oldest race in humanity's history. Just so you are aware, sword has always won.");
                hero.heroList.get(0).heroHpUp(14);
                hero.heroList.get(0).heroSpdUp(-4);
                hero.heroList.get(0).heroStrUp(3);
                hero.heroList.get(0).heroWpUp(7);
                display.print("    [[LEVEL UP!]]    ");
                display.printInt(hero.heroList.get(0).heroLevel());
                break;

            case BARRIER:
                display.print("By will alone, pardon yourself from harm.");
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

            case SHOTGUN:
                display.print("Instantaneous conflict resolution..." +
                        "\n Now that's magic.");
                hero.heroList.get(0).heroWpUp(40);
                hero.heroList.get(0).heroHpUp(-10);
                hero.heroList.get(0).heroEnUp(-10);
                display.print("     [[LEVEL UP!]]    ");
                display.printInt(hero.heroList.get(0).heroLevel());
                break;

            case FOCUS:
                display.print("Projection of power has always been more important than volume.");
                hero.heroList.get(0).heroWpUp(15);
                hero.heroList.get(0).heroEnUp(15);
                hero.heroList.get(0).heroHpUp(-5);
                hero.heroList.get(0).heroStrUp(-5);
                display.print("     [[LEVEL UP!]]     ");
                display.printInt(hero.heroList.get(0).heroLevel());

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
        switch (choice) {
            case 1:
                display.print("EXPLORE" +
                        "--A staging area. Sealed lockers line the walls of the room, unbroken aside from the monitor from which 'Gem' speaks." +
                        "\n Brightly lit, but mostly barren, a green flashing light beside the heavy hatch door on one end of the room seems the only way out." +
                        "\n A constant low, nearly sub-bass thrum hums in the air. Occasionally, a trembling thump which can be felt through the walls and floor ripples through." +
                        "\n By any reasonable guess, you are far below ground---or aboard something very, very large." +
                        "\n In your exploration of the room, you locate an armband which someone else seems to have left behind. It fits well with your gear, and provides a weak protective shield.--");
                if (x <= 0) {
                    hero.heroList.get(0).heroHpUp(4);
                    display.print("   [[LEVEL UP!]]");
                    display.printInt(hero.heroList.get(0).heroLevel());
                } else {
                    display.print("There's nothing else to find. Nice try though.");
                }
                Menus.nowGo();
                break;
            case 2:
                display.print("--The door is stuck. Door opening requires 10 Strength or 10 Willpower--");
                display.print(hero.heroList.get(0).getHeroName() + "'s Strength is:");
                display.printInt(hero.heroList.get(0).getHeroStr());
                display.print(hero.heroList.get(0).getHeroName() + "'s Willpower is:");
                display.printInt(hero.heroList.get(0).getHeroWp());
                if (hero.heroList.get(0).getHeroStr() < 10 && hero.heroList.get(0).getHeroWp() < 10)
                    display.print("--You pushed again. The door glides open silently---but a shadow sweeps by the opening, moving to your right.--");
                else
                    display.print("--The door opens with a bit more strength, gliding open silently. Despite appearing empty, the facility is well kept.--" +
                            "\n Beyond the door, the hall is dimly lit. The lights above are evenly spaced, providing cool blue-white illumniation---just not very much of it." +
                            "\n The air is crisp, cool. Certainly being cycled through a system frequently, a constant draft pushes from the right. Well cooled, very quiet.");
                Menus.goWhere();
                break;
            case 3:
                display.print("So you want to know more. I can respect that." +
                        "\n I'll never respect YOU, " + hero.heroList.get(0).getHeroName() + ", but I can respect the curiosity." +
                        "\n" +
                        "\n" +
                        "You are here because someone gave you the absurd idea that you could be a 'hero' at some point in your life." +
                        "\n To reach this room, you have at very least proven that stairs and toasters aren't quite enough to rid the world of your presence." +
                        "\n You also may or may not have spoken the word 'righteous' at least once in your life, unironically." +
                        "\n Hero meant something, once upon a time. Now it means you have participated in the rigorous training of this academy, and your reward is obligation." +
                        "\n Peace mostly thrives. But there will always be threats to that peace. An age of vast properity means that those threats are often very well equipped and enabled." +
                        "\n Stop them. But first, get out of this training arena alive." +
                        "\n I won't be disappointed if you do not. You have no idea just how low my expectations are." +
                        "\n You know enough to complete your task." +
                        "\n Now go.");
                display.print("--You learned a bit about the situation. Knowledge is power.--");
                hero.heroList.get(0).heroWpUp(2);
                hero.heroList.get(0).heroEnUp(2);
                display.print("   [[LEVEL UP!]]");
                display.printInt(hero.heroList.get(0).heroLevel());
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
                display.print("Your cringeworthy penchant for indecision is beginning to get on my nerves. Choose.");
                Menus.nowGo();
                break;

        }
    }

    public void goWhereSwitch(int choice) {
        switch (choice) {
            case 1:
                display.print("GO RIGHT");
                break;
            case 2:
                display.print("GO LEFT");
                break;
            case 3:
                display.print("YELL");
                break;
            case 4:
                display.print("BE AN IDIOT");
                Menus.goWhere();
                break;
            default:
                display.print("You did nothing. The world is in terrible hands, 'hero'.");
                break;
        }
    }

}

