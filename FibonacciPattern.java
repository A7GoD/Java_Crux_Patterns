package Lecture2.Assignment;

import java.util.Scanner;

public class FibonacciPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int a=0,b=1,val=0;
		for(int i=1 ; i<=N ; ++i)
		{
			for(int k=1;k<=i;++k)
			{
				System.out.print(val + " ");
				a=b;
				b=val;
				val=a+b;
			}
			System.out.println();
		}
	}

}
