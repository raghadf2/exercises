package Exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


    //q1

    String isAdmin = "admin";
    String isSuperuser = "superuser";
    String isuUser = "user";

    System.out.print("Enter your role: ");
    String role = input.nextLine();

    if(role.equalsIgnoreCase(isAdmin)){
        System.out.println("welcome admin");
    } else if(role.equalsIgnoreCase(isSuperuser)){
        System.out.println("welcome superuser");
    } else if(role.equalsIgnoreCase(isuUser)){
        System.out.println("welcome user");
    } else{
        System.out.print("This role is not registered");
    }



    //q2

    System.out.print("Enter the first number: ");
    int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
    int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
    int num3 = input.nextInt();

    if(num1 >= num2 && num1 >= num3){
        System.out.print("greatest: " + num1);
    } else if(num2 >= num1 && num2 >= num3){
        System.out.print("greatest: " + num2);
    } else if(num3 >= num1 && num3 >= num2){
        System.out.print("greatest: " + num3);
    }



    //q3

    Random random = new Random();

    int num = random.nextInt(6) + 1;

        switch (num){
        case 1:
            System.out.print("Sunday");
            break;
        case 2:
            System.out.print("Monday");
            break;
        case 3:
            System.out.print("Tuesday");
            break;
        case 4:
            System.out.print("Wednesday");
            break;
        case 5:
            System.out.print("Thursday");
            break;
        case 6:
            System.out.print("Friday");
            break;
        case 7:
            System.out.print("Saturday");
            break;
        default:
            System.out.print("Invalid number. No matching day found");
    }



    //q4

    System.out.print("Enter your numeric score: ");
    int score = input.nextInt();

    if(score >= 90 && score <= 100){
        System.out.print("Your grade is A");
    } else if(score >= 80 && score < 90) {
        System.out.print("Your grade is B");
    } else if(score >= 70 && score < 80) {
        System.out.print("Your grade is C");
    } else if(score >= 60 && score < 70) {
        System.out.print("Your grade is D");
    } else if(score >= 0 && score < 50) {
        System.out.print("Your grade is F");
    } else {
        System.out.print("Invalid score. Please enter a number between 0 and 100");
    }



    //q5

    System.out.print("Enter your age: ");
    int age = input.nextInt();

    if(age < 13 && age > 0){
        System.out.print("You are an Child.");
    } else if(age >= 13 && age <= 19) {
        System.out.print("You are an Teenager.");
    } else if(age >= 20) {
        System.out.print("You are an Adult.");
    } else {
        System.out.print("Invalid age. Please enter a valid age");
    }


}
}

