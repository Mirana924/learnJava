import java.util.Scanner;
public class Main {
    public static double employeeSalary(int hours, double salaryPerHour) {
//        System.out.println("Please input the hours you work per week below");
//        Scanner input = new Scanner(System.in);
//        hours = input.nextInt();
//        while (hours <= 0) {
//            System.out.println("The hours is invalid, please input a positive integer");
//            input = new Scanner(System.in);
//            hours = input.nextInt();
//        }
//        System.out.println("Please input the salary per hour");
//        Scanner salaryInput = new Scanner(System.in);
//        salaryPerHour = salaryInput.nextDouble();
//        while (salaryPerHour <= 0) {
//            System.out.println("The salary is invalid, please input a positive number");
//            salaryInput = new Scanner(System.in);
//            salaryPerHour = salaryInput.nextInt();
//        }
        if (hours < 0 || salaryPerHour < 0) {
            return -1;
        }
        double salaryYearly = hours * salaryPerHour * 52;
        return salaryYearly;
    }

    public static double employeeSalaryWithVacation(int hours, double salaryPerHour, int vacationDays) {
        double totalSalary = employeeSalary(hours, salaryPerHour);
//        System.out.println("Please input you vacation days");
//        Scanner vacationInput = new Scanner(System.in);
//        vacationDays = vacationInput.nextInt();
//        while (vacationDays <= 0) {
//            System.out.println("The vacation days is invalid, please input a positive integer");
//            vacationInput = new Scanner(System.in);
//            vacationDays = vacationInput.nextInt();
//        }
        return totalSalary - 8 * vacationDays * salaryPerHour;

    }

    public static void main(String[] args) {
        //Sample 1: without vacation days
        System.out.println("The total salary for one year is " + employeeSalary(40, 12));
        System.out.println("The total yearly salary with 10 days vacation is " + employeeSalaryWithVacation(40, 12, 10));

    }
}