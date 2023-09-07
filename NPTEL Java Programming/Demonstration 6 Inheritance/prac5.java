/* Code sharing thorugh super concept */

class Cat {
    void speak () {
        System.out.println("Nyoooom! ");
    }
}

class PetCat extends Cat {
    void speak () {
        System.out.println("Yo Meow Nigga!  ");
    }
}

class MagicCat extends Cat {
    static boolean noOne;

    void speak () {
        if (noOne) {
            super.speak();
        } else {
            System.out.println("Hello Brainchild!");
        }
    }
}

public class prac5 {
    public static void main (String args[]) {
        PetCat c1 = new PetCat();
        MagicCat c2 = new MagicCat();
        c2.noOne = true;
        c2.speak();
        c1.speak();
        c2.noOne = false;
        c2.speak();
    }
}
