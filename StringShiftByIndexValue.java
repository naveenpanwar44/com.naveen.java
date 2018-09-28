package com.maventic.secondfloor;

public class StringShiftByIndexValue {

	public static void main(String[] args) {
		String beforeEncrypt = "hello zzzz", afterEncrypt;
		afterEncrypt = encryptString(beforeEncrypt);
		System.out.println("Before Encrypt: " + beforeEncrypt
				+ " After Encrypt: " + afterEncrypt);
	}

	public static String encryptString(String phrase) {
		String[] arrStr = phrase.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String s : arrStr) {
			char[] cArr = s.toCharArray();
			int len = cArr.length, currPos = 1;
			for (char c : cArr) {
				int charac = (c + (len - currPos++));
				int val = charac > 122 ? (charac % 122 + 96) : charac;
				sb.append((char) val);
			}
			sb.append(" ");
		}
		return sb.toString();
	}
}