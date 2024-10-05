import java.util.Scanner;
//class BirthMonth
//main()
//num birthMonth
//OUTPUT “Enter your birth month [1 – 12]”
//INPUT birthMonth
//If birthMonth >= 1 and <=12 then
//   OUTPUT “Your birth month is: “ + birthMonth
//else
//   OUTPUT “You entered an incorrect month value: “ + birthMonth
//endIf
//return
//end class
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth;
        System.out.print("Enter you birth month [1-12]: ");
        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();
            if(birthMonth >= 1 && birthMonth <= 12) //check to see if birth month input is valid for a month 1-12.
            {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else
            {
                System.out.println("Your entered month value: " + birthMonth + " is invalid. Please try again.");
            }
        }
    }
}