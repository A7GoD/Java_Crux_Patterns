package Lecture2.Assignment;
import java.util.Scanner;

public class HollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int k=0,gap=1,stars=(N+1)/2-1;
		for(int i=1 ; i<=N ; ++i)
		{
			if(i==1 || i==N)
			{
				for(k=1;k<=N;++k)
					System.out.print("* ");
			}
			else
			{
				for(k=1;k<=stars;++k)
					System.out.print("* ");
				for(k=1;k<=gap;++k)
					System.out.print("  ");
				for(k=1;k<=stars;++k)
					System.out.print("* ");
				if(i<(N+1)/2)
				{
					gap+=2;
					stars--;
				}
				else
				{
					gap-=2;
					stars++;
				}
			}
			System.out.println();
		}
	}
}
