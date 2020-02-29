/**
 * 
 */
package com.drr;

import java.awt.SystemTray;
import java.util.stream.IntStream;

/**
 * @author rdandu
 *
 */
public class javaStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//IntStream.range(1, 10).forEach(System.out::println); //  still 1 to 9 only
		
		int[] i = {1,2,3,4,5};
		
		//IntStream.of(i).forEach(System.out::println); // converting int array to stream
		
		System.out.println(IntStream.of(i).max().getAsInt());
		
		//IntStream.rangeClosed(1, 10).forEach(System.out::println); // upto 1 to 10

	}

}
