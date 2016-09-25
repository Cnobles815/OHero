package nobles.christopher.OHero;

/**
 * Created by christophernobles on 9/19/16.
 */
public class MenuLogic {

    static Display display = new Display();
    static Hero hero;
    HeroHolder heroHolder = new HeroHolder();
    static UserInput userInput = new UserInput();

    public static void nameSwitch(Name name) {

        String newName;

        switch (name) {
            case SILVER:
                display.print("  The unrelenting bulwark." +
                        "\n   To assail one's foes with their own polished reflection. True, absolute, cruelty." +
                        "\n[[TANK ARCHETYPE]]");
                hero = new Hero("Silver", 10, 20, 10, 15, 35);
                display.print(hero.getHeroName() + "'s HERO LEVEL:");
                display.printInt(hero.heroLevel());
                hero.addHero(hero);
                //System.out.println(hero.heroList.get(0));
                break;

            case FOX:
                display.print("  With sunlike prominence, she blazes." +
                        "\n Not by intention, but by nature. The tails are not her signature, but her wake." +
                        "\n [[GLASSCANNON ARCHETYPE]]");
                hero = new Hero("Fox", 2, 8, 10, 22, 22);
                display.print(hero.getHeroName() + "'s HERO LEVEL:");
                display.printInt(hero.heroLevel());
                hero.addHero(hero);
                break;

            case FAULT:
                display.print("  To exist in two states simultaneously is to both be embattled and free." +
                        "\n How do we measure the pulse of the cat?" +
                        "\n [[SPEEDSTER ARCHETYPE]]");
                hero = new Hero("Fault", 5, 12, 19, 12, 21);
                display.print(hero.getHeroName() + "'s HERO LEVEL:");
                display.printInt(hero.heroLevel());
                hero.addHero(hero);
                break;

            case BISHOP:
                display.print("  To appreciate inertia, we must first witness its two extremes." +
                        "\n We hardly know to witness what we do not understand." +
                        "\n [[SPEEDSTER ARCHETYPE]]");
                hero = new Hero("Bishop", 3, 10, 19, 11, 18);
                display.print(hero.getHeroName() + "'s HERO LEVEL:");
                display.printInt(hero.heroLevel());
                hero.addHero(hero);
                break;

            case RICOCHET:
                display.print("  To be a Vanguard is no way to exist at all." +
                        "\n If the protector only serves in peril, how sincerely is peace sought?" +
                        "\n [[BRUISER ARCHETYPE]]");
                hero = new Hero("Ricochet", 12, 18, 4, 10, 20);
                display.print(hero.getHeroName() + "'s HERO LEVEL:");
                display.printInt(hero.heroLevel());
                hero.addHero(hero);
                break;

            case ZOMBIE:
                display.print("  Undeath isn't a curse. It is a fair trade." +
                        "\n [[TANK ARCHETYPE]]");
                hero = new Hero("Zombie", 6, 30, 8, 1, 29);
                display.print(hero.getHeroName() + "'s HERO LEVEL:");
                display.printInt(hero.heroLevel());
                hero.addHero(hero);
                break;

            case SIREN:
                display.print("  Sing to me." +
                        "\n If I applaud, is it adoration or obedience?" +
                        "\n [[SUPPORT ARCHETYPE]]");
                hero = new Hero("Siren", 2, 8, 12, 25, 35);
                display.print(hero.getHeroName() + "'s HERO LEVEL:");
                display.printInt(hero.heroLevel());
                hero.addHero(hero);
                break;

            case WALLY:
                display.print(" Survival as an art. Charisma as a science." +
                        "\n [[BRUISER ARCHETYPE]]");
                hero = new Hero("Wally", 16, 16, 14, 12, 27);
                display.print(hero.getHeroName() + "'s HERO LEVEL:");
                display.printInt(hero.heroLevel());
                hero.addHero(hero);
                break;

            case DELGADO:
                display.print("  Legends are dead. Myths are forgotten. What does that make you?" +
                        "\n [[BRUISER ARCHETYPE]]");
                hero = new Hero("Delgado", 9, 9, 19, 11, 32);
                display.print(hero.getHeroName() + "'s HERO LEVEL:");
                display.printInt(hero.heroLevel());
                hero.addHero(hero);
                break;

            case BASILISK:
                display.print("  No, I don't want an apple." +
                        "\n [[GLASSCANNON ARCHETYPE]]");
                hero = new Hero("Basilisk", 5, 13, 15, 8, 31);
                display.print(hero.getHeroName() + "'s HERO LEVEL:");
                display.printInt(hero.heroLevel());
                hero.addHero(hero);
                break;

            case NEW:
                display.print("\n  I do not think we've met before. Interesting.");
                display.print("  What do you call yourself?" +
                        "\n                       [[ENTER NAME]]");
                newName = userInput.prompt();
                hero = new Hero(newName, 8, 8, 8, 8, 5);
                display.print(hero.getHeroName() + "'s HERO LEVEL:");
                display.printInt(hero.heroLevel());
                hero.addHero(hero);

//            default:
//                display.print("  I'm here to teach, not judge. Suit up.");
//                hero = new Hero();
//                display.print("  HERO LEVEL:");
//                display.printInt(hero.heroLevel());
//                hero.addHero(hero);
        }
    }

    public enum Name {SILVER, FOX, FAULT, BISHOP, RICOCHET, WALLY, DELGADO, SIREN, ZOMBIE, BASILISK, NEW}

}

