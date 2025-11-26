class ThreadPriority
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");

        Thread tobj = Thread.currentThread();
        String name = tobj.getName();
        System.out.println("Name os current Thread is :"+name);

        int Priority = tobj.getPriority();
        System.out.println("Priority of current Thread is :"+Priority);
        
        tobj.setPriority(10);
        Priority = tobj.getPriority();
        System.out.println("Priority of current Thread is :"+Priority);
    }
}