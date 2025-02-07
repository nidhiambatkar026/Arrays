import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int A[] = new int[N];
		
		//input
		for(int i=0;i<=N;i++){
		    A[i] = sc.nextInt();
		}
		
		//output
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		
		       if(A[i] == X){
		         System.out.print("YES");
		       }
		       else{
		         System.out.print("NO");
	           }
		   }
		}

	}
}
