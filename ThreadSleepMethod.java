package Exception_throw_throws;




class firstMethod1 extends  Thread{

    public void  run(){

        int i;
        String str="Devendra";
        for(i=0; i<=str.length();i++)
            try {
                Thread.sleep(2000);
                System.out.print(str.charAt(i)+" ");
            }catch (Exception e){

            }

    }
}

class secondMethod1 extends  Thread{

    public void  run(){
        int i;
        for(i=1; i<=10;i++)
            System.out.println(i*3);
    }
}


//ThreadSleepMethod it is use Animantion or delay
public class ThreadSleepMethod {
    public static void main(String[] args) {
        firstMethod1 ff = new firstMethod1();
        secondMethod1 ss = new secondMethod1();
        ff.start();

 try{
   Thread.sleep(1800);
        ss.start();
     ss.join();
   }catch(Exception e){}


}
}
