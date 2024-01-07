
//Multithreading examples practise
//Implemented using runnable
public class MyThread {


  public static class newThread implements Runnable{


      @Override
      public void run() {
          System.out.println("This is a task running in a seperate thread");
      }

  }


    public static void main(String [] args){
           Runnable runnable=new newThread();
           Thread thread=new Thread(runnable);
           thread.start();
        System.out.println("Hello");
    }


}
