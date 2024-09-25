// interface
interface Animal {
    void sound(); 
    void eat();  
}


class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats dog food");
    }
}


class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats cat food");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Output: Dog barks
        myDog.eat();   // Output: Dog eats dog food

        myCat.sound(); // Output: Cat meows
        myCat.eat();   // Output: Cat eats cat food
    }
}

