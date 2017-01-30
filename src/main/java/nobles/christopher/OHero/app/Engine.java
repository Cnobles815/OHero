package nobles.christopher.OHero.app;

import nobles.christopher.OHero.io.Menus;
import nobles.christopher.OHero.units.Hero;
import nobles.christopher.OHero.units.HeroActions;

/**
 * Created by christophernobles on 9/19/16.
 */
public class Engine {

    Hero hero;
    HeroActions heroActions = new HeroActions();



    public void opening() {
        Menus.opening();
    }


}
