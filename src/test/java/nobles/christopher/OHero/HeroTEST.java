package nobles.christopher.OHero;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 9/19/16.
 */
public class HeroTEST {

    @Test
    public void heroLevelTEST(){
        Hero hero  = new Hero("Bob", 4, 4, 4, 4, 4);
        int expectedValue = 20;
        int actualValue = hero.heroLevel();
        assertEquals("The value should be 20" , expectedValue , actualValue);
    }

    @Test
    public void getHeroHPTEST(){
        Hero hero = new Hero("Bob", 4, 5, 4, 4, 4);
        int expectedValue = 5;
        int actualValue = hero.getHeroHp();
        assertEquals("The value should be 4", expectedValue , actualValue);
    }

    @Test
    public void getHeroENTEST(){
        Hero hero = new Hero("Bob", 4, 4, 4, 5, 4);
        int expectedValue = 5;
        int actualValue = hero.getHeroEn();
        assertEquals("The value should be 4", expectedValue , actualValue);
    }

    @Test
    public void getHeroSTRTEST(){
        Hero hero = new Hero("Bob", 5, 4, 4, 4, 4);
        int expectedValue = 5;
        int actualValue = hero.getHeroStr();
        assertEquals("The value should be 4", expectedValue , actualValue);
    }

    @Test
    public void getHeroSPDTEST(){
        Hero hero = new Hero("Bob", 4, 4, 5, 4, 4);
        int expectedValue = 5;
        int actualValue = hero.getHeroSpd();
        assertEquals("The value should be 4", expectedValue , actualValue);
    }

    @Test
    public void getHeroWPTEST(){
        Hero hero = new Hero("Bob", 4, 4, 4, 4, 5);
        int expectedValue = 5;
        int actualValue = hero.getHeroWp();
        assertEquals("The value should be 4", expectedValue , actualValue);
    }

    @Test
    public void heroSTRUpTEST(){
        Hero hero = new Hero("Bob", 5, 4, 4, 4, 4);
        int expectedValue = 7;
        int actualValue = hero.heroStrUp(2);
        assertEquals("The value should be 6" , expectedValue , actualValue);
    }

    @Test
    public void heroENUpTEST(){
        Hero hero = new Hero("Bob", 4, 4, 4, 5, 4);
        int expectedValue = 7;
        int actualValue = hero.heroEnUp(2);
        assertEquals("The value should be 6" , expectedValue , actualValue);
    }

    @Test
    public void heroSPDUpTEST(){
        Hero hero = new Hero("Bob", 4, 4, 5, 4, 4);
        int expectedValue = 7;
        int actualValue = hero.heroSpdUp(2);
        assertEquals("The value should be 6" , expectedValue , actualValue);
    }

    @Test
    public void heroHPUpTEST(){
        Hero hero = new Hero("Bob", 4, 5, 4, 4, 4);
        int expectedValue = 7;
        int actualValue = hero.heroHpUp(2);
        assertEquals("The value should be 6" , expectedValue , actualValue);
    }

    @Test
    public void heroWPUpTest(){
        Hero hero = new Hero("Bob", 4, 4, 4, 4, 5);
        int expectedValue = 7;
        int actualValue = hero.heroWpUp(2);
        assertEquals("The value should be 6", expectedValue , actualValue);
    }
}
