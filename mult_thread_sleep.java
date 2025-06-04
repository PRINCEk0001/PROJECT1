
     class mythread extends Thread{
    public void run(){
        System.out.println("Hello");
        try{
            Thread.sleep(4000);
        }
        catch(Exception e){
        
        }
        System.out.println("hiii");
    }
  }
  public class mult_thread_sleep{
    public static void main(String[] args){
        System.out.println("Hello world");
        mythread t = new mythread();
        t.start();
    }
  } 
