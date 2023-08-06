import java.util.Scanner;

import javax.sound.midi.MidiChannel;

import java.lang.*;

public class WolfpackFinance {
    /**
     * setting variable for the month June as 6
     */
    public static final int JUNE = 6;

    /**
     * setting variable for the month July as 7
     */
    public static final int JULY = 7;

    /**
     * setting variable for the month August as 8
     */
    public static final int AUGUST = 8;

    /**
     * setting variable for the current year as 2023
     */
    public static final int CURRENT_YEAR = 2023;

    /**
     * setting variable for the number of days in a week as 7
     */
    public static final int DAYS_OF_WEEK = 7;

    /**
     * setting variable for the number of months in a year 12
     */
    public static final int MONTHS_IN_YEAR = 12;

    /**
     * setting variable for the maximum possible credit score the program
     * can accept as 850
     */
    public static final int MAX_CREDIT_SCORE = 850;

    /**
     * setting variable for the lowest possible credit score the program
     * can accept as 300
     */
    public static final int MIN_CREDIT_SCORE = 300;

    /**
     * setting variable for the upper testing credit score as 720
     */
    public static final int UPPER_TEST_CREDIT_SCORE = 720;

    /**
     * setting variable for the middle testing credit score as 500
     */
    public static final int MID_TEST_CREDIT_SCORE = 500;

    /**
     * setting variable for the lower testing credit score as 720
     */
    public static final int LOWER_TEST_CREDIT_SCORE = 350;

    /**
     * setting variable for the time period for the user to pay the loan
     * off as 48 months
     */
    public static final int TIME_PERIOD_MONTHS = 48;

    /**
     * setting variable for the express processing fee as 30
     */
    public static final int EXPRESS_PROCESSING_FEE = 30;

    public static void main(String[] args){
        double f = getInterestRate(1000,400,4000);
        System.out.println(f);
        System.out.println("Welcome to Wolfpack Finance!");
        System.out.println("Applications for loans from $1000 to $10000 will be accepted from June" +
                " 1 to August 15, 2023. All loans will be paid back over a 4 year period. When prompted" +
                ", please enter today's date, your credit score, your 2022 income, and the loan amount" +
                ". Loans are normally paid out 21 days after the application date, but for a fee of $30" +
                ", which will be added to the loan amount, you may request Express Processing in which" +
                " case the loan will be paid out 3 days after the application date. If your loan is " +
                "approved, the loan amount, interest rate, disbursement rate, and monthly payement " +
                "amount will be output.");

        Scanner console = new Scanner(System.in);
        System.out.print("Month & Day (eg. 5 25 (May 25th)): ");
        int month = console.nextInt();
        int day = console.nextInt();
        if(!isValidDate(month, day)) {
            System.exit(1);
            System.out.println("Invalid date");
        }

        console.nextLine();

        System.out.print("Credit Score (300 - 850): ");
        int creditScore = console.nextInt();
        if(creditScore < 300 || creditScore > 850){
            System.out.println("Invalid credit score");
            System.exit(1);
        }

        System.out.print("2022 Income: ");
        int income = console.nextInt();
        if(income < 0){
            System.out.println("Invalid income");
            System.exit(1);
        }

        System.out.print("Loan Amount ($1000 - $10000): ");
        int loanAmount = console.nextInt();
        if(loanAmount < 1000 || loanAmount > 10000){
            System.out.println("Invalid loan amount");
            System.exit(1);
        }

        System.out.print("Express Processing (y/n):");
        String ep = console.next();
        char epf = ep.charAt(0);
        boolean expressProcessing = false;
        if(epf == 'y' || epf == 'Y') {
            expressProcessing = true;
        } else {
            expressProcessing = false;
        }

        System.out.println(" ");

        double la = getInterestRate(loanAmount,creditScore,income);
        if(isValidDate(month, day) && la != -1.0) {
            if(expressProcessing){
                System.out.println("Loan Amount: " + (loanAmount + EXPRESS_PROCESSING_FEE));
            } else {
                System.out.println("Loan Amount: " + loanAmount);
            }
            System.out.println("Interest Rate: " + la + "%");
            double mp = getMonthlyPayment(loanAmount, la, TIME_PERIOD_MONTHS);
            String print = "Monthly payment: %.3f";
            System.out.printf(print,mp);
            System.out.println("");
            String dd = getDisbursementDate(month, day, expressProcessing);
            System.out.println("Disbursement date: " + dd);
        } else {
            System.out.println("Loan denied");
        }

    }

