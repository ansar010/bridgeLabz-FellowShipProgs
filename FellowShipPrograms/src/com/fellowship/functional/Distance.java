/**
 * purpose : To calculate Euclidean distance
 * 
 * @author Ansar
 * @version 1.2
 * @since 19/12/2018
 */
package com.fellowship.functional;

import com.fellowship.utilities.Utilities;

public class Distance 
{
	public static void main(String[] args)
	{	// Command Line arguments 
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		Utilities.euclideanDistance(x,y);

	}
}
