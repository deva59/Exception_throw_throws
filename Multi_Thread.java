package Exception_throw_throws;


class  firstThread extends Thread{
    public  void run(){
        Thread.currentThread().setName("First");
        System.out.println("Thread Name is "+Thread.currentThread().getName());
    }
}

class secondThread extends  Thread{
    public void run(){
        Thread.currentThread().setName("Second");
        System.out.println("Thread Name is "+Thread.currentThread().getName());
    }
}

public class Multi_Thread {
    public static void main(String[] args) {
        firstThread ff = new firstThread();
        secondThread th = new secondThread();
        ff.start();
        th.start();
    }
}