import java.util.Scanner;

/**
 * Write a description of class question9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question9
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter positive integer");
        int num= scan.nextInt();
       
        int reverse=0;
        while(num>0){
            int digit= num % 10; //last ko digit agadi lyaune kaam garcha
            reverse= reverse *10 +digit;
            num= num/10;
        }
        System.out.println("reversed number:" +reverse);
    
    }
}