import java.util.Scanner;

/**
 * Write a description of class QFX here.
 *
 * Anugya Thapaliya
 * @version (a version number or a date)
 */
public class QFX
{
    public static void main(String[]args){

         // base price by age 
    int child= 50;
    int adult= 250;
    int senior= 200; 
     System.out.println("The base price for child:  \t " +child);
     System.out.println("The base price for adult:  \t  " +adult);
     System.out.println("The base price for senior: \t" +senior);
     
     
     //discount 
     double studentdiscount= 0.20;
    double festivaldiscount= 0.15;
System.out.println("The discount for student: \t" + studentdiscount);
System.out.println("The discount for festival : \t" + festivaldiscount);     
    
    
    Scanner scan= new Scanner(System.in);
    // age
    System.out.println("enter the age? 1=Child, 2=Adult, 3=Senior");
    int age= scan.nextInt();
    // language 
    System.out.println("enter the language? 1=Nepali, 2=Hindi, 3=English");
    int language= scan.nextInt();
    // discount
    System.out.println("Are you student? (yes/no) (1= yes, 0= no)");
   int student= scan.nextInt();
    
    System.out.println("Is there any festival? (yes/no) (1=yes, 0=no)");
    int  festival= scan.nextInt();
    double price = 0;
    
    {
        if (age== 1){
            price= child;
            
        }
        else if (age==2){
            price= adult;
        }
        
        else if (age==3){
            price= senior;
        }
        else 
        System.out.println(" Invalid age option!!!!");
        
        
    }
    // language surcharge 
     if (language== 2){
        price= price + 50;

    }
    else if (language==3){
        price= price + 100; 
        
    }
    
    if (student== 1){
        price= price- (price * 0.20);

    }
    if (festival== 1){
        price= price - (price * 0.15); 
    }
     System.out.println("The total price for the movie ticket: Rs. " + (int) price); 
    }
}
