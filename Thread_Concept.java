package Exception_throw_throws;

public class Thread_Concept extends  Thread {

    public void run(){
        System.out.println("The First Thread Is Created"+Thread.currentThread().getName());
    }

    public static void main(String[] args){
        System.out.println("Second thread gerneetd");
        Thread_Concept vv = new Thread_Concept();
        vv.start();
}
}
