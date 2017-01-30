package nobles.christopher.OHero.units;

import java.util.ArrayList;


/**
 * heroStr = Strength, hp = Health Points, spd = Speed, en = Energy
 */
public class Hero {
    String heroName = "";
    int heroStr = 0;
    int heroHp = 0;
    int heroSpd = 0;
    int heroEn = 0;
    int heroWp = 0;

    public static ArrayList<Hero> heroList = new ArrayList<Hero>();

   public static Hero addHero(Hero hero){
        heroList.add(hero);
        return hero;
    }




    public Hero (String name, int strength, int healthPoints, int speed, int energy, int willpower) {
        this.heroName = name;
        this.heroStr = strength;
        this.heroHp = healthPoints;
        this.heroSpd = speed;
        this.heroEn = energy;
        this.heroWp = willpower;
    }

    Hero () {
        String heroName = "Booster Gold";
        int heroStr = 0;
        int heroHp = 0;
        int heroSpd = 0;
        int heroEn = 0;
        int heroWp = 0;
    }



    public int getHeroStr(){
        return this.heroStr;
    }

    public int getHeroHp(){
        return this.heroHp;
    }

    public int getHeroSpd(){
        return this.heroSpd;
    }

    public int getHeroEn(){
        return this.heroEn;
    }

    public int getHeroWp() {return this.heroWp; }

    public String getHeroName() {return this.heroName;}

    public void setHeroStr(int change){
        this.heroStr = change;
    }

    public void setHeroHp(int change){
        this.heroHp = change;
    }

    public void setHeroSpd(int change){
        this.heroSpd = change;
    }

    public void setHeroEn(int change){
        this.heroEn = change;
    }

    public void setHeroWp(int change) {this.heroWp = change; }

    public int heroLevel() {
        int level = this.getHeroEn() + this.getHeroSpd() + this.getHeroHp() + this.getHeroStr() + this.getHeroWp();

        return level;
    }

    public int heroStrUp(int amountIncrease) {
        int levelUp = getHeroStr() + amountIncrease;

        setHeroStr(levelUp);

        return (levelUp);
    }



    public int heroEnUp(int amountIncrease) {
        int levelUp = getHeroEn() + amountIncrease;

        setHeroEn(levelUp);

        return levelUp;
    }

    public int heroSpdUp(int amountIncrease) {
        int levelUp = getHeroSpd() + amountIncrease;

        setHeroSpd(levelUp);

        return levelUp;
    }

    public int heroHpUp(int amountIncrease) {
        int levelUp = getHeroHp() + amountIncrease;

        setHeroHp(levelUp);

        return levelUp;
    }

    public int heroWpUp(int amountIncrease) {
        int levelUp = getHeroWp() + amountIncrease;

        setHeroWp(levelUp);

        return levelUp;
    }





}
