class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run Method of :"+Thread.currentThread().getName());
    }
}
class ThreadUserDefinedJoinSerialAlive
{
    public static void main(String A[])
    {
        System.out.println("Inside a main thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");

        // Checked exception
        try
        {
        dobj1.start();
        System.out.println("Is first thread alive ? :"+dobj1.isAlive());
        dobj1.join();

        System.out.println("End os First Thread");

        System.out.println("Is first thread alive ? :"+dobj1.isAlive());

        dobj2.start();
        System.out.println("Is Second thread alive ? :"+dobj2.isAlive());
        dobj2.join();

        System.out.println("End os Second Thread");

        }
        catch(InterruptedException iobj)
        {
            
        }
        System.out.println("End of main thread");
    }
}