/**
Given an array, rotate the array by one position in clock-wise direction
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 */
import java.util.Scanner;
import java.util.*;
class CycleArray{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int i=0;
            int arr[]= new int[n];
            for(i = 0; i < n ; i++){
                arr[i]=sc.nextInt();
            }
            solution(arr,n);
            System.out.println("Output: "+Arrays.toString(arr));
        }
    }
    private static void solution(int arr[], int n){
        int temp=0;
        for(int i= n-1;i>0;i--){
            temp = arr[i];
            arr[i]= arr[i-1];
            arr[i-1] = temp; 
        }
    }

}