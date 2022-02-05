/**
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
 */

import java.util.Scanner;

class MoveAllNegative{

    public static void main(String... args){
         try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            int arr[] = new int[N];
            int i=0;
            System.out.println("Enter Array: ");
            for(i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            solution( arr , N);
            System.out.println("Output Array :");
            for(i= 0; i < N; i++){
                System.out.println(arr[i]);
            }
         }
    }

    private static void solution(int arr[], int n){
        int j =0,temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
    }
}