package Lecture2.Assignment;
import java.util.Scanner;

public class PatternMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(),gap=0,k=1;
		for(int i=1 ; i<=2*N-1 ; ++i)
		{
			for(k=1 ; k<=N-(gap+1)/2 ; ++k)
					System.out.print("*");
			for(k=1;k<=gap;++k)
				System.out.print(" ");
			for(k=N-(gap+1)/2;k>=1;--k)
			{
				System.out.print("*");
				if(i==1 || i==2*N-1)
					--k;
			}
			if(i==1 || i==2*N-1)
				System.out.print("*");
			if(i==1)
				gap=1;
			if(i>=2 && i<N)
				gap+=2;
			if(i>=N && i<2*N-1)
				gap-=2;
			System.out.println();
		}
	}
}
