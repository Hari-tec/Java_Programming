class Demo
{
    public int i;             //Instance Varable
    static public int j;  //class varable

    static
    {
        System.out.println("inside Static Block");

        j = 21;
    }

    

    public Demo()
    {
        this.i = 11;
       System.out.println("inside Constructor");
    } 



}
class Blocks
{
    public static void main(String A[])
    {
           
        System.out.println("inside Main");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();

       
    }
}