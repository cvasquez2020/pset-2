/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

	System.out.print("\n");
	System.out.print("Enter your first name: ");
        String firstName = in.nextLine();

	System.out.print("Enter your last name: ");
	String lastName = in.nextLine();

	System.out.print("Enter your grade: ");
	int grade = in.nextInt();

	System.out.print("Enter your age: ");
	int age = in.nextInt();
	in.nextLine();

	System.out.print("Enter your hometown: ");
	String homeTown = in.nextLine();

	System.out.print("\n");
	System.out.println("NAME      : " + firstName + " " + lastName);
	System.out.println("GRADE     : " + grade);
	System.out.println("AGE       : " + age);
	System.out.println("HOMETOWN  : " + homeTown);

	/*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

	double DOLLAR_VALUE = 1.00;
	double QUARTER_VALUE = 0.25;
	double DIME_VALUE = 0.10;
	double NICKEL_VALUE = 0.05;
	double PENNY_VALUE= 0.01;

	System.out.print("\n");
	System.out.print("Enter a dollar amount: ");
	double money = in.nextDouble();
	System.out.print("\n");

        double dollars = money / DOLLAR_VALUE;
        System.out.println("DOLLARS	 : " + (int) dollars);
        money -= (int) dollars * DOLLAR_VALUE;

        double quarters = money / QUARTER_VALUE;
        System.out.println("QUARTERS : " + (int) quarters);
        money -= (int) quarters * QUARTER_VALUE;

        double dimes = money / DIME_VALUE;
	System.out.println("DIMES	 : " + (int) dimes);
	money -= (int) dimes * DIME_VALUE;

	double nickels = money / NICKEL_VALUE;
	System.out.println("NICKELS	 : " + (int) nickels);
	money -= (int) nickels * NICKEL_VALUE;

	double pennies = money / PENNY_VALUE;
        System.out.println("PENNIES	 : " + (int) pennies);
	System.out.print("\n");

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

	double TWENTY_BILL_VALUE = 20.00;
	double TEN_BILL_VALUE = 10.00;
	double FIVE_BILL_VALUE = 5.00;

	       int billCount = 0;
        int coinCount = 0;

	System.out.print("Enter a dollar amount: ");
	money = in.nextDouble();

	billCount += (money / TWENTY_BILL_VALUE);
	money -= Math.round(100 * (TWENTY_BILL_VALUE
        * (Math.floor(money / TWENTY_BILL_VALUE)))) / 100.00;

	billCount += (money / TEN_BILL_VALUE);
	money -= Math.round(100.00 * (TEN_BILL_VALUE
        * (Math.floor(money / TEN_BILL_VALUE)))) / 100.00;

	billCount += (money / FIVE_BILL_VALUE);
	money -=  Math.round(100.00 * (FIVE_BILL_VALUE
        * (Math.floor(money / FIVE_BILL_VALUE)))) / 100.00;
	money = Math.round(100.00 * (money)) / 100.00;

	billCount += (money / DOLLAR_VALUE);
	money = Math.round(100.00 * (money - Math.floor(money))) / 100.00;
	money = Math.round(100.00 * money) / 100.00;

	coinCount += Math.floor(money / QUARTER_VALUE);
	money -=  QUARTER_VALUE * (Math.floor(money / QUARTER_VALUE));
	money = Math.round(100.00 * money) / 100.00;

	coinCount += Math.floor(money / DIME_VALUE);
	money -=  DIME_VALUE * (Math.floor(money / DIME_VALUE));
	money = Math.round(100.00 * money) / 100.00;

	coinCount += Math.floor(money / NICKEL_VALUE);
	money -=  NICKEL_VALUE * (Math.floor(money / NICKEL_VALUE));
	money = Math.round(100.00 * (money)) / 100.00;

        coinCount += Math.floor(money / PENNY_VALUE);

	System.out.print("\n");
	System.out.print("BILLS : " + (int) billCount);
	System.out.print("\n");
	System.out.println("COINS : " + coinCount);

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

	int INCHES_PER_MILE = 63360;
        int INCHES_PER_YARD = 36;
        int INCHES_PER_FOOT = 12;

	System.out.print("\n");
	System.out.print("Enter a number of inches: ");
	int inches = in.nextInt();

	int miles = (int) Math.floor(inches / INCHES_PER_MILE);
        inches -= miles * INCHES_PER_MILE;

	int yards = (int) Math.floor(inches / INCHES_PER_YARD);
	inches -= yards * INCHES_PER_YARD;

	int feet = (int) Math.floor(inches / INCHES_PER_FOOT);
	inches -= feet * INCHES_PER_FOOT;

        System.out.print("\n");
        System.out.println("MILES	: " + miles);
	System.out.println("YARDS	: " + yards);
	System.out.println("FEET	: " + feet);
	System.out.println("INCHES	: " + inches);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

	int CENTIMETERS_PER_KILOMETER = 100000;
	int CENTIMETERS_PER_METER = 100;

	System.out.print("\n");
	System.out.print("Enter a number of centimeters: ");
	int centimeters = in.nextInt();

        int kilometers = (int) Math.floor(centimeters
        / CENTIMETERS_PER_KILOMETER);
        centimeters -= kilometers * CENTIMETERS_PER_KILOMETER;

        int meters = (int) Math.floor(centimeters / CENTIMETERS_PER_METER);
        centimeters -= meters * CENTIMETERS_PER_METER;

	System.out.print("\n");
        System.out.println("KILOMETERS  : " + kilometers);
	System.out.println("METERS      : " + meters);
	System.out.println("CENTIMETERS : " + centimeters);

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

	System.out.print("\n");
	System.out.print("Enter a diameter: " );
	double diameter = in.nextDouble();

	double radius = diameter / 2;
        double area = Math.PI * Math.pow(radius, 2);
	double circumference = 2 * Math.PI * radius;

	System.out.print("\n");
	System.out.print("AREA          : ");
	System.out.printf("%,.2f", area);
	System.out.print("\n");
	System.out.print("CIRCUMFERENCE : ");
	System.out.printf("%,.2f", circumference);
	System.out.print("\n");

        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */

	System.out.print("\n");
	System.out.print("Enter a length: ");
	double lengthRectangle = in.nextDouble();

	System.out.print("Enter a width: ");
	double widthRectangle = in.nextDouble();

	area = widthRectangle * lengthRectangle;

	double perimeter = 2 * widthRectangle + 2 * lengthRectangle;
	double diagonal = Math.hypot(widthRectangle, lengthRectangle);

	System.out.print("\n");
	System.out.print("AREA      : ");
	System.out.printf("%,.2f", area);
	System.out.print("\n");
	System.out.print("PERIMETER : ");
	System.out.printf("%,.2f", perimeter);
	System.out.print("\n");
	System.out.print("DIAGONAL  : ");
	System.out.printf("%,.2f", diagonal);
	System.out.print("\n");


        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */

        System.out.print("\n");
        System.out.print("Enter a side length: ");
        double lengthHexagon = in.nextDouble();

        double areaHexagon = 3 * Math.sqrt(3) / 2
        * Math.pow(lengthHexagon, 2);
        double perimeterHexagon = 6 * lengthHexagon;

        System.out.print("\n");
        System.out.print("AREA      : ");
        System.out.printf("%,.2f", areaHexagon);
        System.out.print("\n");
        System.out.print("PERIMETER : ");
        System.out.printf("%,.2f", perimeterHexagon);
        System.out.print("\n");

        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */

        System.out.print("\n");
        System.out.print("Enter a String: ");
        String word = in.next();


        int halfLength = (int) Math.floor(word.length() / 2);
        int wordLength = word.length();

        String firstWord = word.substring(halfLength, wordLength);
        String secondWord = word.substring(0, halfLength);

        String newWord = firstWord + secondWord;

        System.out.print("\n");
        System.out.print(newWord);
        System.out.print("\n");

        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */

        System.out.print("\n");
        System.out.print("Enter your first name: ");
        String firstName2 = in.next();

        System.out.print("Enter your middle name: ");
        String middleName = in.next();

        System.out.print("Enter your last name: ");
        String lastName2 = in.next();

        String firstInitial = firstName2.substring(0, 1);
        String secondInitial = middleName.substring(0, 1);
        String thirdinitial = lastName2.substring(0, 1);

        System.out.print("\n");
        System.out.print(firstInitial + secondInitial + thirdinitial);
        System.out.print("\n");

        in.close();
    }
}
