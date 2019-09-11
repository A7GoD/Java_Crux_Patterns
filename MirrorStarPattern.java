package Lecture2.Assignment;

import java.util.Scanner;

public class MirrorStarPattern {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int i=0,j=0,k=0,l=N-2;
		for(i=1 ; i<=N ; i++)
		{
			if(i<=(N+1)/2)
			{
				for(j=0 ; j<(N+1)/2-i ; ++j)
					System.out.print("  ");
				for(k=1 ; k<=2*i-1 ; ++k)
					System.out.print("* ");
			}
			else
			{
				for(j=1 ; j<=i-(N+2)/2; ++j)
					System.out.print("  ");
				for(k=1;k<=l;++k)
					System.out.print("* ");
				l=l-2;
			}
			System.out.println();
		}
	}
}
