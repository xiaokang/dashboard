package com.github.xiaokang;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

public class TestJVMArgs {

  /**
   * @param args
   */
  public static void main(String[] args) {
    RuntimeMXBean RuntimemxBean = ManagementFactory.getRuntimeMXBean();
    List<String> list = RuntimemxBean.getInputArguments();

    for(int i=0;i<list.size();i++) {
        System.out.println(list.get(i)); 
    }
  }

}
