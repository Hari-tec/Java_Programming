class Base  //8
{
    public int i,j;

    public void Fun()
    {
        System.out.println("Inside Base Fun");
    }
}
class Derived extends Base  //12
{
    public int x;

    public void Gun()
    {
        System.out.println("Inside Derived Gun");
    }
}
class Single
{
    public static void main(String A[])
    {
        Base bobj = new Base();
        Derived dobj = new Derived();

        bobj.Fun();
        
        dobj.Fun();
        dobj.Gun();
    }
}