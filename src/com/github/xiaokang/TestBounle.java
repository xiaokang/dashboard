package com.github.xiaokang;

import java.util.ResourceBundle;

public class TestBounle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ResourceBundle rb1 = ResourceBundle.getBundle("bundle");
		ResourceBundle rb2 = ResourceBundle.getBundle("bundle");
		System.out.println(rb1.getString("key"));
		System.out.println(rb2.getString("key"));
		System.out.println(rb1.getString("key") == rb2.getString("key"));
		System.out.println(rb1.getString("key").equals(rb2.getString("key")));
		System.out.println(rb1 == rb2);
	}

}
