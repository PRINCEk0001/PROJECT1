public class hierachical {
    // Hierarchical inheritance in Java
    class Animal {
        String name;
    }

    class Dog extends Animal {
        int age;

        void display() {
            System.out.println("Dog name is " + name);
        }
    }

    class Cat extends Animal {
        void display() {
            System.out.println("cat name is " + name);
        }
    }

    public static void main(String[] args) {
        hierachical h = new hierachical();
        Dog d1 = h.new Dog();
        Cat c1 = h.new Cat();

        d1.name = ("Tommy");
        d1.age = 6;
        d1.display();

        c1.name = ("Tom");
        c1.display();
    }
}
