package lab_practice;
import java.util.Scanner;
import java.io.*;

public class P2_Sum_100 {
	public static void main(String args[]) {
		int a,sum=0;
		for(a=0;a<=100;a++)
			sum=sum+a;
		System.out.println("The sum of first 100 numbers : " + sum);
	}
}
