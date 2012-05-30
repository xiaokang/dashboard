package com.github.xiaokang;

import java.net.URI;
import java.net.URISyntaxException;

public class TestURI {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		URI uri = new URI("hdfs://namenode-v.baidu.com:50030/user/app/test.txt");
		printURI(uri);
		uri = new URI("file:///home/xiaokang/test.txt");
		printURI(uri);
		uri = new URI("http://www.baidu.com/index.php?w=work");
		printURI(uri);
		uri = new URI("ftp://user@ftp.edu.cn:2121/pub/file.gz");
		printURI(uri);
	}
	
	static void printURI(URI uri){
		System.out.println("##########");
		System.out.println("uri : " + uri.toString());
		System.out.println("scheme : " + uri.getScheme());
		System.out.println("schema spec part : " + uri.getSchemeSpecificPart());
		System.out.println("authority : " + uri.getAuthority());
		System.out.println("userinfo : " + uri.getUserInfo());
		System.out.println("host : " + uri.getHost());
		System.out.println("port : " + uri.getPort());
		System.out.println("path : " + uri.getPath());
		System.out.println("query : " + uri.getQuery());
		System.out.println("frag : " + uri.getFragment());
		System.out.println();
	}

}
