// Superclass
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }

  void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

// Main class
public class SuperKeywordExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        myDog.displayInfo();
        myDog.sound();
    }
}
