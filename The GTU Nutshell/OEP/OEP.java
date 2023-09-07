import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeSet;

public class OEP {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 21BECEG102, 210410107077, SY CE2B /2022-23");
        try {
            File file = new File(args[0]);

            BufferedReader br = new BufferedReader(new FileReader(file));

            TreeSet<String> hashset = new TreeSet<String>();

            String line;
            while ((line = br.readLine()) != null) {
                String[] tmp = line.split("[\\s?,.;!]+");
                for (String string : tmp) {
                    hashset.add(string);
                }
            }

            for (String word : hashset) {
                System.out.println(word);
            }

            br.close();

        } catch (NullPointerException e) {
            System.out.println("Couldn't open file");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println("Couldn't open file");
        }
    }
}