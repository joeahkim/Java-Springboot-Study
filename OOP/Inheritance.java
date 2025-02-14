package OOP;

// Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();
    }
}
