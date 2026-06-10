

// Author: Christopher Britten
// Date Started: 2026-05-13
// Due By: 2026-05-16
// Course: DSA



/** PRACTICE
 * Calculate the avarage temperature, and give how many days are above the avarage temperature
 * 1. Take an input from the user (eg. 5)
 * 2. Prompt the user to enter all the 5 numbers (temperature values)
 * 3. Calculate the avarage temperature
 * 4. Given the avarage temperature, how many of the numbers in the line 2 are above the avarage temperature?
 */


/** notes:
 * Scanner will be required to take user input. Importing scanner and call it to read from what the user types " in "
 *
 *Prompting the user to enter a number ( this will select the length of the array )
 *
 *once user enters index picked, we will have to make an array that will manage to hold that value
 * using double for that part
 *
 * once the array is created
 * the loop will iterate through this creation based on what the user enters
 *
 * here is a source I used for figuring out the best approach finding average with for loop
 * https://www.geeksforgeeks.org/dsa/program-to-find-the-average-of-two-numbers/
 *
 *
 *
 */

import java.util.Scanner;

public class ArrayPractice1 {


    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.println("Pick Temp's here [ 1 , 2 , 3, 4, 5 ] ");
         int days = input.nextInt();

         // temps as double

         double[] temps = new double[days];


                 for(int i = 0; i < days; i++){
                     System.out.println("Enter Temp for day " + (i + 1) + ": ");
                     //adding this here to step down and wait for user instead of asking all days at once
                     System.out.flush();
                     temps[i] = input.nextDouble();
                 }


                 double sum = 0;
                 for (int i = 0; i < days; i++)
                 {
                     sum += temps[i];
                 }

        // avg here

            double average = sum/days;


                 int totalCount = 0;
                 for(int i = 0; i < days; i++) {
                     if (temps[i] > average) {
                         totalCount++;
                     }

                 }
                     // this will be where the program will print everything out


                     System.out.printf("AVG TEMP: %.2f%n", average);
                     System.out.printf("DAYS ABOVE AVG TEMP: %d%n",  totalCount);


                    //closing scanner as a good habit
                    input.close();


    }



}
