import myPackage.*;

public class prac9 {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];
        current [0] = new Balance("D. Monica", 268.79);
        current [1] = new Balance("H. Harrison", 968.21);
        current [2] = new Balance("K. Lucie", 142.33);

        for (int i = 0; i<3 ; i++) {
            current[i].show();
        }
    }
}
