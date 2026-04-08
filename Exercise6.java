package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //q1

        try {
            System.out.println("");
            System.out.println(" WELCOME to StandardCalc ! ");
            System.out.println(" ");
            System.out.println(" input first number ");
            int num1 = input.nextInt();
            System.out.println(" input second number ");
            int num2 = input.nextInt();
            calculatorApp(num1, num2);
        }catch(ArithmeticException e){
            System.out.println("you can not divided by 0 ");
        }catch(InputMismatchException e){
            System.out.println("You should enter number! ");
        }catch(Exception e){
            System.out.println("Unexpected error!");
        }



        //q2

        try{
        System.out.println("Input the number you want the multiplication table for ");

            int number = input.nextInt();
            System.out.println(number + " multiplication table:");

            int multiplication =1;
            for(int i = 1;i<= 10;i++){
                multiplication = number * i;
                System.out.println(number + " x " + i + " = " + multiplication);
            }
        }catch(InputMismatchException e){
            System.out.println("You should enter number! ");
        }catch(Exception e){
            System.out.println("Unexpected error!");
        }



        //q3

        try{
        System.out.println("Enter the Radius: ");

            double radius = input.nextDouble();

            System.out.println("Perimeter is " + (2 * 3.14 * radius));
            System.out.println("Area is " + (3.14 * (radius * radius)));
        }catch(InputMismatchException e){
            System.out.println("You should enter number! ");
        }catch(Exception e){
            System.out.println("Unexpected error!");
        }



        //q4

        try {
            System.out.println("Enter the count of numbers: ");
            int num = input.nextInt();

            calculateAverage(num);

            int sum = 0;
            for (int i = 1; i <= num; i++) {
                System.out.println("Enter an integer: ");
                int nums = input.nextInt();
                sum += nums;
            }
            System.out.println("The average is: " + (sum / num));

        }catch (InputMismatchException e) {
            System.out.println("You should enter number!");
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Unexpected error!");
        }



        //q5

        try{
        System.out.println("Input the first number ");

        int num1 = input.nextInt();
        System.out.println("Input the second number ");
        int num2 = input.nextInt();
        System.out.println("Input the third number ");
        int num3 = input.nextInt();

        int sum = num1 + num2;
        boolean equal = true;
        if(sum == num3){
            System.out.println("The result is " + equal);
        }else{
            equal = false;
            System.out.println("The result is " + equal);
        }
        }catch(InputMismatchException e){
            System.out.println("You should enter number! ");
        }catch(Exception e){
            System.out.println("Unexpected error!");
        }




        //q6 ما حسيت التراي والكاتش لها فائدة هنا لاني جربت واشتغل عادي

        try{
        System.out.println("Input a word ");

            String str = input.nextLine();
            String revesed = new StringBuilder(str).reverse().toString();
            System.out.println(revesed);
        }catch(Exception e){
            System.out.println("Unexpected error!");
        }



        //q7

        try{
        System.out.println("input number to check is even or odd ");

            int num = input.nextInt();
            checkEvenOdd(num);
        }catch(InputMismatchException e){
            System.out.println("You should enter number! ");
        }catch(Exception e){
            System.out.println("Unexpected error!");
        }


        //q8

        try{
        System.out.println("Enter temperature in Centigrade: ");

            double temCent = input.nextInt();

            double temFahr = ((temCent) * (9.0 / 5) + (32));
            System.out.println("Temperature in Fahrenheit is: " + temFahr);
        }catch(InputMismatchException e){
            System.out.println("You should enter number! ");
        }catch(Exception e){
            System.out.println("Unexpected error!");
        }




        //q9

        try {
            System.out.println("input string ");
            String str = input.nextLine();

            System.out.println("input index ");
            int num = input.nextInt();

            getChar(str, num);

        }catch (InputMismatchException e) {
            System.out.println("You should enter number!");
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }catch (Exception e) {
            System.out.println("Unexpected error!");
        }



        //q10

        try{
        System.out.println("Enter the width of the rectangle: ");

        double width = input.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double height = input.nextDouble();

        System.out.println("Area is " +(width * height) );
        System.out.println("Perimeter is " +(2 * (width + height)) );
        }catch(InputMismatchException e){
            System.out.println("You should enter number! ");
        }catch(Exception e){
            System.out.println("Unexpected error!");
        }



        //q11

        try {
        System.out.println("input the first number ");

            int num1 = input.nextInt();
            System.out.println("input the second number ");
            int num2 = input.nextInt();

            compareNumers(num1, num2);
        }catch(Exception e){
            System.out.println("Unexpected error!");
        }


        //q12

        try {
        System.out.println("enter seconds: ");

            int seconds = input.nextInt();

            System.out.println((seconds / 3600) + ":" + ((seconds % 3600) / 60) + ":" + (seconds % 60));
        }catch (InputMismatchException e) {
            System.out.println("You should enter number!");
        }catch(Exception e){
            System.out.println("Unexpected error!");
        }


        //q13

        try {
            System.out.println("Input first number: ");
            int num1 = input.nextInt();
            System.out.println("Input second number: ");
            int num2 = input.nextInt();
            System.out.println("Input third number: ");
            int num3 = input.nextInt();
            System.out.println("Input fourth number: ");
            int num4 = input.nextInt();

            if ((num1 == num2) && (num1 == num3) && (num1 == num4)) {
                System.out.println("Numbers are equal");
            } else {
                System.out.println("Numbers are not equal! ");
            }
        }catch (InputMismatchException e) {
            System.out.println("You should enter number!");
        }



        //q14

        try {
            System.out.println("input number ");
            int num = input.nextInt();

            if (num > 0) {
                System.out.println(num + " is positive");
            }
            if (num < 0) {
                System.out.println(num + " is negative");
            }
            if (num == 0) {
                System.out.println("zero");
            }
        }catch (InputMismatchException e) {
            System.out.println("You should enter number!");
        }





        //q15

        try {
            System.out.println("input number ");
            int num = input.nextInt();

            int positive = 0;
            int negatives = 0;
            int zero = 0;
            int count = 0;
            while (num != -1) {
                if (num > 0) {
                    positive++;
                }
                if (num < 0) {
                    negatives++;
                }
                if (num == 0) {
                    zero++;
                }
                System.out.println("input number ");
                num = input.nextInt();
                count++;
            }
            System.out.println(positive + " positive");
            System.out.println(negatives + " negatives");
            System.out.println(zero + " zero");
        }catch (InputMismatchException e) {
            System.out.println("You should enter number!");
        }




        //q16

        System.out.println("Enter the count of numbers: ");
        int num = input.nextInt();

        int reversed = 0;

        try {
            while (num != 0) {

                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num / 0;
            }
        System.out.println("reversed: " + reversed);
        }catch(ArithmeticException e){
            System.out.println("you can not divided by 0 ");
        }catch(Exception e){
            System.out.println("Unexpected error!");
        }





        //q17

        System.out.println("input number");
        int num = input.nextInt();

        int largest = num;
        int smallest = num;
        int counter =0;

        while(num != -1){
            if(num > largest){
                largest = num;
            }if(num < smallest){
                smallest = num;
            }
            System.out.println("input number");
            num = input.nextInt();
            counter++;
        }
        System.out.println("largest " +largest);
        System.out.println("smallest " +smallest);



        //q18

        System.out.println("Enter String: ");
        String text = input.nextLine();

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Number of a's: " + count);






    } // end of main


    //q1
    public static void calculatorApp(int num1,int num2){
        Scanner input = new Scanner(System.in);

        int num ;
        do{
            System.out.println(" please choice from list what do you want do! ");
            System.out.println(" Enter 1 to do addition ");
            System.out.println(" Enter 2 to do subtract ");
            System.out.println(" Enter 3 to do multiply ");
            System.out.println(" Enter 4 to do divide ");
            System.out.println(" Enter 5 to do remainder ");
            System.out.println(" Enter 6 to exit ");
            num = input.nextInt();


            switch (num){
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) );
                    break;
                case 5:
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2) );
                    break;
                case 6:
                    System.out.println(" You are now out of StandardCalc.");
                    break;
                default:
                    System.out.println(" Nothing to do");
            }
        }while(num != 6);
    }

    //q4
    public static void calculateAverage(int num) throws IllegalArgumentException {
        if (num <= 0) {
            throw new IllegalArgumentException("Count must be greater than 0");
        }
    }

    //q7
    public static void checkEvenOdd(int num)throws IllegalArgumentException{
        if (num < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        if(num % 2 == 0){
            System.out.println("the number is even ");
        }else{
            System.out.println("the number is odd ");
        }
    }

    //q9
    public static void getChar(String str, int num) throws StringIndexOutOfBoundsException {
        if (num < 0 || num >= str.length()) {
            throw new StringIndexOutOfBoundsException("Invalid index!");
        }

        System.out.println(str.charAt(num));
    }

    //q11
    public static void compareNumers(int num1,int num2){

        if(num1 != num2){
            System.out.println(num1+" != "+num2);
        }if(num1 > num2){
            System.out.println(num1+" > "+num2);
        }if(num1 < num2){
            System.out.println(num1+" < "+num2);
        }if(num1 == num2){
            System.out.println(num1+" == "+num2);
        }


    }

















































}
