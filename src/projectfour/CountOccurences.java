package projectfour;

import java.io.*;

public class CountOccurences {
 
	static int countOccurrences(String str, String word) {
    
		String a[] = str.split(" ");
 
		int count = 0;
		for (int i = 0; i < a.length; i++) {
    
			if (word.equals(a[i]))
				count++;
		}
 
		return count;
	}
 

	public static void main(String args[]) {
		String str = "In the beginning God created the heavens and the earth";
		String word = "the";
		System.out.println(countOccurrences(str, word));
	}
}
