package com.github.xiaokang;

public class Cacl {

  /**
   * @param args
   */
  public static void main(String[] args) {
    double[] percent = new double[]{
        26.27, // getFileInfo()
        22.23, // sendHeartbeat()
         5.89, // getBlockLocations()
         2.75, // create()
         3.39, // addBlock2()
         8.27, // blockReceived()
         3.06, // complete()
         0.02, // blockReport()
    };
    
    int[] opsOld = new int[]{ // ops * 10
        420000, // getFileInfo()
        360000, // sendHeartbeat()
        450000, // getBlockLocations()
         92000, // create()
        150000, // addBlock2()
         70000 * 3, // blockReceived()
        180000, // complete()
            57, // blockReport()
    };
    
    int[] opsOpt = new int[]{ // ops * 10
        420000, // getFileInfo()
        650000, // sendHeartbeat()
        450000, // getBlockLocations()
         99000, // create()
        150000, // addBlock2()
         77000 * 3, // blockReceived()
        230000, // complete()
           102, // blockReport()
    };
    
    int[] opsOld2 = new int[]{ // ops * 10
        420000, // getFileInfo()
        340000, // sendHeartbeat()
        360000, // getBlockLocations()
         91000, // create()
         64000, // addBlock2()
         46000 * 3, // blockReceived()
        140000, // complete()
            50, // blockReport()
    };
    
    int[] opsOpt2 = new int[]{ // ops * 10
        420000, // getFileInfo()
        610000, // sendHeartbeat()
        450000, // getBlockLocations()
         91000, // create()
         72000, // addBlock2()
         53000 * 3, // blockReceived()
        170000, // complete()
            90, // blockReport()
    };
    
    double old = 0;
    double old2 = 0;
    double opt = 0;
    double opt2 = 0;
    double sum = 0;
    for(int i = 0; i < percent.length; i++){
      sum += percent[i];
    }
    for(int i = 0; i < percent.length; i++){
      old = old + ((percent[i])/ (opsOld[i]));
      old2 = old2 + ((percent[i])/ (opsOld2[i]));
      opt = opt + ((percent[i])/ (opsOpt[i]));
      opt2 = opt2 + ((percent[i])/ (opsOpt2[i]));
    }
    old = old / 9;
    old2 = old2 / 9;
    opt = opt / 9;
    opt2 = opt2 / 9;
    
    System.err.println(sum);
    System.err.println("old = " + old + ", opt = " + opt);
    System.err.println("old / opt = " + old / opt);
    System.err.println(1/old + " " + 1/old2 + " " + 1/opt + " " + 1/opt2);
    System.err.println(1/old/833.3 + " " + 1/old2/833.3 + " " + 1/opt/833.3 + " " + 1/opt2/833.3);

  }

}
