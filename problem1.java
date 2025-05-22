interface Runnable{
   void walk(int a);
   void run(int b);

}
interface Walkable {
    void walk(int c);
   void run(int d);

}
class human implements Runnable,Walkable{
    public void walk(int a){
        System.out.println("walk "+a);
    }
  public  void run(int b){
        System.out.println("run "+b);
    }
     


}
class problem1{
    public static void main(String[] args) {
        human h=new human();
        h.walk(10);
        h.run(20);
        h.walk(30);
        h.run(40);
    }

}