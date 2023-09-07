/*
Write a program that solves the following equation
and displays the value x and y:
1) 3.4x+50.2y=44.5
2) 2.1x+.55y=5.9
(Assume Cramer’s rule to solve equation
ax+by=e x=ed-bf/ad-bc
cx+dy=f y=af-ec/ad-bc )
*/

public class prac1b {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE-2B/ 2022-23");
        double a1 = 3.4, b1 = 50.2, c1 = 44.5, a2 = 2.1, b2 = .55, c2 = 5.9;

        double x = (c1 * b2 - b1 * c2) / (a1 * b2 - b1 * a2);
        double y = (a1 * c2 - c1 * a2) / (a1 * b2 - b1 * a2);

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}