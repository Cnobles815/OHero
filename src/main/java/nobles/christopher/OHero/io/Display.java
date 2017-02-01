package nobles.christopher.OHero.io;

import nobles.christopher.OHero.units.Hero;

/**
 * Created by christophernobles on 9/19/16.
 */
public abstract class Display {

    public static void print(String output) {
        System.out.println(output);
    }

    public static void printInt(int output) {
        System.out.println(output);
    }

    public static void printInt(Integer output) {
        System.out.println(output);
    }

    public static void printHero(Hero output) {
        System.out.println(output);
    }

}