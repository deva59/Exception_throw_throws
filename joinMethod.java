package Exception_throw_throws;
class firstMethod2 extends  Thread{
    public void run(){
        Thread.currentThread().setName("First Thread");
        System.out.println("The Name Change of thread is "+Thread.currentThread().getName());
    }
}

class secondMethod2 extends  Thread{
    public void run(){
        Thread.currentThread().setName("second Thread");
        System.out.println("The Name Change of thread is "+Thread.currentThread().getName());
    }
}
public class joinMethod {
    public static void main(String[] args) {
        Thread.currentThread().setName("Main Thread");
        System.out.println("The Name Change of thread is "+Thread.currentThread().getName());

        firstMethod2 ff = new firstMethod2();
        secondMethod2 ss = new secondMethod2();

        try{
            ff.start();
            ff.join();
            ss.start();
        }
        catch (Exception e){

        }

    }
}
