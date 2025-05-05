interface Interface1 {
    int age = 20;
}

interface Interface2 extends Interface1 {
    int name = 101;
}

interface Interface3 extends Interface1 {
    int rollno = 1001;
}

// Hybrid Inheritance using interfaces
class Interface4 implements Interface2, Interface3 {
    void display() {
        System.out.println("id is " + age + ", name is " + name + ", rollno is " + rollno);
    }
}

public class hybrid {
    public static void main(String[] args) {
        Interface4 i1 = new Interface4();
        i1.display();  // Output: id is 20, name is 101, rollno is 1001
    }
}
