public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // TODO: Update the setAge method to reject negative values
    public void setAge(int age) {
      if (age >= 0) {
        this.age = age;
      } else {
        this.age = 0;
    }
}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Person object with a negative age
        Person person = new Person("Alice", 30);
        person.setAge(-30);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());

        person.setName("Bob");
        person.setAge(25);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}