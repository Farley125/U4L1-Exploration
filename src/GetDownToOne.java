import java.util.Scanner;

public class GetDownToOne
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to halve to one? ");
        int userNumber = scanner.nextInt();
        int count = userNumber;
        int counter = 0;
        while (count > 1)
        {
            count = count / 2;
            counter ++;
            System.out.println(count);
        }
        System.out.println("There are " + counter + " halvings to get to 1.");
    }
}
