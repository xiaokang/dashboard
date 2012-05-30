package com.github.xiaokang;

public class TestReplace {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String src = "/baidu/ns/mirror/webpage/ns-mirror-webpage-data/20100527/tc-mirror00.tc/home/www/web/wa.baidu.com/shaoer/works/(100.jpg";
    String dest="/user/work/.Trash/Current/(100).jpg";
    String overwrite = "/baidu/ns/mirror/webpage/ns-mirror-webpage-data/20100527/tc-mirror00.tc/home/www/web/wa.baidu.com/shaoer/works/(100.jpg"; 
    String replaceBy = "/user/work/.Trash/Current/[100].jpg";
    System.err.println(src);
    System.err.println(overwrite);
    System.err.println(replaceBy);
    System.err.println(src.replaceFirst(overwrite, replaceBy));
  }

}
