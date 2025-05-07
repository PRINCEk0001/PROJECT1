// problem2: Create an abstract class 'Animal' with method 'sound()'. Create classes 'Dog' and 'Cat' that extend
// it and implement the sound method.
abstract class Animal{
    Animal(){
        System.out.println("Im a Constructor of Animal class");
    }
    abstract void sound();

}
class dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{

    void sound()
  {
        System.out.println("Cat meows");
    }


}
public class Abstract_problem2 {
    public static void main(String[] args) {
        Animal a=new dog();
        a.sound();
        Animal a1=new Cat();
        a1.sound();
    }
    
}
