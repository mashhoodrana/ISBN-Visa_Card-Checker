import java.util.Scanner;

public class ValidationChecker

{
    public static void main(String[] args)
    {
        
            System.out.print("\033[H\033[2J");
            System.out.flush();
        
        System.out.println ("\t\t\t\t\t=================================================================\t\t\t\t\t");
        System.out.println ("\t\t\t\t\t\t\t WELCOME TO THE VALIDATION SYSTEM\t\t\t\t\t");
        System.out.println ("\t\t\t\t\t=================================================================\t\t\t\t\t\n");


        System.out.println("Which type of validation you want to check?");
        System.out.println("1: ISBN-10");
        System.out.println("2: ISBN-13");
        System.out.println("3: Universal Product number");
        System.out.println("4: Master/Visa Card\n");

        Scanner sc = new Scanner(System.in);
        System.out.print ("Which number/code validity you want to check?: ");
        String n = sc.next();
        int num = Character.getNumericValue(n.charAt(0));

        //if (num >= 1)
        {
            switch(num)
            {
                case 1:

                    System.out.print ("\nEnter ISBN-10 number (format: d-ddddd-ddd-d): ");
                    String st1 = sc.next();

                    if (st1.length() == 13)
                    {
                        int d1 = Character.getNumericValue(st1.charAt(0));
                        int d2 = Character.getNumericValue(st1.charAt(2));
                        int d3 = Character.getNumericValue(st1.charAt(3));
                        int d4 = Character.getNumericValue(st1.charAt(4));
                        int d5 = Character.getNumericValue(st1.charAt(5));
                        int d6 = Character.getNumericValue(st1.charAt(6));
                        int d7 = Character.getNumericValue(st1.charAt(8));
                        int d8 = Character.getNumericValue(st1.charAt(9));
                        int d9 = Character.getNumericValue(st1.charAt(10));
                        int d10 = Character.getNumericValue(st1.charAt(12));

                        int checkSum = ( (d1*10) + (d2 * 9) + (d3*8) + (d4 * 7) + (d5*6) + (d6 * 5) + (d7*4) + (d8 * 3) + (d9*2) +(d10) );

                        if (checkSum % 11 == 0)
                        {
                            System.out.print ("It is a valid ISBN-10 number.");
                        }
                        else
                        {
                            System.out.print ("It is an invalid ISBN-10 number.");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid ISBN-10 number format or incorrect length");
                        System.out.println("Please try again with correct format.");

                    }
                    break;

                case 2:

                    System.out.print ("Enter ISBN-13 number (format: ddd-d-ddd-ddddd-d): ");
                    String st2 = sc.next();

                    if (st2.length() == 17)
                    {
                        int d1 = Character.getNumericValue(st2.charAt(0));
                        int d2 = Character.getNumericValue(st2.charAt(1));
                        int d3 = Character.getNumericValue(st2.charAt(2));
                        int d4 = Character.getNumericValue(st2.charAt(4));
                        int d5 = Character.getNumericValue(st2.charAt(6));
                        int d6 = Character.getNumericValue(st2.charAt(7));
                        int d7 = Character.getNumericValue(st2.charAt(8));
                        int d8 = Character.getNumericValue(st2.charAt(10));
                        int d9 = Character.getNumericValue(st2.charAt(11));
                        int d10 = Character.getNumericValue(st2.charAt(12));
                        int d11 = Character.getNumericValue(st2.charAt(13));
                        int d12 = Character.getNumericValue(st2.charAt(14));
                        int d13 = Character.getNumericValue(st2.charAt(16));


                        int checkSum = ((d1) + (d2 * 3) + (d3) + (d4 * 3) + (d5) + (d6 * 3) + (d7) + (d8 * 3) + (d9) + (d10 * 3) + (d11) + (d12 * 3) + (d13));

                        if (checkSum % 10 == 0)
                        {
                            System.out.print("It is a valid ISBN-13 number.");
                        }
                        else
                        {
                            System.out.print("It is an invalid ISBN-13 number.");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid ISBN-13 number (incorrect length)");
                        System.out.println("Please try again with correct format.");
                    }
                    break;

                case 3:

                    System.out.print ("Enter 12 digit UPC number (format: d-ddddd-ddddd-d): ");
                    String st3 = sc.next();

                    if (st3.length() == 15)
                    {
                        int d1 = Character.getNumericValue(st3.charAt(0));
                        int d2 = Character.getNumericValue(st3.charAt(2));
                        int d3 = Character.getNumericValue(st3.charAt(3));
                        int d4 = Character.getNumericValue(st3.charAt(4));
                        int d5 = Character.getNumericValue(st3.charAt(5));
                        int d6 = Character.getNumericValue(st3.charAt(6));
                        int d7 = Character.getNumericValue(st3.charAt(8));
                        int d8 = Character.getNumericValue(st3.charAt(9));
                        int d9 = Character.getNumericValue(st3.charAt(10));
                        int d10 = Character.getNumericValue(st3.charAt(11));
                        int d11 = Character.getNumericValue(st3.charAt(12));
                        int d12 = Character.getNumericValue(st3.charAt(14));

                        int checkSum = ( (d1*3) + (d2) + (d3*3) + (d4) + (d5*3) + (d6) + (d7*3) + (d8) + (d9*3) +(d10) + (d11*3) + (d12) );

                        if (checkSum % 10 == 0)
                        {
                            System.out.print ("It is a valid UPC number.");
                        }
                        else
                        {
                            System.out.print ("It is an invalid UPC number.");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid UPC  format or incorrect length");
                        System.out.println("Please try again with correct format.");
                    }
                    break;

                case 4:

                    System.out.print("Enter 16-digit Visa card number: ");
                    String st4 = sc.next();

                    int[] intArr = {2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1};
                    if (st4.length() == 16)
                    {
                        int sum = 0;
                        for (int i = 0; i < 16; i++)
                        {
                            int digit = Character.getNumericValue(st4.charAt(i)) * intArr[i];

                            if (digit > 9)
                            {
                                digit = digit / 10 + digit % 10;
                            }

                            sum += digit;
                        }

                        if (sum % 10 == 0)
                        {
                            System.out.println("It is a valid Visa card number.");
                        }
                        else
                        {
                            System.out.println("It is an invalid Visa card number.");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Visa card number (incorrect length)");
                        System.out.println("Please try again with the correct format.");
                    }
                    break;
                default:
                {
                    System.out.println("You didn't choose the right option!, Try again");
                }

            }
        }



    }

}
