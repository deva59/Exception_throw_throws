package Exception_throw_throws;
import  java.util.*;
 class Thowrss {

    public void votecheck(int age) {
        if (age < 18)
            throw new ArithmeticException("Person is not valid for vote");
        else
            System.out.println("Valid for vote");
    }

    public static void main(String args[]) {
        int age;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a age of a person= ");
        age = x.nextInt();
        try {
            Thowrss ll = new Thowrss();
            ll.votecheck(age);
        }catch (Exception e){
            System.out.println("Invalid age");
        }
    }
}