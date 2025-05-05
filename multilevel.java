// Multilevel inheritance in Java
class Animal {
    String name;

}

class Dog extends Animal {
    int age;

    void display() {
        System.out.println("Dog name is " + name);
    }
}

class Cat extends Dog {
    void display() {
        System.out.println("cat name is " + name +  " and age is " + age);
    }
}

public class multilevel {

    public static void main(String[] args) {
        Cat c1 = new Cat();

        c1.name = ("Tom");
        c1.age = 6;
        c1.display();
    }
}
