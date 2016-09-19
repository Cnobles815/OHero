package nobles.christopher.OHero;

/**
 * heroStr = Strength, hp = Health Points, spd = Speed, en = Energy
 */
public class Hero {
    String heroName = "";
    int heroStr = 0;
    int heroHp = 0;
    int heroSpd = 0;
    int heroEn = 0;


   public Hero (String name, int strength, int healthPoints, int speed, int energy) {
        this.heroName = name;
        this.heroStr = strength;
        this.heroHp = healthPoints;
        this.heroSpd = speed;
        this.heroEn = energy;
    }

    Hero () {
        String heroName = "Booster Gold";
        int heroStr = 0;
        int heroHp = 0;
        int heroSpd = 0;
        int heroEn = 0;
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

    public int heroLevel() {

        int level = this.getHeroEn() + this.getHeroSpd() + this.getHeroHp() + this.getHeroStr();

        return level;
    }



}
