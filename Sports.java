//package quiz2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Sports {
    ArrayList<Icehockey> icehockey = new ArrayList<Icehockey>();
    ArrayList<Handball> handball = new ArrayList<Handball>();
    ArrayList<Basketball> basketball = new ArrayList<Basketball>();
    ArrayList<Volleyball> volleyball = new ArrayList<Volleyball>();
    public static String[] words;

    public  String[] readFile(String path) {
        try {
            int i = 0;
            int length = Files.readAllLines(Paths.get(path)).size();
            String[] results = new String[length];
            for (String line : Files.readAllLines(Paths.get(path))) {
                results[i++] = line;
            }
            return results;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /*Maç Sonucu ArrayListi Oluşturduğumuz Bölüm*/
    public ArrayList<ArrayList<ArrayList<String>>> filereader(String file){
        ArrayList<ArrayList<String>> icehockeyy = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> handballl = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> basketballl = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> volleyballl = new ArrayList<ArrayList<String>>();
        String[] lines = readFile(file);
       ArrayList<ArrayList<ArrayList<String>>> returning = new ArrayList<ArrayList<ArrayList<String>>>();

        for (String line : lines) {
            ArrayList<String> result = new ArrayList<String>();
            words = line.split("\t");
            Pattern pattern = Pattern.compile("\t");
            words = pattern.split(line);

            switch (words[0]) {
                case "I":
                    result.add(words[1]);
                    result.add(words[3].split(":")[0]);
                    result.add(words[2]);
                    result.add(words[3].split(":")[1]);
                    icehockeyy.add(result);
                    break;

                case "H":
                    result.add(words[1]);
                    result.add(words[3].split(":")[0]);
                    result.add(words[2]);
                    result.add(words[3].split(":")[1]);
                    handballl.add(result);
                    break;

                case "B":
                    result.add(words[1]);
                    result.add(words[3].split(":")[0]);
                    result.add(words[2]);
                    result.add(words[3].split(":")[1]);
                    basketballl.add(result);
                    break;

                case "V":
                    result.add(words[1]);
                    result.add(words[3].split(":")[0]);
                    result.add(words[2]);
                    result.add(words[3].split(":")[1]);
                    volleyballl.add(result);
                    break;
            }
        }
        returning.add(icehockeyy);
        returning.add(handballl);
        returning.add(basketballl);
        returning.add(volleyballl);
        return returning;
    }
}
