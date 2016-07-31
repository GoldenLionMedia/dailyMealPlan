package dailyMealPlan;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Call getTotalWeeks
        int numWeeks = getTotalWeeks();
        double[] dailyCost = new double[7]; //initialize the array

    // print DailyCost array before calling method
        System.out.println("Array before adding values " +Arrays.toString(dailyCost));

    // Call getDailyCost
        getDailyCost(dailyCost);

    // print DailyCost array after calling method
        System.out.println("Array after adding values: " +Arrays.toString(dailyCost));

    // calculate TotalCost formula
        double totalCost = calculatePlanCost(numWeeks, dailyCost);

    // print TotalCost
        printTotalCost(totalCost);
    }

    public static int getTotalWeeks()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many weeks in your semester?");
        int numWeeks = in.nextInt();
        return numWeeks;
    }

    public static void getDailyCost(double[] dailyCost)
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < dailyCost.length; i++)
        {
            System.out.println("List costs for day " + (i+1));
            dailyCost[i] = in.nextDouble();
        }
    }

    public static double calculatePlanCost(int numWeeks, double[] dailyCost)
    {
        double total=0, weekly=0;

        for (int i = 0; i < dailyCost.length; i++)
        {
           weekly +=  dailyCost[i];
        }
        total = weekly * numWeeks;
        return total;
    }

    public static void printTotalCost(double total)
    {
        System.out.printf("The total cost of meals for the semester is $%5.2f", total);
        System.out.println();

    }
}
