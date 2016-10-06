package nobles.christopher.OHero;
import java.util.ArrayList;

/**
 * Created by christophernobles on 9/25/16.
 */
public class Enemy {
    int enemyStr = 0;
    int enemyWp = 0;
    int enemySpd = 0;
    int enemyHp = 0;
    String enemyName;

    //lololololPUBLIC ENEMY. Wonder if I can work in a 'state property' reference
    public Enemy(String name, int strength, int healthPoints, int speed, int willpower){
        this.enemyName = name;
        this.enemyStr = strength;
        this.enemyHp = healthPoints;
        this.enemySpd = speed;
        this.enemyWp = willpower;

    }

    public static ArrayList<Enemy> enemyList = new ArrayList<Enemy>();

    static Enemy addEnemy(Enemy enemy){
        enemyList.add(enemy);
        return enemy;
    }


    Enemy () {
        String enemyName = "Booster Gold";
        int enemyStr = 0;
        int enemyHp = 0;
        int enemySpd = 0;
        int enemyWp = 0;
    }

    public int getEnemyStr(){
        return this.enemyStr;
    }

    public int getEnemyHp(){
        return this.enemyHp;
    }

    public int getEnemySpd(){
        return this.enemySpd;
    }

    public int getEnemyWp() {return this.enemyWp; }

    public String getEnemyName() {return this.enemyName;}

    public void setEnemyStr(int change){
        this.enemyStr = change;
    }

    public void setEnemyHp(int change){
        this.enemyHp = change;
    }

    public void setEnemySpd(int change){
        this.enemySpd = change;
    }

    public void setEnemyWp(int change) {this.enemyWp = change; }

    public int enemyLevel() {
        int level =  this.getEnemySpd() + this.getEnemyHp() + this.getEnemyStr() + this.getEnemyWp();

        return level;
    }

    public int enemyStrUp(int amountIncrease) {
        int levelUp = getEnemyStr() + amountIncrease;

        setEnemyStr(levelUp);

        return (levelUp);
    }

    public int enemySpdUp(int amountIncrease) {
        int levelUp = getEnemySpd() + amountIncrease;

        setEnemySpd(levelUp);

        return levelUp;
    }

    public int enemyHpUp(int amountIncrease) {
        int levelUp = getEnemyHp() + amountIncrease;

        setEnemyHp(levelUp);

        return levelUp;
    }

    public int enemyWpUp(int amountIncrease) {
        int levelUp = getEnemyWp() + amountIncrease;

        setEnemyWp(levelUp);

        return levelUp;
    }
}
