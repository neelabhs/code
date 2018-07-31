package com.neel.misc;

public class RemoveDups {

	public static void main(String[] args) {
		char[] carr= {'a','b','c','d','c','e','c'};
		removeDuplicates(carr);
		for(char c:carr) {
			System.out.print(c+" ");
		}
	}

	public static void removeDuplicates(char[] str) {
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;

		int tail = 1;

		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j]) break;
			}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}
		}
		str[tail] = 0;
	}

}
