import java.util.Scanner;
class sort012{

    public static void main(String... args){
         try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            int arr[] = new int[N];
            int i=0;
            System.out.println("Enter Array: ");
            for(i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            sort012( arr , N);
            System.out.println("Sorted without sorting :");
            for(i= 0; i < N; i++){
                System.out.println(arr[i]);
            }
         }

    }
    private static void sort012(int a[], int n)
    {
        int c [] = {0,0,0};
        // code here 
        for(int i =0; i< n ; i++){
            if(a[i]==0)
                c[0]++;
            else if(a[i]==1)
                c[1]++;
            else if(a[i]==2)
                c[2]++;
        }
        for(int i=0,j=0 ; j<3;j++){
        while(c[j]-->0)    
            a[i++]=j;
        }
    }
}