package Exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //q1
        System.out.println("input the first number ");
        int num1 = input.nextInt();
        System.out.println("input the second number ");
        int num2 = input.nextInt();
        System.out.println("input the third number ");
        int num3 = input.nextInt();

        smallestNumber(num1,num2,num3);

        //q2
        System.out.println("input number ");
        int num = input.nextInt();
        checkNum(num);

        //q3
        System.out.println(" A password must have at least 8 characters. " +
                "\n A password consists of only letters an digits. " +
                "\n A password must contain at least 2 digits.");
        System.out.println(" ");
        System.out.println("input a password (You are agreeing to the above Terms and Conditions) : ");
        String password = input.nextLine();
        checkPassword(password);
    }
    //q1
    public static void smallestNumber(int num1,int num2 ,int num3){
        int smallest = num1;
        if(num2 < smallest){
            smallest = num2;
        }if(num3 < smallest) {
            smallest = num3;
        }
        System.out.println("the smallest value is " + smallest);
    }

    //q2
    public static void checkNum(int num){
        if(num > 0){
            System.out.println("Positive number");
        }if(num < 0){
            System.out.println("Negative number");
        }if(num == 0){
            System.out.println("Zero");
        }
    }

    //q3
    public static void checkPassword(String password) {
        boolean isLetterorDigit = true;
        int counterDigit = 0;
        int counterLetter =0;
        if (password.length() >= 10) {
            for (int i = 0; i <= password.length() - 1; i++) {
                char ch = password.charAt(i);

                if(Character.isDigit(ch)) {
                    counterDigit++;
                }if(Character.isLetter(ch)){
                    counterLetter++;
                }if(!Character.isLetter(ch) && !Character.isDigit(ch)) {
                    isLetterorDigit = false;
                }
            }
            if (counterDigit >= 2 && isLetterorDigit && counterLetter >= 1) {
                System.out.println("WELCOME!");
            } else {
                System.out.println("Your password invalid ");
            }
        }


    }
}
