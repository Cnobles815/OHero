package nobles.christopher.OHero;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 9/19/16.
 */
public class HeroTEST {

    @Test
    public void heroLevelTEST(){
        Hero hero  = new Hero("Bob", 4, 4, 4, 4);
        int expectedValue = 16;
        int actualValue = hero.heroLevel();
        assertEquals("The value should be 16" , expectedValue , actualValue);

    }

    @Test
    public void getHeroHPTEST(){
        Hero hero = new Hero("Bob", 4, 4, 4, 4);
        int expectedValue = 4;
        int actualValue = hero.getHeroHp();
        assertEquals("The value should be 4", expectedValue , actualValue);
    }

    @Test
    public void getHeroENTEST(){
        Hero hero = new Hero("Bob", 4, 4, 4, 4);
        int expectedValue = 4;
        int actualValue = hero.getHeroEn();
        assertEquals("The value should be 4", expectedValue , actualValue);
    }

    @Test
    public void getHeroSTRTEST(){
        Hero hero = new Hero("Bob", 4, 4, 4, 4);
        int expectedValue = 4;
        int actualValue = hero.getHeroStr();
        assertEquals("The value should be 4", expectedValue , actualValue);
    }

    @Test
    public void getHeroSPDTEST(){
        Hero hero = new Hero("Bob", 4, 4, 4, 4);
        int expectedValue = 4;
        int actualValue = hero.getHeroSpd();
        assertEquals("The value should be 4", expectedValue , actualValue);
    }
}
