public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // TODO: Add the introduce() method here
    // It should print "Hello, I am a person"
    public void introduce() {
        System.out.println("Hello, I am a person");
    }
}

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    // TODO: Override the introduce() method here
    // It should print "Hello, I am a student"
    @Override
    public void introduce() {
        System.out.println("Hello, I am a student");
    }
}

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    // TODO: Override the introduce() method here
    // It should print "Hello, I am a teacher"
    @Override
    public void introduce() {
        System.out.println("Hello, I am a teacher");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Student("Alice", 30);
        Person person2 = new Teacher("Bob", 25);

        // TODO: Call the introduce() method for the Student object
        person1.introduce();

        // TODO: Call the introduce() method for the Teacher object
        person2.introduce();
    }
}