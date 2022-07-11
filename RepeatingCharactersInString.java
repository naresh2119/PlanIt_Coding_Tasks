package NareshPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingCharactersInString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String str = input.nextLine();
		
		//removing white spaces from string if any and making all lower cases:
		str = str.replaceAll("\\s", "");
		str = str.toLowerCase();
		char reslt = repeatCharCount(str);
		System.out.println("The most occuring character in string is: "+ reslt);
	}
	
public static char repeatCharCount(String str) {
	
	char curChar = ' ';
	int prevCount = 1;
	
	//converting string to char array
	char[] charArray = str.toCharArray();
	

	for(int i=0;i<charArray.length;i++) {
		int curCount = 1;
		for(int j=i+1;j<charArray.length;j++) {
			if(charArray[i]==charArray[j])
				curCount++;
			if(curCount>prevCount) {
				curChar = charArray[i];
				prevCount = curCount;
				}
		}
	}
	
return curChar;
}
}
