//Bao Nguyen
//1588673

import java.util.Scanner;

public class BirthdayCalculator {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the current numerical month");
        int month = input.nextInt();

        System.out.println("Enter the current numerical day");
        int day = input.nextInt();

        System.out.println("Enter the current numerical year");
        int year = input.nextInt();

        System.out.println("Today's date is: " + month + "/" + day + "/" + year);

        System.out.println("Enter your numerical birthday month");
        int birthmonth = input.nextInt();

        System.out.println("Enter your numerical birthday day");
        int birthday = input.nextInt();

        System.out.println("Enter your numerical birthday year");
        int birthyear = input.nextInt();

        System.out.println("Your birthday date is: " + birthmonth + "/" + birthday + "/" + birthyear);

        int age = year - birthyear;
        System.out.println("You are " + age + " years old.");

        if(month == birthmonth && day == birthday)
        {
            System.out.println("Happy Birthday!");
        }
    }
    }
