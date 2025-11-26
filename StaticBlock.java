class Demo
{
    public int i;             //Instance Varable
    static public int j;  //class varable

    static
    {
        j = 21;
    }

    public Demo()
    {
        this.i = 11;
    }

    public void fun()        //instance method
    {
        System.out.println("fun i :"+this.i);
        System.out.println("fun j :"+Demo.j);
    }

    public static void gun()         //Class Method
    {
       // System.out.println("fun i :"+this.i);   //NA
        System.out.println("fun j :"+Demo.j);
    }


}
class StaticBlock
{
    public static void main(String A[])
    {
        Demo.gun();
        System.out.println(Demo.j);

        Demo dobj = new Demo();

        System.out.println((dobj.i));
        dobj.fun();
    }
}