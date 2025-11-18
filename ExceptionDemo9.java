import java.util.*;

class ExceptionDemo9
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10,20,30,40,50};
        int iIndex = 0,iData=0;

        System.out.println("Enter thr Index number :");
        iIndex = sobj.nextInt();
        try
        {

            System.out.println("Inside try block");
            iData = Arr[iIndex];   
        }
        catch(ArrayIndexOutOfBoundsException aobj)
        {
            System.out.println("Inside catch block");
        }
        catch(Exception aobj)
        {
             System.out.println("Inside generic catch block");  
        }
        finally
        {
            System.out.println("Inside finally");
        }

       System.out.println("Element at that Index is:"+Arr[iIndex]);
    }
}