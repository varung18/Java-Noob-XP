// This practical shows the uses of "this" keyword.

class Student {
    int rollno;
    String name, course;
    float fee;
    Student (int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    } // Explaining the above method. All the variables which are with "this" keyword refers to the variables which are defined in the class.
    // While the variables which are alone are the entries from the passed argument.

    void display () {
        System.out.println (rollno + "  " + name + "  " + course + "  " + fee);
    }
}

public class prac8 {
    public static void main (String args[]) {
        Student s1 = new Student(117, "Ankit", "C++");
        Student s2 = new Student(753, "Tarun", "RUby on Rails");
        s1.display();
        s2.display();
    }   
}
