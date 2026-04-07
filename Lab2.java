package Labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //q1

        String[] words = {"cat","car","book","go"};
        ArrayList<String> longestWords = new ArrayList<>();

        int longest = words[0].length(); // cat
        for(int i=0;i <= words.length -1;i++){
            if(words[i].length() > longest){
                longest = words[i].length();
            }
        }
        for(int i=0;i <= words.length -1;i++){
            if(words[i].length() == longest){
                longestWords.add(words[i]);
            }
        }
        System.out.println(longestWords);


        //q2

        int[] numbers = {1,1,1,3,3,5};

        System.out.println("input number to count ");
        int num = input.nextInt();

        int count=0;

        for(int i =0;i<=numbers.length -1;i++){
            if(numbers[i] == num ){
                count++;
            }
        }
        System.out.println(num + " occurs " + count + " times");


        //q3

        int[] numbers = {1,4,17,7,25,3,100};
        ArrayList<Integer> kLargestNumber = new ArrayList<>();

        System.out.println("enter k");
        int k = input.nextInt();

        Arrays.sort(numbers);

        for(int i = numbers.length -1 ;i >= numbers.length -k;i--){
            kLargestNumber.add(numbers[i]);
        }
        System.out.println(k + " largest elements of the side array are: " + kLargestNumber);



        //q4

        int[] numbers = {5,4,3,2,1};
        reverse(numbers);



        //q5

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Accept elements");
            System.out.println("2. Display elements");
            System.out.println("3. Search element");
            System.out.println("4. Sort array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter elements:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = input.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Array elements:");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int key = input.nextInt();
                    boolean found = false;

                    for (int i = 0; i < size; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found");
                    }
                    break;

                case 4:
                    Arrays.sort(arr);
                    System.out.println("Array sorted successfully");
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        input.close();



        //q6

        System.out.print("Enter minimum number: ");
        int min = input.nextInt();

        System.out.print("Enter maximum number: ");
        int max = input.nextInt();


        System.out.println("How many random numbers you want? ");
        int count = input.nextInt();

        System.out.println("Random numbers:");


        for (int i = 0; i < count; i++) {
            int randomNumber = generateRandom(min, max);
            System.out.println(randomNumber);
        }


        //q7
        System.out.println("Enter a password ");
        String password = input.nextLine();

        evaluatePassword(password);



        //q8

        System.out.println("Enter number of terms: ");
        int terms = input.nextInt();
        generateFibonacci(terms);



    }



    //q4
    public static void reverse(int[] numbers){
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }

    //q6
    public static int generateRandom(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    //q7 كنت مسويه الثلاث عمليات كا ثلاث دوال كل دالة تسوي عملية لكن جمعت الحل بهذي الدالة طلع لي مشاكل ما بقى وقت احلها بوقت الاب بحلها بعد الاب
    public static void evaluatePassword(String password){

        int lengthPoints =0;
        if(password.length()<= 5){
            lengthPoints = 0;
        }else if(password.length()== 6 || password.length()== 7){
            lengthPoints =2;
        }else if(password.length() >=8){
            lengthPoints = 3;
        }

        int speciCharctPoints = 0;
        for(int i=0;i <= password.length() -1;i++){
            char ch = password.charAt(i);
            if(!Character.isLetter(ch)){
                speciCharctPoints =2;
            }else{
                speciCharctPoints = 0;
            }
        }

        int upperLowerCasePoints =0;
        for(int i=0;i <= password.length() -1;i++){
            char ch = password.charAt(i);
            if(!Character.isLetter(ch) && !Character.isDigit(ch)){
                upperLowerCasePoints =0;
            }else{
                upperLowerCasePoints =3;
            }
        }

        int sumPoints = (lengthPoints + speciCharctPoints + upperLowerCasePoints);
        if(sumPoints >= 8){
            System.out.println("password is strong ");
        }else if(sumPoints >= 5){
            System.out.println("password is moderately strong ");
        }else if(sumPoints <5){
            System.out.println("password is weak ");
        }

    }

    /*
    public static int checkLength(String password){
        int lengthPoints =0;
        if(password.length()<= 5){
            lengthPoints = 0;
        }else if(password.length()== 6 || password.length()== 7){
            lengthPoints =2;
        }else if(password.length() >=8){
            lengthPoints = 3;
        }
        return lengthPoints;
    }

     */
    /*
    public static int checkSpecificalCharacters(String password){
        int speciCharctPoints = 0;
        for(int i=0;i <= password.length() -1;i++){
            char ch = password.charAt(i);
            if(!Character.isLetter(ch)){
                speciCharctPoints =2;
            }else{
                speciCharctPoints = 0;
            }
        }
        return speciCharctPoints;
    }

     */
    /*
    public static int checkUpperCaseLowerCase(String password){
        int upperLowerCasePoints =0;
        for(int i=0;i <= password.length() -1;i++){
            char ch = password.charAt(i);
            if(!Character.isLetter(ch) && !Character.isDigit(ch)){
                upperLowerCasePoints =0;
            }else{
                upperLowerCasePoints =3;
            }
        }
        return upperLowerCasePoints;
    }

     */

    //q8
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }






}
