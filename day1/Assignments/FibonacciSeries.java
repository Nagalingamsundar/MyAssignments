package week1.day1.Assignments;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8,firstNum=0,secNum=1;
		System.out.print("The first number  is " +firstNum+" "+secNum);
		for(int i=2;i<=range;i++) {
			int sum=firstNum + secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.print(" "+sum);
		}
		

	}

}
