package week01;

import java.util.Scanner;

public class Q1_Increment {

	public static void main(String[] args) {
		
		int x=4;
		x++;//5
		
		x+=x;//x=x+x=10
		
		--x;//9
		
		x=7+x;//16
		
		x*=x;//x=x*x=16*16=256
		
		x-=3;//x=256=3=253
		
		System.out.println("x=" +x);//253
		
		
		
		int a=3;
		double d=4.5;
		
		d+=a;// d=d+a==> d=4.5+3=7.5
		
		a+=d;// a=a+d==> a=3+7.7=10.5==> int a=10
		
		d-=a;//d=d-a==>  d=7.5-10=-2.5
		
		a-=d;//a=a-d==>  a=10-(-2.5)=12.5==> int a=12
		
		System.out.println("d=" +  ++d);//-1.5
		
		System.out.println("a=" + a--);//10

	}
	
	

	
	
}

