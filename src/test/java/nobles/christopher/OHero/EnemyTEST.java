package nobles.christopher.OHero;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 10/6/16.
 */
public class EnemyTEST {

    @Test
    public void enemyLevelTEST(){
        Enemy enemy  = new Enemy("Bob", 5, 5, 5, 5);
        int expectedValue = 20;
        int actualValue = enemy.enemyLevel();
        assertEquals("The value should be 16" , expectedValue , actualValue);
    }

    @Test
    public void getEnemyNameTEST(){
        Enemy enemy  = new Enemy("Bob", 5, 5, 5, 5);
        String expectedValue = "Bob";
        String actualValue = enemy.getEnemyName();
        assertEquals("The name should be Bob" , expectedValue , actualValue);
    }

    @Test
    public void getEnemyHPTEST(){
        Enemy enemy = new Enemy("Bob", 5, 6, 5, 5);
        int expectedValue = 6;
        int actualValue = enemy.getEnemyHp();
        assertEquals("The value should be 6", expectedValue , actualValue);
    }

    @Test
    public void getEnemySTRTEST(){
        Enemy enemy = new Enemy("Bob", 6, 5, 5, 5);
        int expectedValue = 6;
        int actualValue = enemy.getEnemyStr();
        assertEquals("The value should be 6", expectedValue , actualValue);
    }

    @Test
    public void getEnemySPDTEST(){
        Enemy enemy = new Enemy("Bob", 5, 5, 6, 5);
        int expectedValue = 6;
        int actualValue = enemy.getEnemySpd();
        assertEquals("The value should be 6", expectedValue , actualValue);
    }

    @Test
    public void getEnemyWPTEST(){
        Enemy enemy = new Enemy("Bob", 5, 5, 5, 6);
        int expectedValue = 6;
        int actualValue = 6;
        assertEquals("The value should be 8" , expectedValue , actualValue);

    }

    @Test
    public void enemySTRUpTEST(){
        Enemy enemy = new Enemy("Bob", 6, 5, 5, 5);
        int expectedValue = 8;
        int actualValue = enemy.enemyStrUp(2);
        assertEquals("The value should be 8" , expectedValue , actualValue);
    }

    @Test
    public void heroSPDUpTEST(){
        Enemy enemy = new Enemy("Bob", 5, 5, 6, 5);
        int expectedValue = 8;
        int actualValue = enemy.enemySpdUp(2);
        assertEquals("The value should be 8" , expectedValue , actualValue);
    }

    @Test
    public void enemyHPUpTEST(){
        Enemy enemy = new Enemy("Bob", 5, 6, 5, 5);
        int expectedValue = 8;
        int actualValue = enemy.enemyHpUp(2);
        assertEquals("The value should be 8" , expectedValue , actualValue);
    }

    @Test
    public void enemyWpUpTEST(){
        Enemy enemy = new Enemy("Jim", 5, 5, 5, 6);
        int expectedValue = 8;
        int actualValue = enemy.enemyWpUp(2);
        assertEquals("The value should be 8" , expectedValue , actualValue);
    }
}





