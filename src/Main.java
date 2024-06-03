//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        double springCost = 200.0;
        double summerCost = 215.0;
        double fallCost = 230.5;
        double winterCost = 248.9;
        double totalYearlyCost = 0;

        totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("The spring maintenance cost is $" + springCost);
        System.out.println("The summer maintenance cost is $" + summerCost);
        System.out.println("The fall maintenance cost is $" + fallCost);
        System.out.println("The winter maintenance cost is $" + winterCost);
        System.out.println("The yearly maintenance cost is $" + totalYearlyCost);

    }
}