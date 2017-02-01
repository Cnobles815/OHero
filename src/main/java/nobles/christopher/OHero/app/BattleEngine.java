package nobles.christopher.OHero.app;

import nobles.christopher.OHero.io.Display;
import nobles.christopher.OHero.units.Enemy;
import nobles.christopher.OHero.units.Hero;

/**
 * Created by christophernobles on 9/23/16.
 */
public class BattleEngine {

    Hero hero;
    Enemy enemy;
    Display display;
//scroll to bottom for relic methods
    public int strClash(){
       return hero.heroList.get(0).getHeroStr() - enemy.enemyList.get(0).getEnemyStr();
    }

    public int spdClash(){
        return hero.heroList.get(0).getHeroSpd() - enemy.enemyList.get(0).getEnemySpd();
    }

    public int wpClash(){
        return hero.heroList.get(0).getHeroWp() - enemy.enemyList.get(0).getEnemyWp();
    }

    public int damage(){
        return 5;
    }
























    //public int heroStrCheck(){
     //   hero.heroList.get(0).getHeroStr() > enemy.enemyList.get(0).getEnemyStr() ?
     //           display.print(hero.heroList.get(0).getHeroName() + (" was overpowered! [-1HP]")) : display.print(hero.heroList.get(0).getHeroName() + (" overpowered " + enemy.enemyList.get(0).getEnemyName() + " dealing " + (hero.heroList.get(0).getHeroStr() - enemy.enemyList.get(0).getEnemyStr() + " damage!"));
   // }

//    public void heroStrCheck(int heroStrength, int enemyStrength){
//        if (heroStrength > enemyStrength){
//            int damage = heroStrength - enemyStrength;
//            display.print(hero.heroList.get(0).getHeroName() + " did " + damage + " damage!");
//            enemy.enemyList.get(0).enemyHpUp(-damage);
//            if (enemy.enemyList.get(0).getEnemyHp() <= 0){
//                display.print(hero.heroList.get(0).getHeroName() + " has slain " + enemy.enemyList.get(0).getEnemyName() + "!");
//            }
//        }
//
//        if (heroStrength < enemyStrength){
//            int damage = enemyStrength - heroStrength;
//            display.print(hero.heroList.get(0).getHeroName() + " was overpowered! Brute force won't work here! "+hero.heroList.get(0).getHeroName()+ " took" + damage + " damage!");
//            hero.heroList.get(0).heroHpUp(-damage);
//            if (hero.heroList.get(0).getHeroHp() <= 0){
//                display.print((char)27 +"[34m I knew you couldn't do this. That was pitiful.");
//            }
//        }
//    }

}
