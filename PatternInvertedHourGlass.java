package Lecture2.Assignment;

import java.util.Scanner;

public class PatternInvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int gap1=2*N-1,val1=N,val2=N,gap2=1,k=1;
		for(int i=1 ; i<=2*N+1; ++i)
		{
			if(i<=N+1)
			{
				val1=N;
				for(k=1 ; k<=i ; ++k)
				{
					System.out.print(val1 + " ");
					--val1;
				}
				for(k=1 ; k<=gap1 ; ++k)
					System.out.print("  ");
				if(i==N+1)
					val2=1;
				else
					val2=N-i+1;
				for(k=1 ; k<=i ;++k)
				{
					if(i==N+1 && k==i)
						continue;
					System.out.print(val2 + " ");			
					++val2;
				}
				gap1-=2;
			}
			else
			{
				val1=N;
				val2=i-N-1;
				for(k=0 ; k<=N-(gap2+1)/2 ; ++k)
				{
					System.out.print(val1 + " ");
					val1--;
				}
				for(k=1 ; k<=gap2;++k)
					System.out.print("  ");
				for(k=1 ; k<=(N+1)-(gap2+1)/2 ; ++k)
				{
					System.out.print(val2 + " ");
					val2++;
				}
				gap2=gap2+2;
			}
			System.out.println();
		}
	}
}
