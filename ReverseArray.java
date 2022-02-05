import java.util.Scanner;

class ReverseArray{
    public static void main(String... args){
        try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            System.out.println("Actual :");
            int arr[] = new int[N];
            int i=0;
            for(i= 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            solution(N,arr);
            System.out.println("Reversed :");
            for(i= 0; i < N; i++){
                System.out.println(arr[i]);
            }
        }

    }
    private static void solution(int N, int arr[]){
        int start =0;
        int end = N-1;
        while(start < end){
            arr[start]=arr[start]+arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start]=arr[start] - arr[end];
            start ++;
            end --;
        }
    }
}