class Demo
{
    public int i;
    public static int j;

    static
    {
        j = 21;
    }
    public Demo()
    {
        this.i = 11;          //First use
        System.out.println("Inside default constructor");
    }

    public Demo(int a)
    {
        this();          //Second use
        System.out.println("Inside parametrsied constructor");
        
    }

    public void Display()
    {
        System.out.println("Inside Display"+this.i);     //Third use
    }
}

class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }
}