    /**
     * Checks to see if the date entered by the user in valid
     * @param month of the current date
     * @param day of the current date
     * @return true if the date is between June 1 and August 15, otherwise false
     */
    public static boolean isValidDate(int month, int day){

        if(month == JUNE && (day > 0 && day <= 30)){
            return true;
        } else if(month == JULY && (day > 0 && day <= 31)) {
            return true;
        } else if (month == AUGUST){
            if (day >= 1 && day <= 15){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Determines if a loan can be approved by checking if the data entered are within the
     * parameters given; loan amount, credit score, and income from 2022.
     * @param loanAmount user needs to borrow
     * @param creditScore from 2022
     * @param income made in 2022
     * @return interest rate if loan is approved else, -1.0 if the loan is not approved
     * @throws IllegalArgumentException if loan amount is less than or equal to zero
     * @throws IllegalArgumentException if credit score is less than 300 or greater than 850
     * @throws IllegalArgumentException if income is less than zero
     */
    public static double getInterestRate(int loanAmount, int creditScore, int income){
        if (loanAmount <= 0){
            throw new IllegalArgumentException("Invalid loan amount");
        } else if(creditScore < MIN_CREDIT_SCORE || creditScore > MAX_CREDIT_SCORE){
            throw new IllegalArgumentException("Invalid credit score");
        } else if(income < 0){
            throw new IllegalArgumentException("Invalid income");
        }
        double finalRate = 0;
        if(creditScore >= UPPER_TEST_CREDIT_SCORE){
            finalRate = 7.5;
        } else if(creditScore < UPPER_TEST_CREDIT_SCORE && income >= 5*loanAmount){
            finalRate = 8.0;
        } else if(creditScore >= MID_TEST_CREDIT_SCORE && income >= 3*loanAmount) {
            finalRate = 8.5;
        } else if(creditScore >= LOWER_TEST_CREDIT_SCORE && income >= 2*loanAmount){
            finalRate = 9.0;
        } else {
            finalRate = -1.0;
        }
        return finalRate;
    }

    /**
     * Calculates the monthly payment amount for the loan based on the loan amount, annual interest
     * rate, and the number of months using the monthly payment formula
     * @param loanAmount
     * @param annualInterestRate
     * @param numberOfMonths over which the loan is being repaid
     * @return monthly payment amount
     * @throws IllegalArgumentException if loan amount is less than or equal to zero
     * @throws IllegalArgumentException if the interest rate is less than 0.5
     * @throws IllegalArgumentException if the number of months is less than or equal to zero
     */
    public static double getMonthlyPayment(double loanAmount, double annualInterestRate, int numberOfMonths ){
        if(loanAmount <= 0){
            throw new IllegalArgumentException("Invalid loan amount");
        } else if (annualInterestRate < 0.5) {
            throw new IllegalArgumentException("Invalid interest rate");
        } else if (numberOfMonths <= 0){
            throw new IllegalArgumentException("Invalid number of months");
        }

        double numerator = ((annualInterestRate/MONTHS_IN_YEAR)/100)
                *Math.pow(1+((annualInterestRate/MONTHS_IN_YEAR)/100),numberOfMonths);
        double denominator = Math.pow(1+((annualInterestRate/MONTHS_IN_YEAR)/100),numberOfMonths) - 1;
        double monthlyAmount = loanAmount * (numerator/denominator);
        return monthlyAmount;
    }

    /**
     * Determines the day of the week, date, month, and year the loan will be fully paid out based on
     * the day and month of the application and if the user chooses express processing
     * @param applicationMonth month the loan application was submitted
     * @param applicationDay day the loan application was submitted
     * @param expressProcessing how long it took for the user to receive their loans
     * @return String with day of the week, date, month, and year the loan will be disbursed
     * @throws IllegalArgumentException if the application month and day are not between June 1 and
     * August 15
     */
    public static String getDisbursementDate(int applicationMonth, int applicationDay, boolean expressProcessing){
        int date = 0;
        int dMonth = applicationMonth;
        if(expressProcessing && isValidDate(applicationMonth,applicationDay)) {
            if(applicationMonth == JUNE) {
                if(applicationDay > 0 && applicationDay <= 27){
                    date += applicationDay + 3;
                } else if (applicationDay == 28) {
                    date = 1;
                    dMonth += 1;
                } else if (applicationDay == 29) {
                    date = 2;
                    dMonth += 1;
                } else if (applicationDay == 30) {
                    date = 3;
                    dMonth += 1;
                }
            } else if (applicationMonth == JULY) {
                if(applicationDay > 0 && applicationDay <= 28){
                    date += applicationDay + 3;
                } else if (applicationDay == 29) {
                    date = 1;
                    dMonth += 1;
                } else if (applicationDay == 30) {
                    date = 2;
                    dMonth += 1;
                } else if (applicationDay == 31) {
                    date = 3;
                    dMonth += 1;
                }
            } else if (applicationMonth == AUGUST) {
                date += applicationDay + 3;
            }
        } else if (!expressProcessing && isValidDate(applicationMonth,applicationDay)){
            if(applicationMonth == JUNE) {
                if(applicationDay > 0 && applicationDay <= 9){
                    date += applicationDay + 21;
                } else if (applicationDay > 9) {
                    date = applicationDay- 9;
                    dMonth += 1;
                }
            } else if (applicationMonth == JULY) {
                if(applicationDay > 0 && applicationDay <= 10){
                    date += applicationDay + 21;
                } else if (applicationDay > 10) {
                    date = applicationDay- 10;
                    dMonth += 1;
                }
            } else if (applicationMonth == AUGUST) {
                if(applicationDay > 0 && applicationDay <= 10){
                    date += applicationDay + 21;
                } else if (applicationDay > 10) {
                    date = applicationDay- 10;
                    dMonth += 1;
                }
            }
        }
        int w = CURRENT_YEAR - (14 - dMonth) / MONTHS_IN_YEAR;
        int x = w + w / 4 - w / 100 + w / 400;
        int z = dMonth + 12 * ((14 - dMonth) / 12) - 2;
        int dow = (date + x + (31 * z) / 12) % 7;

        String dayName ="";
        switch(dow) {
            case 0:
                dayName = "Sun";
                break;
            case 1:
                dayName = "Mon";
                break;
            case 2:
                dayName = "Tue";
                break;
            case 3:
                dayName = "Wed";
                break;
            case 4:
                dayName = "Thu";
                break;
            case 5:
                dayName = "Fri";
                break;
            case 6:
                dayName = "Sat";
                break;
        }

        String finalDisbursementDate = dayName + ", " + dMonth + " " + date + " " + CURRENT_YEAR;
        return finalDisbursementDate;
    }
}
