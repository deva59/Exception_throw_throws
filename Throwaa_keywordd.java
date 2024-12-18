package Exception_throw_throws;

public class Throwaa_keywordd {

    public static void check(int a, int b)throws ArithmeticException
    {
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        Throwaa_keywordd th =new Throwaa_keywordd();
        try {
            check(4, 0);
        }
        catch(Exception e)
        {
            System.out.println(" Exception occcurs");
        }
        }
}
