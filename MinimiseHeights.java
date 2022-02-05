
/**Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each 
tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer. 
Find out the minimum possible difference of the height of shortest and longest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease (if possible) by K to each tower.
Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5.
 */
import java.util.Scanner;
import java.util.Arrays;

class MinimiseHeights {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            int i = 0;
            int arr[] = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = solution(arr, n, k);
            System.out.println("Output: " + result);
        }
    }

    private static int solution(int arr[], int n, int k) {

        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int min = 0, max = 0;
        int small = arr[0] + k;
        int large = arr[n - 1] - k;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= k) {
                min = Math.min(small, arr[i] - k);
                max = Math.max(large, arr[i] + k);
                ans = Math.min(ans, max - min);
            }
        }
        return ans;
    }
}