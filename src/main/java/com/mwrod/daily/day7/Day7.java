package com.mwrod.daily.day7;

/**
 * Problem: Given the mapping a = 1, b = 2, ... z = 26, and an 
 *  encoded message, count the number of ways it can be decoded.
 * 
 * Example: The message '111' would give 3, since it could be 
 *  decoded as 'aaa', 'ka', and 'ak'.
 * 
 * You can assume that the messages are decodable. For example, 
 * '001' is not allowed.
 */
public class Day7 {
	
	/**
	 * Approach with dynamic programming, where we store
	 * the results of every subtask to count all ways
	 * of decoding the given encoded message. <br>
	 * 
	 * Time Complexity: O(n) <br>
	 * Space Complexity: O(n)
	 * 
	 * @param message Encoded message
	 * @return Count of ways the message can be decoded
	 */
	public int countDecodePossibilitesDP(String message) {
		int[] ways = new int[message.length() + 1];
		ways[0] = 1;
		ways[1] = 1;
		
		for(int i = 2; i <= message.length(); i++) {
			// convert to a two digit number
			int twoDigit = Integer.valueOf("" + message.charAt(i - 2) + message.charAt(i - 1));
			
			if(twoDigit < 27) {
				// two paths if two digit number if less than 27
				ways[i] = ways[i - 1] + ways[i - 2];
			} else {
				// only 1 path for 1 digit
				ways[i] = ways[i - 1];
			}
		}
		return ways[message.length()];
	}
	
	/**
	 * Recursive approach to count all ways of decoding the
	 * given encoded message. <br>
	 * 
	 * Time Complexity: O(2^n) <br>
	 * Space Complexity: O(1)
	 * 
	 * @param message Encoded message
	 * @return Count of ways the message can be decoded
	 */
	public int countDecodePossibilitesRecursive(String message) {
		return decodeCountRecursive(message, 0);
	}
	
	private int decodeCountRecursive(String msg, int startingIndex) {
		// end of sequence
		if(msg.length() == startingIndex || msg.length() - 1 == startingIndex) {
			return 1;
		}
		
		// convert to a two digit number
		int twoDigit = Integer.valueOf("" + msg.charAt(startingIndex) + msg.charAt(startingIndex + 1));
		
		if(twoDigit < 27) {
			// two paths if two digit number if less than 27
			return decodeCountRecursive(msg, startingIndex + 1) 
					+ decodeCountRecursive(msg, startingIndex + 2);
		} else {
			// only 1 path for 1 digit
			return decodeCountRecursive(msg, startingIndex + 1);
		}
	}
}
