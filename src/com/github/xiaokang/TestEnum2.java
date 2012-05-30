package com.github.xiaokang;

import com.github.xiaokang.TestEnum.Color;

public class TestEnum2 {

	/**
	 * 测试目的：测试不同的类中是否相同
	 * 
	 * 结论：输出全为true，说明相同
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TestEnum e = new TestEnum();
		System.out.println(e.getRed() == Color.RED.toString());
		System.out.println(e.getRed() == Color.RED.name());
	}

}
