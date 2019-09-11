package Lecture2.Assignment;
import java.util.Scanner;

public class PatternRhombus {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int val=1,j=0,k=1;
		for(int i=1 ; i<=2*N-1 ; i++)
		{
			if(i<=N)
			{
				val=i;
				for( j=0 ; j<N-i ; ++j)
					System.out.print("  ");
				for(k=1 ;k<=2*i-1 ; ++k)
				{
					System.out.print(val + " ");
					if(k<i)
						val++;
					else
						val--;
				}
			}
			else
			{
				val=2*N-i-1;
				for(j=0;j<i-N;++j)
					System.out.print("  ");
				for( k=1;k<2*N-2*(i-N);++k)
				{
					if(k<=(2*N-2*(i-N))/2)
						val++;
					else
						val--;
					System.out.print(val + " ");
				}
			}
			System.out.println();
		}
	}
}
