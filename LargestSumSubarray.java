
/**
 * find Largest sum contiguous Subarray 
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class LargestSumSubarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i = 0;
            int arr[] = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = solution(arr, n);
            System.out.println("Output: " + sum);
        }
    }

    private static int solution(int arr[], int n) {
        int sum = 0, max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                sum += arr[i];
            } else if (max < sum) {
                max = sum;
                sum = 0;
                continue;
            }
        }
        return max;
    }
}
