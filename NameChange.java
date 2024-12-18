package Exception_throw_throws;
class firstMethod extends  Thread{
    public void run(){
        Thread.currentThread().setName("First Thread");
        System.out.println("The Name Change of thread is "+Thread.currentThread().getName());
    }
}

class secondMethod extends  Thread{
    public void run(){
        Thread.currentThread().setName("second Thread");
        System.out.println("The Name Change of thread is "+Thread.currentThread().getName());
        }
        }
public class NameChange {
    public static void main(String[] args) {
        Thread.currentThread().setName("Main Thread");
        System.out.println("The Name Change of thread is "+Thread.currentThread().getName());
        firstMethod ff = new firstMethod();
        secondMethod dd = new secondMethod();
        ff.start();
        dd.start();

    }
}
