package Exception_throw_throws;


import javax.sound.midi.Soundbank;

class MycustExcep extends Exception {
    public MycustExcep(String msg) {
        super(msg);

    }
}
 class Custom_Exception{
    static void empage(int age) throws MycustExcep
    {
        if(age<18)
            throw new MycustExcep("child labour");
        else
            System.out.println("Employeer");
    }

    public static void main(String[] args) {
        try
        {
            empage(12);
        }
        catch(MycustExcep e)
        {
            System.out.println("Child labouor");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
