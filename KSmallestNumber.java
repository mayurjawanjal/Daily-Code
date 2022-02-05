import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;
class KSmallestNumber{
int min = Integer.MAX_VALUE;
    public static void main(String... args){
         try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            int arr[] = new int[N];
            int i=0;
            System.out.println("Enter Array: ");
            for(i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("Value Of k : ");
            int k = sc.nextInt();
            System.out.println();
            solution( arr , N , k);
         }
    }
    private static void solution(int arr[] , int N , int k){ 
     
        PriorityQueue<Integer> p =new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<N;i++){
            p.add(arr[i]);
            if(p.size()>k){
                p.poll();
            }
        }
        System.out.println(p.peek());
    }  

}