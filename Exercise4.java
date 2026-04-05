package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //q1

        int[] nums = {6,15,4,6};

        if(nums[0] == nums[3]){
            System.out.println(nums[0] + " and " + nums[3] + " are equels");
        }else{
            System.out.println(nums[0] + " and " + nums[3] + " are not equels");
        }



        //q2


        int total =0;

        int[] nums = {1,4,17,7,25,3,100};

        for(int i = 0;i <= nums.length - 1;i++){
            total = total + nums[i];

        }
        double average = (double) total / nums.length;
        System.out.println("The average of array is " + average);

        for(int i = 0;i<= nums.length -1;i++){
            if(nums[i] > average){
                System.out.println(nums[i] + " is grater than average");
            }
        }



        //q3

        int[] nums = {20,30,40};
        int large = nums[0];

        if(large > nums[nums.length - 1]){
            System.out.println("large is " + large);
        }else{
            System.out.println("large is " + nums[nums.length -1]);
        }



        //q4

        int[] nums = {20,30,40};

        int firsElement = nums[0];
        int lastElement = nums[nums.length -1];

        nums[0] = lastElement;
        nums[nums.length -1] = firsElement;

        System.out.print("The new array:");
        for(int i =0;i < nums.length;i++){
            System.out.print(nums[i] + " ");
        }



        //q5

        int[] nums = {2,3,40,1,5,9,4,10,7};

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 != 0) {
                left++;
            }else if (nums[right] % 2 == 0) {
                right--;
            }else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }



        //q6

        int[] array1 = {2,3,6,6,4};
        int[] array2 = {2,3,6,6,4};

        System.out.println(Arrays.equals(array1,array2));


    }
}
