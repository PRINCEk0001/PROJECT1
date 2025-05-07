// problem 1:Create an abstract class 'Shape' with an abstract method 'area()'. Implement two subclasses
//'Circle' and 'Rectangle'.
abstract class Shape {
    Shape() {
        System.out.println(" Im a constructor of shape class");
        

    }
    abstract void area();
}
    class Circle extends Shape {
        int r = 5;
        void area() {
            System.out.println("Area of circle is " + (3.14 * r * r));
        }
    }   
    class Rectangle extends Shape {
        int l = 5;
        int width=10;
        void area() {
            System.out.println("Area of rectangle is " + (l*width));
        }
    }  

public class abstract_problem1 {
    public static void main(String[] args) {
        Shape s = new Circle();
        Shape s2= new Rectangle();
        s.area();
        s2.area();
    }

}
