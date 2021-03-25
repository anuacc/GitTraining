package session1;

public class Person {

    Person() {


    }

    Person(String pname, String pgender, int page, int pweight, String pcolor) {

        name = pname;
        gender = pgender;
        age = page;
        weight = pweight;
        color = pcolor;


    }
    //Instance variables which can be used by the objects
    //Remember these variables are inside the class but outside of any methods

    int height;
    int age;
    String name;
    String gender;
    int weight;
    String color;

    public void run() {
        System.out.println("I can run ");
    }

    public void walk() {
        System.out.println("I can walk ");
    }

    public void sleep() {
        System.out.println("I can sleep ");
    }

    public void talk() {
        System.out.println("I can talk ");
    }

    public void eat() {
        System.out.println("I can eat ");
    }

    //Static method that can be called without requiring an object
    static void staticmethod() {
        System.out.println("Am a static method ");
    }


    public void printStudentDetail() {

        System.out.println("Your Name is :"+name+ "\t your age is :" +age+"\t Your color is :"+color+"\t Your height is :"+height);

    }
}