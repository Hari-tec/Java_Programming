interface  A 
{
    int no = 11;
    void fun();
    private void display()
    {
        System.out.println("inside private display");
    }
    default void gun()
    {
        System.out.println("inside gun");
        display();
    }

   
    
}

class Demo implements A     //multiple inheritance
{
    public void fun()
    {
        System.out.println("inside fun"); 
    }
     
}
class InterfaceDemo9
{
    public static void main(String a[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
       // dobj.display();    //Error
        
    }
}