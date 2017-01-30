package nobles.christopher.OHero.file_handling;

import java.io.File;

/**
 * Created by zipcoder on 1/30/17.
 */
public class DirectoryGenerator {

    public static void createDirectory(String input) {
        String dirname = input;
        File newDirectory = new File(dirname);

        // Create directory now.
        newDirectory.mkdirs();
    }

    public static void createFile(String input){

    }

}
