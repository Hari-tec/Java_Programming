class Hello
{
    public int i;

    public Hello(int no)
    {
        System.out.println("Inside Hello constructor");
        this.i = no+1;
    }

    public void Display()
    {
        System.out.println("Inside hello display");
    }
}
class Demo extends Hello
{
    public int i;

    public Demo(int a)
    {
        super(a);       //First use
        this.i = a;          
        System.out.println("Inside demo constructor");
    }

    public void Display()
    {
        int i = 0;
        System.out.println("Inside Display"+i);
        System.out.println("Inside Display"+this.i);     
        System.out.println("Inside Display"+super.i);    //Second use
        super.Display();                                 //Third use
    }
}

class SuperDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }
}