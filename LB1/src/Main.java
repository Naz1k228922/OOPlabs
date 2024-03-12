import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main
{
    private static double a;
    private static double b;
    private static double x;

    public static double calculateY()
    {
        return Math.pow(Math.sin(Math.pow(x, 2) + a), 3) - Math.sqrt(a / b);
    }

    public static double calculateZ()
    {
        return (x * x / a) + Math.pow(Math.cos(a + b), 3);
    }

    public static void print()
    {
        System.out.println("Results:");
        System.out.println("y = " + calculateY());
        System.out.println("z = " + calculateZ());
    }

    public static void printDateTime()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy 'and' EEEE");
        System.out.println("Current Date: " + dateFormat.format(new Date()));
    }

    public static void run()
    {
        inputVariables();

        print();
        
        printDateTime();
    }

    public static void inputVariables()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        a = scanner.nextDouble();

        System.out.println("Enter the value of b:");
        b = scanner.nextDouble();

        System.out.println("Enter the value of x:");
        x = scanner.nextDouble();
    }

    public static void main(String[] args)
    {
        run();
    }
}
