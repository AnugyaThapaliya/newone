
/**
 * The sum of square of first 10 natural numbers using do while loop
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sumof10number
{
   public static void main(String[] args)
   {
       int i=1;
       int sum= 0;
        
        do{
            sum = sum + (i*i);
            i++;
        }while(i<=10);
        System.out.println(sum);
   }
}