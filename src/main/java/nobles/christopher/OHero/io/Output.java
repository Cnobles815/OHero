package nobles.christopher.OHero.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zipcoder on 1/30/17.
 */
public abstract class Output {

    private static FileWriter toFile;

    static {
        try {
            toFile = new FileWriter("test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileWrite(String output) throws IOException{
        String temp = output;
        toFile = new FileWriter("test.txt");
        toFile.write(temp + String.format("%n") + String.format("%n"));
        toFile.flush();
        toFile.close();
    }

    public static void fileWriteStringNoNewLine(String output) throws IOException{
        String temp = output;
        toFile = new FileWriter("test.txt");
        toFile.write(temp);
        toFile.flush();
        toFile.close();
    }

    public static void fileWrite(Integer output) throws IOException {
        Integer temp = output;
        toFile = new FileWriter( "test.txt");
        toFile.write(temp + String.format("%n") + String.format("%n"));
        toFile.flush();
        toFile.close();
    }

    public static void fileWriteStringNoNewLine(Integer output) throws IOException{
        Integer temp = output;
        toFile = new FileWriter( "test.txt");
        toFile.write(temp + String.format("%n") + String.format("%n"));
        toFile.flush();
        toFile.close();
    }

}
