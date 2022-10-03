import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the password Generator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the password: ");
        int length = input.nextInt();
        System.out.println("The Length of the password given is:" + length  + " Characters long ");
        String Upper =("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String Lower =("abcdefghijklmnopqrstuvwxyz");
        String Num = ("0123456789");
        String Combination = (Upper+Lower+Num);
        char[] Password = new char[length];
        Random r = new Random();
        for (int i= 0; i < length;i++)
        {
            Password[i]=Combination.charAt(r.nextInt(Combination.length()));
        }
        System.out.println("The Password that is generated is :" +new String(Password));

    }
}