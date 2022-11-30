package metodi;

import java.util.Scanner;

public class trapec {
	static double tr1 (double a,double b,double h)
	{   double S=((a+b)*h)/2;
		return S;
	}
	static void tr2(double a,double b,double h) 
	{
		double S=((a+b)*h)/2;
		System.out.println(S);
	}

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		double a = inp.nextDouble();
		double b = inp.nextDouble();
		double h = inp.nextDouble();
		System.out.println(tr1(a,b,h));
	    tr2(a,b,h);
	}
}
