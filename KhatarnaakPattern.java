package Lecture2;

import java.util.Scanner;

public class KhatarnaakPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	 _k_|1 2 3 4 5 6 7
//  i|===============
//	1|	4 4 4 4 4 4 4
//	2|	4 3 3 3 3 3 4
//	3|	4 3 2 2 2 3 4
//	4|	4 3 2 1 2 3 4
//	5|	4 3 2 2 2 3 4
//	6|	4 3 3 3 3 3 4
//	7|	4 4 4 4 4 4 4
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int val=N;
		for(int i=1;i<=2*N-1;++i)
		{
			val=N;
			for(int k=1;k<=2*N-1;++k)
			{
				System.out.print(val+" ");
				if(i<N)
				{
					if(k<N)
					{
						if((N-i)<(N-k))
							val--;
					}
					else
					{
						if(2*N-k<=i)
							val++;
					}
				}
				else if(i==N)
				{
					if(k<N)
						val--;
					else
						val++;
				}
				else
				{
					if(k<N)
					{
						if(2*N-i>k)
							val--;
					}
					else
					{
						if(k>=i)
							val++;
					}
				}
		    }
			System.out.println();
		}
	}
}
