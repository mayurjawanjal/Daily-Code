import java.util.Scanner;
 
class MaxMin{
    static int max = Integer. MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String... args){
        try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            int arr[] = new int[N];
            int i=0;
            System.out.println("Enter Array: ");
            for(i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            solution(N,arr);
        }
    }
    private static void solution(int N ,int arr[]){
        int i=0;
        if(N==1){
            max = arr[0];
            min = arr[0];
        }
        else{
            while(i<N){
                if(max < arr[i])
                    max = arr[i];
                if(min > arr[i])
                    min = arr[i];
                i++;
            }
        }
        System.out.println("Minimum : "+min + "\nMaximum : " + max); 
    }
}