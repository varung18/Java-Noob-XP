//Attempting to create an object of interface

public class prac2 {
    public static void main(String[] args) {
        C c = new C(); //ERROR: Since interface is an abstract,
        // Object cannot be created
        
        C c2;  //Ok: Declaration of object is possible

        C c3[] = new C[3]; //This is also OK: declaration of 
        //array of objects for an interface is permitted.
    }
}
