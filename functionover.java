class functionload{
    void sum(int a){
        System.out.println("Sum of one number is: " + a);
    }
    void sum(int a, int b){
        System.out.println("Sum of two numbers is: " + (a+b));

    }
    void sum(int a, int b, int c){
        System.out.println("Sum of three numbers is: " + (a+b+c));
    }
    void sum(int a, int b, int c, int d){
        System.out.println("Sum of four numbers is: " + (a+b+c+d));
    }
    void sum(int a, int b, int c, int d, int e){
        System.out.println("Sum of five numbers is: " + (a+b+c+d+e));
    }
}
    

class functionover{
    public static void main(String[] args) {
        functionload obj = new functionload();
        obj.sum(10);
        obj.sum(10, 20);
        obj.sum(10, 20, 30);
        obj.sum(10, 20, 30, 40);
        obj.sum(10, 20, 30, 40, 50);

}
}