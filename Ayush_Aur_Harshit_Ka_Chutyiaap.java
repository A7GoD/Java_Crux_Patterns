package Lecture1.Assignment1;
import java.util.Scanner;

public class Ayush_Aur_Harshit_Ka_Chutyiaap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int a,b,ans=0,Akephone=1,Hkephone=0;
		for(int i=1 ; i<=N ; ++i)
		{
			ans=0;
			a = s.nextInt();
			b = s.nextInt();
			while(ans==0)
			{
				Hkephone+=Akephone+1;
				if(Hkephone>b)
				{
					ans=1;
					System.out.println("Aayush");
					break;
				}
				Akephone+=Hkephone+1;
				if(Akephone>a)
				{
					ans=1;
					System.out.println("Harshit");
					break;
				}
			}
			Akephone=1;
			Hkephone=0;
		}
	}
}
