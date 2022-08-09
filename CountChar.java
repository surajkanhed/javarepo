package com.string;

//WAP to calculate character count
public class CountChar {

	public static void main(String[] args) {
		int count;
		String str = "PLPPQYQRRRSRRR";
		char crr[] = new char[str.length()];
		
		crr = str.toCharArray();
		/* for (int i = 0; i < str.length(); i++) {
			crr[i] = str.charAt(i);  } */
		
		for (int i = 0; i < crr.length; i++) {
			count = 1;
			for (int j = i + 1; j < crr.length; j++) {
				if (crr[i] == crr[j]) {
					count++;
					crr[j] = '0';
				}
			}
			if (crr[i] != '0') {
				System.out.println("count of " + crr[i] + " is " + count);
			}
		}
	}
}
hello guys
