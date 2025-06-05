package demo;
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound(); 
        myCat.makeSound();  
        myDog.eat();       
        myCat.eat();       
    }
}

