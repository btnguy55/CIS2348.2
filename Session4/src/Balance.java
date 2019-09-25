import java.util.Scanner;


public class Balance {
    public static void main(String[] args)
    {
        int Balance = 100;
        int amount = 100;
        String text = "";
        // int result = Balance;
        while (Balance > 0) {

            Scanner input = new Scanner(System.in);
            int amount = input.nextInt();

           Balance = Balance - amount;

            if (result < 0) {
                System.out.println("Balance is " + Balance + " Nothing left");
            }
        }
        System.out.println(amount);
    }
}

