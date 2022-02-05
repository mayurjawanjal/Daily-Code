/**
 Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2

Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int i = 0;
            int arr[] = new int[n+1];
            for (i = 0; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = solution(arr, n);
            System.out.println("Output: " + result);
        }
    }
    private static int solution(int arr[] , int n) {
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<=n;i++){
            if(!set.contains(arr[i]))
                set.add(arr[i]);
            else 
                return arr[i];
        }
        return -1;
    }
}
