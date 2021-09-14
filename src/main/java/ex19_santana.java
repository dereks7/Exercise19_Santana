import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
Your BMI is 19.5.
You are within the ideal weight range.

Your BMI is 32.5.
You are overweight. You should see your doctor.

bmi = (weight / (height × height)) * 703
 */

public class ex19_santana
{
    public static void main( String[] args ) {
        System.out.println("Enter you height in inches: ");
        Scanner in1 = new Scanner(System.in);
        String h = in1.nextLine();
        double n1 = Double.parseDouble(h);
        System.out.println("Enter you weight in pounds: ");
        Scanner in2 = new Scanner(System.in);
        String w = in1.nextLine();
        double n2 = Double.parseDouble(w);

        double bmi = ((n2 / (n1 * n1))*703.00);
        System.out.printf("Your BMI is %.2f.",bmi);

        if (bmi >= 18.5 && bmi <= 25.0)
        {
            System.out.println("You are within the ideal weight range.");
        }
        else if (bmi < 18.5)
        {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if (bmi > 25)
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
