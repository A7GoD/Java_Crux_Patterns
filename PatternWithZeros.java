package Lecture2.Assignment;
import java.util.Scanner;

public class PatternWithZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for(int i=1;i<=N;++i)
		{
			for(int k=1;k<=i;++k)
			{
				if(k==1 || k==i)
					System.out.print(i + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
	}
}
