//Bao Nguyen
//1588673
import java.util.Scanner;

public class RestaurantCalculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double mealCost;
        double totalCost;
        double tax;
        double tip;
        double totalBill;
        double tippercent;

        System.out.println("Please enter the cost of the meal: ");
        mealCost = input.nextDouble();

        tax = .0825 * mealCost;

        totalCost = mealCost + tax;

        tippercent = 0;
        if (totalCost > 100.00)
        {
            tippercent = .2;
        }
        if (totalCost > 50.00 && totalCost<=100.00)
        {
            tippercent = .15;
        }
        if (totalCost > 25.00 && totalCost<=50.00)
        {
            tippercent = .05;
        }


        tip = tippercent * totalCost;

        totalBill = totalCost + tip;

        System.out.println("Item total price: " + mealCost);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Final total: " + totalBill);
    }
}
