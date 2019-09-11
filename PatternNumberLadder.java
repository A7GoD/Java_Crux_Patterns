package Lecture2.Assignment;

import java.util.Scanner;

public class PatternNumberLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(),val=1;
		for(int i=1 ; i<=N ; ++i)
		{
			for(int k=1 ; k<=i ; ++k)
			{
				System.out.print(val + " ");
				val++;
			}
			System.out.println();
		}
	}

}
