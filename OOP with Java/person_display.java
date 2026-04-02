// TODO: Define the Person class
//  - Create private data members 'name' and 'age'
//  - Implement a no-argument constructor that initializes name to "Unknown" and age to 0
//  - Implement a constructor that initializes both data members
//  - Implement a copy constructor with a 'Person' parameter
//  - Implement a 'display' method that prints 'name' and 'age'

public class Person {
    // Implement the class here according to the TODO comments.
    private String name;
    private int age;
    
    public Person(){
        this.name = "Unknown";
        this.age = 0;
    }
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public Person(Person p){
        this.name = p.name;
        this.age = p.age;
    }
    
    public void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Person object using the no-argument constructor
        Person p1 = new Person();
        // TODO: Call the 'display' method on this object to print the details
        p1.display();
        // TODO: Create a Person object with name "Alice" and age 30
        Person p2 = new Person("Alice", 30);
        // TODO: Call the 'display' method on this object to print the details
        p2.display();
        // TODO: Create a copy of an object using the copy constructor
        Person p3 = new Person(p1);
        // TODO: Call the 'display' method on the copied object to print the details
        p3.display();
    }
}