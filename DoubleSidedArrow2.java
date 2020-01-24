package Lecture2.Assignment;
import java.util.Scanner;

public class DoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int gap1=2*((N+1)/2-1)+2,gap2=0,k=0,val1=1,val2=1;
		for(int i=1 ; i<=N ; ++i)
		{
			if(i<=(N+1)/2)
			{
				val1=i;
				val2=1;
				gap1-=2;
				for(k=1 ; k<=gap1; ++k)
					System.out.print("  ");
				for(k=1;k<=i;++k)
				{
					System.out.print(val1 + " ");
					--val1;
				}
				for(k=1 ; k<=gap2 ; ++k)
					System.out.print("  ");
				for(k=1 ; k<=i;++k)
				{
					if(i==1 && k==1)
						continue;
					System.out.print(val2 + " ");
					val2++;
				}
				gap2=2*i-1;
			}
			else
			{
				if(i==(N+1)/2+1)
					gap2-=2;
				gap1+=2;
				val1=N-i+1;
				val2=1;
				gap2-=2;
				for(k=1 ; k<=gap1 ;++k)
					System.out.print("  ");
				for(k=1; k<=N-i+1 ; ++k)
				{
					System.out.print(val1 + " ");
					val1--;
				}
				for(k=1 ; k<=gap2 ; ++k)
					System.out.print("  ");
				for(k=1 ; k<=N-i+1 ; ++k)
				{
					if(i!=N)
					{
						System.out.print(val2 + " ");
						val2++;
					}
				}
			}
			System.out.println();
		}
	}
}
