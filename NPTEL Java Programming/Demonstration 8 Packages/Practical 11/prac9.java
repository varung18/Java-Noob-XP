/* Derive a sub-class in a program to be run */

import myPackage.Balance;

class Savings extends Balance {
    String branch;
    int customerID;
    Savings (String n, double bal, String br, int id) {
        super (n, bal);
        branch = br;
        customerID = id;
    }
    public void show () {
        if(bal<0) {
            System.out.println("Sorry! Negative balance");
        }
        else {
            System.out.println(name + ":  $ " + bal + "   " + branch + "  " + customerID);
        }
    }
}

public class prac9 {
    public static void main(String[] args) {
        Savings current[] = new Savings[3];
        current [0] = new Savings("D. Monica", 268.79, "Gandhinagar", 718);
        current [1] = new Savings("H. Harrison", 968.21, "Jhansi", 488);
        current [2] = new Savings("K. Lucie", 142.33, "New Delhi", 967);

        for (int i = 0; i<3 ; i++) {
            current[i].show();
        }
    }
}
