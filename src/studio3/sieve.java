package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("What is n?");
		int n =in.nextInt();
		boolean []sieve=new boolean[n];
		for(int i=0;i<n;i++) 
		{
			sieve[i]=true;
		}
	
		for(int i=2;i<Math.round(Math.sqrt(n));i++) 
		{
			for(int j=i*i;j<n;j+=i) 
			{
				sieve[j]=false;
			}
		}
		
		
		for(int i=2;i<n;i++) 
		{
			if(sieve[i]) 
			{
				System.out.print(i+" ");
			}
			
		}
		
	}

}
