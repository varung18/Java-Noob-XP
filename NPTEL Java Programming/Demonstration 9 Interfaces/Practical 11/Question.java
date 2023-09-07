import myInterface.*;
import java.util.Random;

class Question implements SharedContents {
    Random rand = new Random();
    int ask () {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30) {
            return NO;
        } else if (prob<60){
            return YES;
        } else if (prob < 75) {
            return LATER;
        } else if (prob <90){
            return SOON;
        } else { return NEVER;}
    }
}
