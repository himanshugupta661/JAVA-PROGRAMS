class Person {

    String name = "Person";

    void introduce() {
        System.out.println("I am a person.");
    }
}

class Swami extends Person {

    String name = "Swami Vivekanand";

    @Override
    void introduce() {
        System.out.println("I am a swami Vivekanand.");
    }

    void display() {
        System.out.println("Parent class name:" + super.name);
        super.introduce();
        System.out.println("child class name:" + name);
    }
}

class Student extends Person {

    @Override
    void introduce() {
        System.out.println("I am a student inspired by Swami Vivekanand:");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Swami s = new Swami();
        s.display();

        Person p;

        p = new Swami();
        p.introduce();

        p = new Student();
        p.introduce();
    }
}
