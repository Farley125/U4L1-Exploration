import java.util.Scanner;

public class CountDown
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to start at? ");
        int userNumber = scanner.nextInt();

        /* complete me! */
        int count = userNumber;
        while (count > -1)
        {
            System.out.print(count + ", ");
            count--;
            if (count == -1)
            {
                System.out.print("Time's up! 10 seconds have passed!");
            }
        }
    }
}
