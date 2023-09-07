/* A simple package: Utitlization of package in any java applicaiton */

package myPackage; //Adding another class into myPackage

public class Balance {
    public String name;
    public double bal;

    public Balance (String n, double b) {
        name = n;
        bal = b;
    }

    protected void show () {
        if(bal<0) {
            System.out.println("Sorry! Negative balance");
        }
        else {
            System.out.println(name + ":  $ " + bal);
        }
    }
}
