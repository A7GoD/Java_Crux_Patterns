package Lecture2.Assignment;

import java.util.Scanner;

public class PatternHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int val=N,gap1=0,gap2=N-1,val2=1,k=1;
		for(int i=1 ; i<=2*N+1 ; ++i)
		{
			if(i<=N+1)
			{				
				for(k=1;k<=gap1;++k)
					System.out.print("  ");
				for(k=1;k<=(2*N+1)-2*gap1;++k)
				{
					System.out.print(val + " ");
					if(k<=N-gap1)
						--val;
					else
						++val;
				}
				gap1++;
				val=N-i;
			}
			else
			{
				for(k=1;k<=gap2;++k)
					System.out.print("  ");
				for(k=1;k<=(2*N+1)-2*gap2;++k)
				{
					System.out.print(val2 + " ");
					if(k<=N-gap2)
						--val2;
					else
						++val2;
				}
				gap2--;
				val2=i-N;
			}
			System.out.println();
		}
	}
}
