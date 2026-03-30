package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       //q1

        System.out.print("Enter your weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter your height (m): ");
        double height = input.nextDouble();

        System.out.print("Your BMI = " + weight / ((height) * (height)));



        //q2

        System.out.print("Enter the obtained marks: ");
        double obtainedMarks = input.nextDouble();

        System.out.print("Enter the total marks: ");
        double totalMarks = input.nextDouble();

        System.out.print("Percentage = " + ((obtainedMarks /totalMarks ) * 100) + "%");



        //q3

        System.out.print("Enter the amount in SAR : ");
        double amount = input.nextDouble();

        System.out.print("Enter the exchange rate (SAR to AED) : ");
        double exchangeRate = input.nextDouble();

        System.out.print("Amount in AED : " + (amount * exchangeRate));



        //q4


        System.out.print("Enter string : ");
        String string1 = input.nextLine();

        System.out.println("The length of the string: " + string1.length());
        System.out.println("The reversed string: " + new StringBuilder(string1).reverse().toString());



        //q5

        System.out.print("Enter sentence : ");
        String sentence1 = input.nextLine();

        System.out.println(sentence1.substring(1,6));



        //q6

        System.out.print("Enter sentence : ");
        String sentence2 = input.nextLine();

        System.out.print("Enter keyword : ");
        String keyword1 = input.nextLine();

        //هذه الطريقة بتطلع boolean ما راح اقدر اطلع الكي وورد بال output الا اذا استخدمت if
        System.out.print(sentence2.contains(keyword1));



        //q7

        System.out.print("Enter sentence : ");
        String sentence3 = input.nextLine();

        System.out.print("Enter Word to replace : ");
        String wordToReplace = input.nextLine();

        System.out.print("Enter Replacement Word : ");
        String replacementWord = input.nextLine();

        System.out.print(sentence3.replace(wordToReplace , replacementWord));



        //q8

        System.out.print("Enter string 1 : ");
        String string2 = input.nextLine();

        System.out.print("Enter string 2 : ");
        String string3 = input.nextLine();

        //هذه الطريقة ايضا بتطلع ال boolean output ما قدرت اطلع جملة مطابقة او غير مطابقة الا اذا استخدمت if
        System.out.print(string2.equalsIgnoreCase(string3));



    }
}