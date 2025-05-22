// Q3. Create an interface Animal with a method makeSound().
// Then, create a class Dog that implements Animal and overrides makeSound() to print "Bark".
// In the main method, use the interface reference to call the method from Dog
interface Animal{
    void makeSound(String sound);
}
class Dog implements Animal{
    public void makeSound(String sound){
        System.out.println("Animal makes sound  :"+sound);
    }
}
public class problem3 {
    public static void main(String[] args) {
    
        Animal d=new Dog();
        d.makeSound("Bark");

    }
    
}
