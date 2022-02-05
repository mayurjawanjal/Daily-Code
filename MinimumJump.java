/*
Given an array of N integers arr[] where each element represents the max number of steps that can be made forward from 
that element. Find the minimum number of jumps to reach the end of the array (starting from the first element). If an 
element is 0, then you cannot move through that element.

Note: Return -1 if you can't reach the end of the array.

Input:
N = 11 
arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
Output: 3 
Explanation: 
First jump from 1st element to 2nd 
element with value 3. Now, from here 
we jump to 5th element with value 9, 
and from here we will jump to last. 
*/

import java.util.Scanner;

public class MinimumJump {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int i = 0;
            int arr[] = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = solution(arr, n);
            System.out.println("Output: " + result);
        }
    }

    private static int solution(int arr[], int n) {
        int jump = 0;
        int i = 0;
        while (i < n - 1) {
            if (arr[i] == 0)
                return -1;
            i += arr[i];
            jump++;
        }

        return jump;
    }
}
