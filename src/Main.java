import java.util.Scanner;
public class Main {
    public static double calculateTotalMealPrice(double tipRate,
                                               double listedMealPrice,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tip + tax + listedMealPrice;

        // System.out.println("The total meal price is " + result);
        return result;
    }

    public static void main(String[] args) {
        double groupTotal = calculateTotalMealPrice(0.15, 100, 0.06);

        System.out.println(groupTotal/4);
    }
}