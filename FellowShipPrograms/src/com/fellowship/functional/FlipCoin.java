/**
 * Purpose : To Flip Coin and Calculate Percentage
 * 
 * @author Ansar
 * @version 1.2
 * @since 15/12/2018
 */
package com.fellowship.functional;
import java.util.Scanner;
import com.fellowship.utilities.Utilities;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of times You want to flip Coin..");
		int n = sc.nextInt();  // n-> Number of time user want to flip coin
		Utilities.flipCoin(n); // calling method to flip coin and calculate percentage
		sc.close();
	}
}
