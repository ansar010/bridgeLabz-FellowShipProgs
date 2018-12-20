/**
 * purpose : To create matrix type 2D array and write elements in txt file \
 * 
 * @author Ansar
 * @version 1.2
 * @since 18/12/2018
 */
package com.fellowship.functional;
import com.fellowship.utilities.Utilities;
public class TwoDimArr
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter the Number of rows");
		int row=Utilities.getInt();
		System.out.println("Enter the Number of Columns");
		int col=Utilities.getInt();
		
		// Calling method to write elements in the form of 2D Array
		Utilities.TwoDArr(row, col);
		
	}
}
