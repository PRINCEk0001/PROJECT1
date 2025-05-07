// abstract class payment{
//     abstract void pay();
//     void success(){
//         System.out.println("pay done");
//     }
// }
// class abstractclass {
//     public static void main(String[] args) {
        
        
        
//     }
// }



// Abstract class
abstract class Animal {
    // Abstract method (no body)
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Concrete subclass
class Dog extends Animal {
    // Implementing the abstract method

    public void makeSound() {
        System.out.println("Woof woof!");
    }
}

// Another concrete subclass
class Cat extends Animal {
    // Implementing the abstract method
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class to demonstrate
public class AbstractClassExample {
    public static void main(String[] args) {
        // Cannot instantiate Animal
        // Animal myAnimal = new Animal(); // This would cause a compilation error

        // Can instantiate subclasses
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.makeSound(); // Output: Woof woof!
        myDog.sleep();     // Output: This animal is sleeping.

        myCat.makeSound(); // Output: Meow!
        myCat.sleep();     // Output: This animal is sleeping.
    }
}
