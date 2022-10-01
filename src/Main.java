import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        String trash = "";
        double firstS = 0;
        double secondS = 0;
        double area = 0;
        double perimeter = 0;
        double diag = 0;

        System.out.println("Enter the first side of your rectangle: ");

        if (sc.hasNextDouble())
        {
            firstS = sc.nextDouble();
            sc.nextLine();
        }
        else
        {
            trash = sc.nextLine();
            System.out.println(trash + " is not a valid number!");
        }
        System.out.println("Enter the second side of your rectangle: ");

        if (sc.hasNextDouble())
        {
            secondS = sc.nextDouble();
            sc.nextLine();
            area = firstS * secondS;
            perimeter = 2 * (secondS + firstS);
            diag = (Math.sqrt(firstS * firstS + secondS * secondS));


            System.out.println(" The area of your rectangle is " + area);
            System.out.println(" The perimeter of your rectangle is " + perimeter);
            System.out.println(" The diagonal of your rectangle is " + diag);

        }
        else
        {
            trash = sc.nextLine();
            System.out.println(trash + " is not a valid number");
        }

    }
}