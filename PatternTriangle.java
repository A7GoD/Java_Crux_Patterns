package Lecture2.Assignment;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int val=1;
		for(int i=1 ; i<=N ; ++i)
		{
			val=i;
			for(int j=0;j<N-i;++j)
				System.out.print("  ");
			for(int k=1 ; k<=2*i-1 ; ++k)
			{
				System.out.print(val + " ");
				if(k<(2*i)/2)
					val++;
				else
					val--;
			}
			System.out.println();
		}
	}

}
