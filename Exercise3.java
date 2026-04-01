package Exercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //q1

        for(int i = 1; i <= 100;i++){
            if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else{
                System.out.println(i);
            }
        }



        //q2

        System.out.println("Enter string: ");
        String str = input.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(reversed);



        //q3

        System.out.println("Enter number to find the factorial : ");
        int num = input.nextInt();
        int factorial = 1;

        for(int i = 1; i <= num;i++){
            factorial *= i;
        }
        System.out.println(num + "!" + " = " + factorial);



        //q4

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        int mult = 1;

        for(int i = 1; i <= num2;i++){
            mult = mult * num1;
        }
        System.out.println(num1 + " power " + num2 + " = " + mult);



        //q5

        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Enter -1 to stop");
        int number = input.nextInt();

        while (number != -1){
            if(number % 2 == 0){
                sumEven += number;
            } else if(number % 2 != 0){
                sumOdd += number;
            }
            System.out.println("Enter number");
            number = input.nextInt();
        }
        System.out.println("The sum of even numbers = " + sumEven);
        System.out.println("The sum of odd numbers = " + sumOdd);



        //q6

        System.out.println("Enter a positive integer: ");
        int number = input.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }



        //q7

        for(int i = 1;i <=4; i++){ //weeks loop
            System.out.println("Week " + i);
            for(int j = 1;j <= 7;j++){ //days loop
                System.out.println("Day" + j);
            }
        }



        //q8

        System.out.println("Enter word to check palindrome ");
        String word = input.nextLine();

        char ch1;
        char ch2;

        for(int i = 0;i < word.length() / 2;i++){
            ch1 = word.charAt(i);
            ch2 = word.charAt(word.length()-1 - i);

            if(ch1 != ch2){
                System.out.println("Not palindrome");
                break;
            }
            if(i == word.length() / 2 - 1){
                System.out.println("Palindrome");
            }
        }
    }
}
