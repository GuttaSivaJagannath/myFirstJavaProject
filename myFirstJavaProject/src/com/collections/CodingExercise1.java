package com.collections;

import java.util.Arrays;
import java.util.Scanner;

// pending in this code
public class CodingExercise1 {
	public boolean areAnagrams(String str1, String str2) {

        if(str1==null||str2==null){
            return false;
        }
        if(str1.length()!=str2.length()){
            return false;
        }
        String str1toLowerCase=str1.toLowerCase();
        String str2toLowerCase=str2.toLowerCase();

        char[] str1char=str1toLowerCase.toCharArray();
        char[] str2char=str2toLowerCase.toCharArray();

        Arrays.sort(str1char);
        Arrays.sort(str2char);

		return Arrays.equals(str1char, str2char);
    }

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the String1 : ");
		String str1 = scnr.next();
		System.out.println("Enter the String2 : ");
		String str2 = scnr.next();

}
}
