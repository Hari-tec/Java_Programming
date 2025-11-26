interface Demo 
{
    int no = 11;
    void Display();
    
}

class Hello implements Demo
{
    //Error
}
class InterfaceDemo1
{
    public static void main(String a[])
    {
        Hello hobj = new Hello();
    }
}