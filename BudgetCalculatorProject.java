public class BudgetCalculatorProject
{
public static void main(String [] args)
{
    final double SALARY = 3000.0;
    System.out.println(SALARY);
    final double SAVINGS_PERCENT = 0.20;
    final double RENT_PERCENT = 0.30;
    final double GROCERIES_PERCENT = 0.15;
    final double ENTERTAINMENT_PERCENT = 0.10;

    double monthlySalary = SALARY;

    double savingsAmount = SALARY * SAVINGS_PERCENT;
    System.out.println("Saved Amount: " + savingsAmount);

    double rentAmount = SALARY * RENT_PERCENT;
    System.out.println("Rent Amount: " + rentAmount);

    double groceriesAmount = SALARY * GROCERIES_PERCENT;
    System.out.println("Groceries Amount: " + groceriesAmount);

    double entertainmentAmount = SALARY * ENTERTAINMENT_PERCENT;
    System.out.println("EntertainmentAmount: " + entertainmentAmount);

    double totalExpenses = savingsAmount + rentAmount + groceriesAmount + entertainmentAmount;
    System.out.println("TotalExpenses: " + totalExpenses);

    double remainingBalance = totalExpenses - SALARY;
    System.out.println("RemainingBalance: " + remainingBalance);
    
    
    
    
}
}