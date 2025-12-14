
/**
 * A tiny book corner keeps two categories with one book each. Use only fixed
arrays.
• Create String[] categories = {"Fiction", "Nepali"}.
• Create String[][] titles = new String[2][1] and double[][] prices = new
double[2][1]
• Put one title and price for each category (e.g., "Asahamati - 5" and
750.0).
• Print each category, its title and price (format price with two decimals).
 *
 * Anugya Thapaliya
 * @version (a version number or a date)
 */
public class scenarioworkshop6
{
    public static void main(String[] args){
         String[]categories={"Fiction","Nepali"};
         String[][]titles = new String[2][1];
         double[][] prices= new double[2][1];
         titles[0][0] = "Harry Potter";
        prices[0][0] = 840.0;
        
        titles[1][0] = "Parijat";
        prices[1][0] = 990.0;

        for (int i = 0; i < categories.length; i++) 
        {
            System.out.println("Category: " + categories[i]);
            System.out.println("Title: " + titles[i][0]);
            System.out.printf("Price: %.2f\n\n", prices[i][0]); // %.2f here is used to show the last two digit of the output.
        }
    }
}