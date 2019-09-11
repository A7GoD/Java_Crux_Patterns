package Lecture2.Assignment;

import java.util.Scanner;
import java.lang.Math;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int val;
		for(int i=0 ; i<N ; ++i)
		{
			for(int k=0 ; k<=i ; ++k)
			{
				val=factorial(i)/(factorial(k)*factorial(i-k));
				System.out.print(val);
			}
			System.out.println();
		}
	}
	public static int factorial(int f)
	{
		int ans=1;
		for(int i=2;i<=f;++i)
			ans *= i;				
		return ans;
	}
}
