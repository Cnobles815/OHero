package nobles.christopher.OHero.app;

import nobles.christopher.OHero.io.Display;
import nobles.christopher.OHero.io.UserInput;
import nobles.christopher.OHero.units.Hero;
import nobles.christopher.OHero.units.HeroHolder;

/**
 * Created by christophernobles on 9/19/16.
 */
public class MenuLogic {
    static Hero hero;
    HeroHolder heroHolder = new HeroHolder();

    public static void nameSwitch(Name name) throws IllegalArgumentException {

        String newName;

        switch (name) {
            case SILVER:
                Display.print("  The unrelenting bulwark." +
                        "\n   To assail one's foes with their own polished reflection. True, absolute, cruelty." +
                        "\n[[TANK ARCHETYPE]]");
                hero = new Hero("Silver", 10, 20, 10, 15, 35);
                Display.print(hero.getHeroName() + "'s HERO LEVEL:");
                Display.printInt(hero.heroLevel());
                Hero.addHero(hero);
                //System.out.println(hero.heroList.get(0));
                break;

            case FOX:
                Display.print("  With sunlike prominence, she blazes." +
                        "\n Not by intention, but by nature. The tails are not her signature, but her wake." +
                        "\n [[GLASSCANNON ARCHETYPE]]");
                hero = new Hero("Fox", 2, 8, 10, 22, 22);
                Display.print(hero.getHeroName() + "'s HERO LEVEL:");
                Display.printInt(hero.heroLevel());
                Hero.addHero(hero);
                break;

            case FAULT:
                Display.print("  To exist in two states simultaneously is to both be embattled and free." +
                        "\n How do we measure the pulse of the cat?" +
                        "\n [[SPEEDSTER ARCHETYPE]]");
                hero = new Hero("Fault", 5, 12, 19, 12, 21);
                Display.print(hero.getHeroName() + "'s HERO LEVEL:");
                Display.printInt(hero.heroLevel());
                Hero.addHero(hero);
                break;

            case BISHOP:
                Display.print("  To appreciate inertia, we must first witness its two extremes." +
                        "\n We hardly know to witness what we do not understand." +
                        "\n [[SPEEDSTER ARCHETYPE]]");
                hero = new Hero("Bishop", 3, 10, 19, 11, 18);
                Display.print(hero.getHeroName() + "'s HERO LEVEL:");
                Display.printInt(hero.heroLevel());
                Hero.addHero(hero);
                break;

            case RICOCHET:
                Display.print("  To be a Vanguard is no way to exist at all." +
                        "\n If the protector only serves in peril, how sincerely is peace sought?" +
                        "\n [[BRUISER ARCHETYPE]]");
                hero = new Hero("Ricochet", 12, 18, 4, 10, 20);
                Display.print(hero.getHeroName() + "'s HERO LEVEL:");
                Display.printInt(hero.heroLevel());
                Hero.addHero(hero);
                break;

            case ZOMBIE:
                Display.print("  Undeath isn't a curse. It is a fair trade." +
                        "\n [[TANK ARCHETYPE]]");
                hero = new Hero("Zombie", 6, 30, 8, 1, 29);
                Display.print(hero.getHeroName() + "'s HERO LEVEL:");
                Display.printInt(hero.heroLevel());
                Hero.addHero(hero);
                break;

            case SIREN:
                Display.print("  Sing to me." +
                        "\n If I applaud, is it adoration or obedience?" +
                        "\n [[SUPPORT ARCHETYPE]]");
                hero = new Hero("Siren", 2, 8, 12, 25, 35);
                Display.print(hero.getHeroName() + "'s HERO LEVEL:");
                Display.printInt(hero.heroLevel());
                Hero.addHero(hero);
                break;

            case WALLY:
                Display.print(" Survival as an art. Charisma as a science." +
                        "\n [[BRUISER ARCHETYPE]]");
                hero = new Hero("Wally", 16, 16, 14, 12, 27);
                Display.print(hero.getHeroName() + "'s HERO LEVEL:");
                Display.printInt(hero.heroLevel());
                Hero.addHero(hero);
                break;

            case DELGADO:
                Display.print("  Legends are dead. Myths are forgotten. What does that make you?" +
                        "\n [[BRUISER ARCHETYPE]]");
                hero = new Hero("Delgado", 9, 9, 19, 11, 32);
                Display.print(hero.getHeroName() + "'s HERO LEVEL:");
                Display.printInt(hero.heroLevel());
                Hero.addHero(hero);
                break;

            case BASILISK:
                Display.print("  No, I don't want an apple." +
                        "\n [[GLASSCANNON ARCHETYPE]]");
                hero = new Hero("Basilisk", 5, 13, 15, 8, 31);
                Display.print(hero.getHeroName() + "'s HERO LEVEL:");
                Display.printInt(hero.heroLevel());
                Hero.addHero(hero);
                break;

            case NEW:
                Display.print("\n  I do not think we've met before. Interesting.");
                Display.print("  What do you call yourself?" +
                        "\n                       [[ENTER NAME]]");
                newName = UserInput.prompt();
                hero = new Hero(newName, 8, 8, 8, 8, 5);
                Display.print(hero.getHeroName() + "'s HERO LEVEL:");
                Display.printInt(hero.heroLevel());
                Hero.addHero(hero);
        }
    }

    public enum Name {SILVER, FOX, FAULT, BISHOP, RICOCHET, WALLY, DELGADO, SIREN, ZOMBIE, BASILISK, NEW}

}

