package com.github.xiaokang;

public class TestEnum {

	public enum Color{
		BLUE,
		RED,
		YELLOW
	}
	
	public String getRed(){
		return Color.RED.toString();
	}
	
	/**
	 * 
	 * 测试目的：确认在一个类中同一个enum的.name() .toString()是否总是返回同一个常量String，而不是内容相同的新建String
	 * 
	 * 结论：输出全为true，说明Color.BLUE返回的是同一个常量String
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String name1 = Color.BLUE.name();
		String name2 = Color.BLUE.name();
		String string1 = Color.BLUE.toString();
		String string2 = Color.BLUE.toString();
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));
		System.out.println(string1 == name1);
		System.out.println(string1.equals(name1));
	}

}
