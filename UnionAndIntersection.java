/**Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. 
If there are repetitions, then only one occurrence of element should be printed in the union. 

Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
*/

import java.util.Scanner;
import java.util.*;
import java.util.stream.*;
class UnionAndIntersection{
    public static void main(String... args){
        

    try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println("Array1 :");
            String a[] = new String[n];
            String b[] = new String[m];
            int i=0;
            for(i= 0; i < n; i++){
                a[i] = sc.next();
                
            }
            System.out.println("Array2 :");
            for(i= 0; i < m; i++){
                b[i] = sc.next();
                
            }
            System.out.println("Output : "+ solution(a,n,b,m));
        }
        
    }
    private static int solution(String a[],int n ,String b[], int m){
        Set<String> list = Arrays.stream(a).collect(
            Collectors.toSet());
        list.addAll(Arrays.stream(b).collect(
            Collectors.toSet()));
        return list.size();
    }
}