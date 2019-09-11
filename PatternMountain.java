package Lecture2.Assignment;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(),k=0,val=1;
		
		for(int i=1 ; i<=N ; ++i)
		{
			val=1;
			for(k=0;k<i;++k)
			{
				System.out.print(val + " ");
				val++;
			}
			for(k=1;k<(2*N-2*i);k++)
				System.out.print("  ");
			val=i;
			if(i==N)
				val--;
			for(k=1;k<=i;++k)
			{
				if(i==N && k==i)
					return;
				System.out.print(val + " ");
				val--;
			}
			System.out.println();
		}
	}

}
