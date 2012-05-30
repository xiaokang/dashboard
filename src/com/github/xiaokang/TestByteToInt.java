package com.github.xiaokang;

public class TestByteToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte b = -1;
		byte b0 = 0;
		byte b1 = -2;
		byte b2 = 2;
		byte b3 = 3;
		byte b4 = (byte)0x00;
		byte b5 = (byte)0xff;
		int i = b;
		System.out.println("i = " + i);
		System.out.println(b0 > b);
		System.out.println(b1 > b);
		System.out.println(b2 > b3);
		System.out.println(b4);
		System.out.println(b5);
		int i4 = b4 & 0xff;
		int i5 = b5 & 0xff;
		System.out.println(b4 > b5);
		System.out.println(i4 > i5);
	}

}
