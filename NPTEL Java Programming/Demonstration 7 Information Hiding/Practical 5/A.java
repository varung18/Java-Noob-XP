/* Example 5 of public access modifier */

class A {
    public int data = 13;
    public void msg() {
        System.out.println ("Class A: Hello Java!");
    } //This class is not accessible to any file which belongs to other directories
}
// By creating separate file for class, we can specify the scope of the class.