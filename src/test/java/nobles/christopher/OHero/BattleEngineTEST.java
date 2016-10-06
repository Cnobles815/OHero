package nobles.christopher.OHero;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 10/6/16.
 */
public class BattleEngineTEST {
    @Test
    public void strClashTEST(){
        Enemy enemy  = new Enemy("Jim", 5, 6, 6, 6);
        Hero hero = new Hero("Jane", 12, 9, 9, 9, 9);
        BattleEngine battleTest = new BattleEngine();

        hero.addHero(hero);
        enemy.addEnemy(enemy);

        int expectedValue = 7;
        int actualValue = battleTest.strClash();
        assertEquals("The value should be 7" , expectedValue , actualValue);
    }

    @Test
    public void spdClashTEST(){
        Enemy enemy  = new Enemy("Jim", 6, 6, 5, 6);
        Hero hero = new Hero("Jane", 9, 9, 12, 9, 9);
        BattleEngine battleTest = new BattleEngine();

        hero.addHero(hero);
        enemy.addEnemy(enemy);

        int expectedValue = 7;
        int actualValue = battleTest.spdClash();
        assertEquals("The value should be 7" , expectedValue , actualValue);
    }

    @Test
    public void wpClashTEST(){
        Enemy enemy  = new Enemy("Jim", 6, 6, 6, 5);
        Hero hero = new Hero("Jane", 9, 9, 9, 9, 12);
        BattleEngine battleTest = new BattleEngine();

        hero.addHero(hero);
        enemy.addEnemy(enemy);

        int expectedValue = 7;
        int actualValue = battleTest.wpClash();
        assertEquals("The value should be 7" , expectedValue , actualValue);
    }

    //stub
    @Test
    public void damageTEST(){
        BattleEngine battleTest = new BattleEngine();


        int expectedValue = 5;
        int actualValue = battleTest.damage();
    }
}
