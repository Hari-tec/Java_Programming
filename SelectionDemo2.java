import java.util.Scanner;
class SelectionDemo2
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);
        int istd = 0;

        System.out.println("Enter your Standard : ");
        istd = sobj.nextInt();

        if(istd ==1)
        {
            System.out.println("Exam is at 9 AM");
        }
        else if(istd == 2)
        {
            System.out.println("Exam is at 10 AM");
        }
        else if(istd == 3)
        {
            System.out.println("Exam is at 11 AM");
        }
        else if(istd == 4)
        {
            System.out.println("Exam is at 12 PM");
        }
        else
        {
            System.out.println("Invalid Standard");
        }
        

    }
}