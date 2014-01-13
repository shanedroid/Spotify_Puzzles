//*******************************************************************
//  Reversed_Binary_Numbers.java       Author: Shane Kirk
//
//  Program for reversing numbers in binary. 
// 
//*******************************************************************
import java.util.Scanner;
public class reversebinary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println ("INPUT:");
		int n = scan.nextInt();
		String dectobi = "";
		while(n>0){
			int i = n % 2;
			dectobi += i;
			n /= 2;
			}
		int output = Integer.parseInt(dectobi, 2);
		System.out.println ("OUTPUT:" + output);
	}
}


