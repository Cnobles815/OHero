package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class HeroActions {
    Hero hero;

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
}

