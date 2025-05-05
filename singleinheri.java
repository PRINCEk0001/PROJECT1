// single inheritance in java   
class Parent {
    String color;

}

class Child extends Parent {
    void display() {
        System.out.println("color is "+color);
    }
}

class singleinheri{
    public static void main(String[] args) {
        Child c1 = new Child();
   c1.color=("red");
   c1.display();
        
    }



}