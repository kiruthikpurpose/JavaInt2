class Person3 {
    private String name;
    private int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Person Name: " + name + " Updated, Age: " + age);
    }

    public void updateAge() {
        this.age++;
    }
}

class PersonProcessor3 {
    public Person3 updatePerson(Person3 person) {
        person.updateAge();
        return person;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Person3 alice = new Person3("Alice", 25);
        PersonProcessor3 processor = new PersonProcessor3();
        Person3 updatedAlice = processor.updatePerson(alice);
        updatedAlice.displayDetails();

        Person3 bob = new Person3("Bob", 30);
        Person3 updatedBob = processor.updatePerson(bob);
        updatedBob.displayDetails();

        Person3 charlie = new Person3("Charlie", 40);
        Person3 updatedCharlie = processor.updatePerson(charlie);
        updatedCharlie.displayDetails();
    }
}
